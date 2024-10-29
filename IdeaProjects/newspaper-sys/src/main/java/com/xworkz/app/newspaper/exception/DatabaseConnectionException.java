package com.xworkz.app.newspaper.exception;

public class DatabaseConnectionException extends Exception {
    public DatabaseConnectionException(String errorMessage) {
        System.out.println((errorMessage));
    }
}
