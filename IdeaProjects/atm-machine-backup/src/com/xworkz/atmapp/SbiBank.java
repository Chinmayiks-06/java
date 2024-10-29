package com.xworkz.atmapp;

//implementation class
public class SbiBank implements Card{

    @Override
    public void swipe() {
        System.out.println("SBI card is swiped");
    }
}
