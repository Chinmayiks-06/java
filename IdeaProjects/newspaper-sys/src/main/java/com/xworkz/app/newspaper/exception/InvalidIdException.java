package com.xworkz.app.newspaper.exception;

public class InvalidIdException extends RuntimeException {
    public InvalidIdException(String errorMessage) {
        System.out.println((errorMessage));
    }
}
