package com.xworkz.insuranceapp.bike;

import com.xworkz.insuranceapp.insurance.Insurance;

public class BikeInsurance extends Insurance {

    @Override
    public void provideClaim(){
        System.out.println("claim with premium amount as 8000 for Bike insurance policy");
    }
}
