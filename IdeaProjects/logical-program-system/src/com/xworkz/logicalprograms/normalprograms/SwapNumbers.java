package com.xworkz.logicalprograms.normalprograms;

public class SwapNumbers {
    public static void main(String[] args) {
    //using third variable
        int a=25;
        int b=26;
        int c=3;
        System.out.println("value of variable before swapping: "+b+" "+c);
        c=a;
        a=b;
        b=c;
        System.out.println("value of variable after swapping: "+b+" "+c);
        //without using third variable
        int x=10;
        int y=20;
        System.out.println("Before swapping: "+x+" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping: "+x+" "+y);


    }
}
