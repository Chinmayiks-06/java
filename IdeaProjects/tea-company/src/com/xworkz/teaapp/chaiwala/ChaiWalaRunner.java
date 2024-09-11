package com.xworkz.teaapp.chaiwala;

public class ChaiWalaRunner {

    public static void main(String[] args) {

        ChaiWala chaiWala=new ChaiWala();
        chaiWala.setId(1);
        chaiWala.setChaiName("Tea Point");
        chaiWala.setPrice(20.00);
        chaiWala.setQauntity("20 ML");

        System.out.println(chaiWala);

        ChaiWala chaiWala1=new ChaiWala();
        chaiWala1.setId(1);
        chaiWala1.setChaiName("Tea circle");
        chaiWala1.setPrice(12.00);
        chaiWala1.setQauntity("30 ML");

        System.out.println(chaiWala1);

        ChaiWala chaiWala2=new ChaiWala();
        chaiWala2.setId(3);
        chaiWala2.setChaiName("Samruddi");
        chaiWala2.setPrice(15.00);
        chaiWala2.setQauntity("20 ML");

        System.out.println(chaiWala2);

        System.out.println("Chaiwala hashcode id is: "+chaiWala.hashCode());
        System.out.println("chaiwala1 hashcode id is: "+chaiWala1.hashCode());
        System.out.println("chaiwala2 hashcode id is: "+chaiWala2.hashCode());

//using equals(Object ob) method here....
    boolean isEqual=chaiWala.equals(chaiWala1);
        System.out.println(isEqual);
    }

}
