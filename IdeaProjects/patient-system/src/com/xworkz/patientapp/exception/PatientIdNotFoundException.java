package com.xworkz.patientapp.exception;

public class PatientIdNotFoundException extends RuntimeException{

    public PatientIdNotFoundException(String errorMessage){
        System.out.println((errorMessage));
    }
}
