package com.xworkz.laptopapp;

public class Laptop {

    static int dellPrice = 55000;
    static int hpPrice = 54000;
    static int keyBord = 800;

    static String laptopName;
    static String laptopPrice;


    public static int getDetails(String laptop, boolean offer) {
        int totalPrice = 0;
        if (laptop == "HP") {
            if (offer == true) {
                totalPrice = hpPrice - keyBord;
                return totalPrice;
            } else {
                totalPrice = hpPrice;
                return totalPrice;
            }
        }
        if (laptop == "Dell") {
            if (offer == true) {
                totalPrice = dellPrice - keyBord;
                return totalPrice;
            } else {
                totalPrice = dellPrice;
                return totalPrice;
            }
        }
        return totalPrice;
    }
}