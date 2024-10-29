package com.xworkz.app.FunctionalInterface;

public class OperationRunner {
    public static void main(String[] args) {

        int a[]={12,23,45,36,56};
        Operation op = arr ->{
            for (int value:arr){
                if (value %2==0)
                    System.out.println(value);
            }
        };
        op.even(a);
    }
}
