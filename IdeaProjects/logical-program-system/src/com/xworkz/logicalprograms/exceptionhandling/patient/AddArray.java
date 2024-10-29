package com.xworkz.logicalprograms.exceptionhandling.patient;

public class AddArray {
    public static void main(String[] args) {
        System.out.println("main started");

        Class<Patient>patient=null;
//forName()--9ito get class reference
        try {
            patient=(Class<Patient>) Class.forName("com.xworkz.logicalprograms.exceptionhandling.patient");
        }catch (ClassNotFoundException e){
            System.out.println("no class found");
        }

        System.out.println("main ended");
    }
}
