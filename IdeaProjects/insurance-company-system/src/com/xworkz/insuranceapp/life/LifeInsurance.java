package com.xworkz.insuranceapp.life;

import com.xworkz.insuranceapp.insurance.Insurance;

public class LifeInsurance extends Insurance {
    @Override
    public void provideClaim(){
        System.out.println("claim with premium amount as 2300 for life insurance policy");
    }
}
