package com.xworkz.engapp;

import com.xworkz.engapp.cs.CsEngineer;
import com.xworkz.engapp.ec.EcEngineer;
import com.xworkz.engapp.engineer.Engineer;

public class EngineerRunner {

    public static void main(String[] args) {
        System.out.println("main started");

        Engineer engineer=new EcEngineer();
        engineer.solveProblem();

        Engineer engineer1=new CsEngineer();
        engineer1.solveProblem();

        System.out.println("main started");
    }
}
