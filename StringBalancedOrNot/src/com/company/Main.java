package com.company;

import javax.swing.tree.TreeNode;
import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++) {
            String inputString = scan.nextLine();
            scan.next();
            int maxReplacement = scan.nextInt();
            arr[i] = countMinreversals(inputString, maxReplacement);

            System.out.println(arr[0]);
            int x=5;
            int y=3;
            System.out.println(x/y);
        }


    }

    public static int countMinreversals(String expr, int maxReplacement ) {
        int i = 0, len = expr.length();
        int adds = 0;
        while (i < len) {
            if (expr.charAt(i) == '<') {
                if (expr.charAt(i + 1) != '>') {
                    adds++;
                    i++;
                } else {
                    i = i + 2;
                }
            } else if (expr.charAt(i) == '>') {
                adds++;
                i++;
            }
        }
        if(adds==maxReplacement){
            return 1;
        }
        else {
            return 0;
        }
    }
}



