package com.xworkz.app.newspaper.exception;

public class LanguageNotSupportedException extends RuntimeException{
    public LanguageNotSupportedException(String errorMessage) {
        System.out.println((errorMessage));
    }
}
