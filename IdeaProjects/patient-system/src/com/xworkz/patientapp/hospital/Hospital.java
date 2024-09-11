package com.xworkz.patientapp.hospital;

import com.xworkz.patientapp.patient.Patient;

public interface Hospital {

    boolean addPatient(Patient patient);
    boolean getPatient();
    boolean updatePatientAge(int newAge);
    boolean deletePatient();

}
