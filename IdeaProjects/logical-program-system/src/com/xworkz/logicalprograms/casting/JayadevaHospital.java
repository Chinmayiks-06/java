package com.xworkz.logicalprograms.casting;

public class JayadevaHospital extends Hospital {

    @Override
    public double doBusiness(){
        System.out.println("Education");
        return 800000.00;
    }

    public double sideBusiness(){
        System.out.println("Stock market");
        return 54674.00;
    }

    public static void main(String[] args) {

//run time polymorphism
        //upcasting
        Hospital hospital=new JayadevaHospital();
        System.out.println(hospital.doBusiness());
        //down casting
        JayadevaHospital jayadevaHospital=(JayadevaHospital) hospital;
        System.out.println(jayadevaHospital.sideBusiness());

    }
}
