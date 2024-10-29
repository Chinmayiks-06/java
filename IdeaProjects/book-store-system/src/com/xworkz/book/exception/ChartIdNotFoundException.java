package com.xworkz.book.exception;

public class ChartIdNotFoundException extends RuntimeException{
    public ChartIdNotFoundException(String errorMessage){
        System.out.println((errorMessage));
    }
}
