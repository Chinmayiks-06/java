package com.xworkz.patientapp.state;

public class State {
    public String stateName;

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public void getStateName() {
        System.out.println("State Name: " + this.stateName);
    }
}
