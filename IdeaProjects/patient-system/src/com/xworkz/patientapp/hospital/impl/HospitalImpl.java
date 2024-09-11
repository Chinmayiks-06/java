package com.xworkz.patientapp.hospital.impl;

import com.xworkz.patientapp.hospital.Hospital;
import com.xworkz.patientapp.patient.Patient;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class HospitalImpl implements Hospital {

    Patient patient;
    @Override
    public boolean addPatient(Patient patient) {
        boolean isAdded=false;
        if(patient !=null){
            if(patient.getPatientId() > 0){
                this.patient=patient;
                isAdded=true;
            }
        }
        return isAdded;
    }

    @Override
    public boolean getPatient(){
        System.out.println(patient);
        return true;
    }

    @Override
    public boolean updatePatientAge(int newAge) {
        if (this.patient != null && newAge > 0) {
            this.patient.setPatientAge(newAge);
            return true;
        }
        return false;
    }

    @Override
    public boolean deletePatient() {
        if (this.patient != null) {
            this.patient = null;
            return true;
        }
        return false;
    }


}



