package com.xworkz.travelapp;

import com.xworkz.travelapp.contract.RedBusContract;
import com.xworkz.travelapp.orangeimpl.OrangeImplementation;
import com.xworkz.travelapp.travelagency.TravelAgency;

public class TravelRunner {

    public static void main(String[] args) {

        TravelAgency travelAgency=new TravelAgency();

        //Abstraction--implementation object class reference
        RedBusContract redBusContract=new OrangeImplementation();
        travelAgency.booking(redBusContract);

        System.out.println("Number of ticket booking is " +redBusContract.tickets());


    }
}
