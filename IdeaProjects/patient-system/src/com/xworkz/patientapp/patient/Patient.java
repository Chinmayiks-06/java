package com.xworkz.patientapp.patient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Patient {

    private int patientId;
    private String patientName;
    private int patientAge;
    private String address;

}
