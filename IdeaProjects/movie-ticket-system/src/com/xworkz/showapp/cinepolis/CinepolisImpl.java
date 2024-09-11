package com.xworkz.showapp.cinepolis;

import com.xworkz.showapp.bookmyshow.BookMyShow;
import com.xworkz.showapp.pvr.PvrImpl;

public class CinepolisImpl implements BookMyShow{


    @Override
    public int minBooking() {
        System.out.println("Cinepolis address is:"+BookMyShow.address);
        return 56;
    }
}
