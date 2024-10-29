package com.xworkz.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class DiseaseNames {
    public static void main(String[] args) {
        Collection<String> infectiousDiseases = new ArrayList<>();
        infectiousDiseases.add("Tuberculosis");
        infectiousDiseases.add("Malaria");
        infectiousDiseases.add("HIV/AIDS");
        infectiousDiseases.add("Influenza");
        infectiousDiseases.add("COVID-19");

        Collection<String> geneticDisorders = new ArrayList<>();
        geneticDisorders.add("Cystic Fibrosis");
        geneticDisorders.add("Down Syndrome");
        geneticDisorders.add("Sickle Cell Anemia");
        geneticDisorders.add("Huntington's Disease");
        geneticDisorders.add("Hemophilia");

        Collection<String> autoimmuneDiseases = new ArrayList<>();
        autoimmuneDiseases.add("Rheumatoid Arthritis");
        autoimmuneDiseases.add("Lupus");
        autoimmuneDiseases.add("Multiple Sclerosis");
        autoimmuneDiseases.add("Type 1 Diabetes");
        autoimmuneDiseases.add("Celiac Disease");

        infectiousDiseases.addAll(geneticDisorders);

     infectiousDiseases.remove("Down Syndrome");
        autoimmuneDiseases.clear();

        boolean isAvailable = infectiousDiseases.contains("Malaria");
        System.out.println("Is Malaria in infectious diseases? " + isAvailable);

        boolean isItContainsAll = infectiousDiseases.containsAll(geneticDisorders);
        System.out.println("Does infectiousDiseases contain all geneticDisorders? " + isItContainsAll);

        System.out.println("Number of diseases in autoimmuneDiseases: " + autoimmuneDiseases.size());

        Iterator<String> itr = infectiousDiseases.iterator();
        System.out.println("Infectious Diseases:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
