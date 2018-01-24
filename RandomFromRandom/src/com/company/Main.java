package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main main=new Main();
       for(int i=0;i<15;i++){
           System.out.println(Math.ceil(main.rand5()+ main.rand2()));
       }

    }
    public double rand5(){
        double randUnceil=Math.random()*5;
        double rand= Math.ceil(randUnceil);
//        System.out.println(randUnceil);
//        System.out.println(rand);
        return rand;
    }
    public double rand2(){
        double randUnceil=Math.random()*5;
        double randby2= (randUnceil/5)*2;
        return randby2;
    }

    //efficient way of writing a random7 from random5

}
