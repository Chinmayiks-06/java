package com.xworkz.insuranceapp.car;

import com.xworkz.insuranceapp.insurance.Insurance;

public class CarInsurance extends Insurance {

    @Override
    public void provideClaim(){
        System.out.println("claim with premium amount as 15000 for Car insurance policy");
    }

}
