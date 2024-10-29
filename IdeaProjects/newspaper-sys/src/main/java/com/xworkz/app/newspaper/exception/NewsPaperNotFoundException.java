package com.xworkz.app.newspaper.exception;

public class NewsPaperNotFoundException extends Exception{

    public NewsPaperNotFoundException(String errorMessage) {
        System.out.println((errorMessage));
    }
}
