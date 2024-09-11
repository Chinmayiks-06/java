package com.xworkz.credapp.dao;

import com.xworkz.credapp.dto.CardDto;

public class CardDao {

    public void getCardDetails(CardDto dt) {
        System.out.println("Card Number: " + dt.getCardNumber());
        System.out.println("Card Id: " + dt.getCardId());
        System.out.println("Card Holder Name: " + dt.getCardHoldername());
        System.out.println("Cvv is: " + dt.getCvv());
        System.out.println("Expiry date is: " + dt.getExpiryDate());
    }
}
