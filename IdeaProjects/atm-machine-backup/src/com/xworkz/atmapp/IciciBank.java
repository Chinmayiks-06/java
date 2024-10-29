package com.xworkz.atmapp;

//Icici bank is a Implementation class
public class IciciBank implements Card{
    @Override
    public void swipe() {
        System.out.println("icici bank card is swiped");
    }
}
