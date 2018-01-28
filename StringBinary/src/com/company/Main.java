package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String bin= "11011000";
       String returnBin= largestMagical(bin);
       System.out.println(returnBin);
    }
    public static String largestMagical(String str) {
        int length = str.length();
        int charIdx = 0;
        while (charIdx < length) {
            ArrayList<int[]> magicalList = findMagicalStr(str, charIdx);
            int lengthMagicalList = magicalList.size();
            if (lengthMagicalList != 0) {
                String maxStr = str;
                for (int i = 0; i < lengthMagicalList - 1; i++) {
                    for (int j = i + 1; j < lengthMagicalList; j++) {
                        int inter2[] = { magicalList.get(i)[1] + 1, magicalList.get(j)[1] };
                        for (int k = i; k >= 0; k--) {
                            int inter1[] = { magicalList.get(k)[0], magicalList.get(i)[1] };
                            String strSwap = swapString(inter1, inter2, str);
                            if (strSwap.compareTo(maxStr) > 0) {
                                maxStr = strSwap;
                            }
                        }
                    }
                }
                str = maxStr;
            }
            charIdx++;
        }

        return str;
    }

    public static String swapString(int inter1[], int inter2[], String curStr) {
        return curStr.substring(0, inter1[0]) + curStr.substring(inter2[0], inter2[1] + 1)
                + curStr.substring(inter1[0], inter1[1] + 1) + curStr.substring(inter2[1] + 1);
    }

    public static ArrayList<int[]> findMagicalStr(String s, int start) {
        ArrayList<int[]> magicalList = new ArrayList();
        int j = start;
        int length = s.length();
        int numOfZeros = 0;
        int numOfOnes = 0;
        char str[] = s.toCharArray();
        for (int i = start; i < length; i++) {
            if (str[i] == '1') {
                numOfOnes += 1;
            } else {
                numOfZeros += 1;
            }

            if (numOfZeros > numOfOnes) {
                break;
            }
            if (numOfZeros == numOfOnes && numOfZeros != 0) {
                int arr[] = new int[] { j, i };
                magicalList.add(arr);
                j = i + 1;
            }
        }
        return magicalList;
    }
}
