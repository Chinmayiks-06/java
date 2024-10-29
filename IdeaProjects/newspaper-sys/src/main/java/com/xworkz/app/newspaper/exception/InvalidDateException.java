package com.xworkz.app.newspaper.exception;

public class InvalidDateException extends Exception{
    public InvalidDateException(String errorMessage) {
        System.out.println((errorMessage));
    }
}
