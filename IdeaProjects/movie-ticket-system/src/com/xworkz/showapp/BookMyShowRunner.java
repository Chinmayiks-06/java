package com.xworkz.showapp;

import com.xworkz.showapp.bookmyshow.BookMyShow;
import com.xworkz.showapp.paytm.Paytm;
import com.xworkz.showapp.pvr.PvrImpl;

public class BookMyShowRunner {
    public static void main(String[] args) {

        BookMyShow bookMyShow=new PvrImpl();
        bookMyShow.minBooking();

        Paytm paytm=new PvrImpl();
        paytm.CashBack();

    }
}