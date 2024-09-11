package com.xworkz.asianpaintsapp.asianpaints;

public class AsianPaintsRunner {

        public static void main(String[] pnt) {

            AsianPaints paint1 = new AsianPaints();
            paint1.setId(1);
            paint1.setColor("Red");
            paint1.setType("Matte");
            paint1.setPrice(500.00);
            paint1.setQuantity("1 L");

            System.out.println(paint1);

            AsianPaints paint2 = new AsianPaints();
            paint2.setId(2);
            paint2.setColor("Blue");
            paint2.setType("Glossy");
            paint2.setPrice(600.00);
            paint2.setQuantity("2 L");

            System.out.println(paint2);

            AsianPaints paint3 = new AsianPaints();
            paint3.setId(3);
            paint3.setColor("Green");
            paint3.setType("Satin");
            paint3.setPrice(700.00);
            paint3.setQuantity("1.5 L");

            System.out.println(paint3);

            System.out.println("Paint1 hashcode id is: " + paint1.hashCode());
            System.out.println("Paint2 hashcode id is: " + paint2.hashCode());
            System.out.println("Paint3 hashcode id is: " + paint3.hashCode());

            boolean isEqual = paint1.equals(paint2);
            System.out.println(isEqual);
        }

    }
