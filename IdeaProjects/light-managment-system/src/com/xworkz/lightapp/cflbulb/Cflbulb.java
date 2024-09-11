package com.xworkz.lightapp.cflbulb;

import com.xworkz.lightapp.iswitch.Switch;

public class Cflbulb implements Switch {


    @Override
    public void on() {
        System.out.println("Cfl bulb is turned on..");
    }

    @Override
    public void off() {
        System.out.println("Cfl bulb is turned off");

    }
}
