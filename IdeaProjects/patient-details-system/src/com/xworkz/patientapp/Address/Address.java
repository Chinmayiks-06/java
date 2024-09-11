package com.xworkz.patientapp.Address;

import com.xworkz.patientapp.country.Country;

public class Address {

    public Country country;
    public void getAddressDetails(Country country){
        if (country != null) {
            System.out.println("Giving country name...");
            this.country = country;
            this.country.getcountryName(country.state);

        } else {
            System.out.println("Can't display error occured");
        }
    }



}
