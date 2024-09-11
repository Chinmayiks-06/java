package com.xworkz.simapp;

import com.xworkz.simapp.simcard.SimCard;

public class SimCardRunner {

    public static void main(String[] args) {
        SimCard simCard=new SimCard();
        System.out.println("sim Card");
        simCard.authenticate();
    }
}
