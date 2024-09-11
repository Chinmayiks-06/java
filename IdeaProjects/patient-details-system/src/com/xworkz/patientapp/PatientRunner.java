package com.xworkz.patientapp;

import com.xworkz.patientapp.Address.Address;
import com.xworkz.patientapp.country.Country;
import com.xworkz.patientapp.patient.Patient;
import com.xworkz.patientapp.state.State;

public class PatientRunner {

        public static void main(String[] args) {


            Address address=new Address();
            address.getAddressDetails(address.country);

            Patient patient=new Patient();
            patient.getpatientDetails(address);

            Country country = new Country();
            country.countryName = "India";
            country.getcountryName(country.state);

            State state=new State();
            state.stateName="Karnataka";
            state.getStateName();

        }
    }
