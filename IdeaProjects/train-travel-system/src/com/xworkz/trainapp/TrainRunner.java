package com.xworkz.trainapp;

import com.xworkz.trainapp.indianexpress.IndianExpressTrain;
import com.xworkz.trainapp.rajdhaniexpress.RajdhaniExpressTrain;

public class TrainRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        IndianExpressTrain transportation=new IndianExpressTrain();

        System.out.println("The train is arriving");
        transportation.transport();

        RajdhaniExpressTrain transportation1= new RajdhaniExpressTrain();
        transportation1.reTransport();
        transportation1.transport();

        System.out.println("main ended");
    }
}
