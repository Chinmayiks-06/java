package com.xworkz.app.newspaper.exception;

public class EditorNotFoundException extends  Exception{
    public EditorNotFoundException(String errorMessage) {
        System.out.println((errorMessage));
    }
}
