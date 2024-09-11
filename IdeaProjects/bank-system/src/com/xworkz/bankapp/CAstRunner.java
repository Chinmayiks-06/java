package com.xworkz.bankapp;

public class CAstRunner {

    public static void main(String[] args) {

        //implicit primitive type casting
        int i=123;
        double i1=i;
        System.out.println(i1);

        //explicit type casting
        double i2=234;
        int i3=(int)i;
        System.out.println(i3);

        int i4=789;
        byte i5=(byte)i4;
        System.out.println(i5);

        double i6=456;//implicit
        System.out.println(i6);

        byte i7=34;
        long i8=(long) i7;
        System.out.println(i8);
    }
}
