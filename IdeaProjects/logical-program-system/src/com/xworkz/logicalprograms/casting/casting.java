package com.xworkz.logicalprograms.casting;

public class casting {
    public static void main(String[] args) {
        int age =12;

        //implicit type casting or widening
        long i1=age;
        System.out.println(i1);

        double r1=age;
        System.out.println(r1);

        //explicit typecasting or narrowing
        byte i2=(byte) age;
        System.out.println(i2);
    }
}
