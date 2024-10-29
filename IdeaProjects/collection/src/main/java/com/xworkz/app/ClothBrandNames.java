package com.xworkz.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ClothBrandNames {
    public static void main(String[] args) {
            Collection<String> casualWear = new ArrayList<>();
            casualWear.add("Levi's");
            casualWear.add("H&M");
            casualWear.add("Uniqlo");
            casualWear.add("Gap");
            casualWear.add("Zara");

            Collection<String> sportswear = new ArrayList<>();
            sportswear.add("Nike");
            sportswear.add("Adidas");
            sportswear.add("Puma");
            sportswear.add("Under Armour");
            sportswear.add("Reebok");

            Collection<String> luxuryBrands = new ArrayList<>();
            luxuryBrands.add("Gucci");
            luxuryBrands.add("Prada");
            luxuryBrands.add("Louis Vuitton");
            luxuryBrands.add("Chanel");
            luxuryBrands.add("Burberry");

            Collection<String> outdoorWear = new ArrayList<>();
            outdoorWear.add("The North Face");
            outdoorWear.add("Patagonia");
            outdoorWear.add("Columbia");
            outdoorWear.add("Arc'teryx");
            outdoorWear.add("Marmot");

            Collection<String> fastFashion = new ArrayList<>();
            fastFashion.add("Forever 21");
            fastFashion.add("Bershka");
            fastFashion.add("Primark");
            fastFashion.add("Topshop");
            fastFashion.add("New Look");


            casualWear.addAll(fastFashion);
            // Remove an item
            casualWear.remove("Topshop");
            // Clear a collection
            sportswear.clear();

            boolean isAvailable = luxuryBrands.contains("Gucci");
            System.out.println("Is Gucci in luxury brands? " + isAvailable);

            boolean isItContainsAll = casualWear.containsAll(fastFashion);
            System.out.println("Does casualWear contain all fastFashion brands? " + isItContainsAll);

            System.out.println("Number of brands in outdoorWear: " + outdoorWear.size());

           /* System.out.println("-------------------------------------");
            for (String brand : casualWear) {
                Syst\em.out.println(brand);
            }*/

            Iterator<String> itr = luxuryBrands.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }

        }

    }
