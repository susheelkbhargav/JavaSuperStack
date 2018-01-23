package com.company;

public class Main {
    public static int i=1;
    public static void main(String[] args) {
	// write your code here
        String stringnum="a";
        System.out.println("Final ="+Print(stringnum,6));
    }

    public static String Print(String string, int num) {
        if (num <= 0)
            return "";
        if (num == 1)
            return string;

        return Print(string + string, num / 2) +
                Print(string, num % 2);
    }
}
