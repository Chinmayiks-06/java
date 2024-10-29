package com.xworkz.logicalprograms.exceptionhandling;

public class ArthmeticExceptionExample {

    public static void main(String[] args) {
        System.out.println("main started");
        divide(7,0);
        System.out.println("main ended");
    }
    public static void divide(int i, int r){
        System.out.println("divide method started");
        try {
            System.out.println(i/r);
            //more than 1 exception --ArithmeticException e | ArrayIndexOutOfBoundException--
        }catch (ArithmeticException e){
            System.out.println("not defined");
        }
        System.out.println("divide method ended");
    }
}
