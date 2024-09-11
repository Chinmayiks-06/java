package com.xworkz.patientapp;

import com.xworkz.patientapp.hospital.Hospital;
import com.xworkz.patientapp.hospital.impl.HospitalImpl;
import com.xworkz.patientapp.patient.Patient;

public class HospitalRunner {
    public static void main(String[] args) {

        Patient patient = new Patient();
        patient.setPatientId(1);
        patient.setPatientName("Baba");
        patient.setPatientAge(25);
        patient.setAddress("Hassan");

        Hospital hospital = new HospitalImpl();
        System.out.println("Adding patient: " + hospital.addPatient(patient));


        System.out.println("Patient details: " + hospital.getPatient());


        hospital.updatePatientAge(30);
        System.out.println("Updated patient details: " + hospital.getPatient());


        System.out.println("Deleting patient: " + hospital.deletePatient());
        System.out.println("Patient details after deletion: " + hospital.getPatient());
    }
}