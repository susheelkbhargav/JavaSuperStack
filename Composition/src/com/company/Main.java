package com.company;

import com.sun.xml.internal.bind.v2.runtime.output.Pcdata;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions= new Dimensions(2,2,2);
        Case theCase= new Case("Xperia","Dell", "220v", dimensions);
        Resolution nativeresolution= new Resolution(768,1368);
        Monitor monitor= new Monitor("Xperia Monitor","Dell", 1368, nativeresolution);
        Motherboard motherboard= new Motherboard("Xperia MotherBoard","Dell",4,4,"Windows");
        PC thisPc=new PC(theCase,monitor,motherboard);
        thisPc.getMonitor().drawPixel(5,6,"yellow");
        System.out.println(thisPc.getMotherboard().getRamSlots());

    }
}
