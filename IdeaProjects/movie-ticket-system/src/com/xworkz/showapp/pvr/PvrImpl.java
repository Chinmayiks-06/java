package com.xworkz.showapp.pvr;

import com.xworkz.showapp.bookmyshow.BookMyShow;
import com.xworkz.showapp.paytm.Paytm;

public class PvrImpl implements BookMyShow , Paytm {


    @Override
    public int minBooking() {
        System.out.println("The Owner name is: "+ BookMyShow.ownerName);
        return 200;
    }

    @Override
    public int CashBack() {
        System.out.println("CashBack price is:"+BookMyShow.price );
        return 80;
    }
}
