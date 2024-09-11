package com.xworkz.lightapp.tubelight;

import com.xworkz.lightapp.iswitch.Switch;

public class TubeLight implements Switch {


    @Override
    public void on() {
        System.out.println("Tube light is on....");
    }

    @Override
    public void off() {
        System.out.println("Tube Light is off...");
    }
}
