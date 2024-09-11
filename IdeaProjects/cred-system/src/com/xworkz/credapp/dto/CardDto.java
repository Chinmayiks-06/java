package com.xworkz.credapp.dto;

public class CardDto {

    private long cardNumber;
    private int  cardId;
    private String cardHoldername;
    private int cvv;
    private String expiryDate;

    public CardDto(){
        System.out.println("constructor is created");
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardId(int cardId){
        this.cardId=cardId;
    }

    public int getCardId(){
        return cardId;

    }

    public void setCardHoldername(String cardHoldername) {
        this.cardHoldername = cardHoldername;
    }

    public String getCardHoldername() {
        return cardHoldername;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getCvv(){
        return cvv;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}
