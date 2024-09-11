package com.xworkz.lightapp.disco;

import com.xworkz.lightapp.iswitch.Switch;

public class DiscoLight implements Switch {
    @Override
    public void on() {
        System.out.println("Dicso Light is turned on...");
    }

    @Override
    public void off() {
        System.out.println("Dicso Light is turned off...");
    }
}
