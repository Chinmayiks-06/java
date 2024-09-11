package com.xworkz.lightapp;

import com.xworkz.lightapp.cflbulb.Cflbulb;
import com.xworkz.lightapp.disco.DiscoLight;
import com.xworkz.lightapp.iswitch.Switch;
import com.xworkz.lightapp.tubelight.TubeLight;

public class SwitchTester {

    public static void main(String[] args) {
        Switch aSwitch=new DiscoLight();
        aSwitch.on();
        aSwitch.off();
    }
}




