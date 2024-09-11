package com.xorkz.lassiapp.lassishop;

public class LassiShopRunner {

        public static void main(String[] las) {

            LassiShop lassi1 = new LassiShop();
            lassi1.setId(1);
            lassi1.setName("Mango Lassi");
            lassi1.setPrice(50.00);
            lassi1.setQuantity("200 ML");
            lassi1.setFlavors("Mango");

            System.out.println(lassi1);

            LassiShop lassi2 = new LassiShop();
            lassi2.setId(2);
            lassi2.setName("Strawberry Lassi");
            lassi2.setPrice(55.00);
            lassi2.setQuantity("250 ML");
            lassi2.setFlavors("Strawberry");

            System.out.println(lassi2);

            LassiShop lassi3 = new LassiShop();
            lassi3.setId(3);
            lassi3.setName("Sweet Lassi");
            lassi3.setPrice(40.00);
            lassi3.setQuantity("200 ML");
            lassi3.setFlavors("Sweet");

            System.out.println(lassi3);

            System.out.println("Lassi1 hashcode id is: " + lassi1.hashCode());
            System.out.println("Lassi2 hashcode id is: " + lassi2.hashCode());
            System.out.println("Lassi3 hashcode id is: " + lassi3.hashCode());

            boolean isEqual = lassi1.equals(lassi2);
            System.out.println(isEqual);
        }

    }

