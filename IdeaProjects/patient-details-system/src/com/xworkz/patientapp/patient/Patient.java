package com.xworkz.patientapp.patient;

import com.xworkz.patientapp.Address.Address;
import com.xworkz.patientapp.country.Country;
import com.xworkz.patientapp.state.State;

public class Patient{
    public Address address;

    public void getpatientDetails(Address address){
        if (address != null) {
            System.out.println("Giving address...");
            this.address = address;
            this.address.getAddressDetails(address.country);

        } else {
            System.out.println("Can't display error occured");
        }
    }

    }





