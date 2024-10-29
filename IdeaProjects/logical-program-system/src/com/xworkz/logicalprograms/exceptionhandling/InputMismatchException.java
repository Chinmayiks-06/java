package com.xworkz.logicalprograms.exceptionhandling;

import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {

        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the age");
            int age=scanner.nextInt();

        }catch (Exception e){
            System.out.println("please enter in integer");
        }



    }
}
