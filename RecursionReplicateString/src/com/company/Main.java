package com.company;

public class Main {
    public static int i=1;
    public static void main(String[] args) {
	// write your code here
        String stringnum="a";
        System.out.println("Final ="+Print(stringnum,8,stringnum));
    }

    public static String Print(String string,int num, String originalString){
        if(num==1){
            System.out.println("base case called"+ string);
            return string;
        }
        else{
            string= string+string;
            System.out.println(i+""+string);
            i++;
            return Print(string,num/2,originalString);
        }
    }
}
