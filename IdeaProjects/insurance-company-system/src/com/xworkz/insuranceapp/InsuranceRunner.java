package com.xworkz.insuranceapp;

import com.xworkz.insuranceapp.bike.BikeInsurance;
import com.xworkz.insuranceapp.car.CarInsurance;
import com.xworkz.insuranceapp.insurance.Insurance;
import com.xworkz.insuranceapp.life.LifeInsurance;

public class InsuranceRunner {
    public static void main(String[] args) {

        Insurance is=new Insurance();
        is.provideClaim();

        Insurance insurance=new BikeInsurance();
        insurance.provideClaim();

        Insurance insurance1=new CarInsurance();
        insurance1.provideClaim();

        Insurance insurance2=new LifeInsurance();
        insurance2.provideClaim();

    }
}