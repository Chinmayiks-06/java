package com.xworkz.atmapp;

public class BankRunner {
    public static void main(String[] args) {

        //Abstaction
        Card card=new SbiBank();
        card.swipe();

        Card card1=new IciciBank();
        card1.swipe();
    }
}
