package com.xworkz.app;

import com.xworkz.app.FunctionalInterface.Operation;

public class Operation1Runner {
    public static void main(String[] args) {
        int a[]={12,23,45,36,56};
        Operation1 opp = arr ->{
            for (int value:arr){
                if (value %2!=0)
                    System.out.println(value);
            }
        };
       opp.odd(a);
    }
}

