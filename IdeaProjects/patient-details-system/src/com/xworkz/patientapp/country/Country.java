package com.xworkz.patientapp.country;

import com.xworkz.patientapp.state.State;

public class Country {

    public State state;
    public String countryName;

    public void getcountryName(State state) {

        System.out.println("the country name is:" + this.countryName);

    }

}
