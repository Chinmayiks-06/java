package com.xworkz.app;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class MountainNames {
    public static void main(String[] args) {
            Collection<String> famousMountains = new ArrayList<>();
            famousMountains.add("Mount Everest");
            famousMountains.add("K2");
            famousMountains.add("Mount Kilimanjaro");
            famousMountains.add("Mount Fuji");
            famousMountains.add("Denali");

            Collection<String> europeanMountains = new ArrayList<>();
            europeanMountains.add("Mont Blanc");
            europeanMountains.add("Matterhorn");
            europeanMountains.add("Eiger");
            europeanMountains.add("Grossglockner");
            europeanMountains.add("Mount Elbrus");

            Collection<String> volcanicMountains = new ArrayList<>();
            volcanicMountains.add("Mount Vesuvius");
            volcanicMountains.add("Mount St. Helens");
            volcanicMountains.add("Mount Etna");
            volcanicMountains.add("Mount Fuji");
            volcanicMountains.add("Mount Tambora");

            famousMountains.addAll(europeanMountains);

            famousMountains.remove("Matterhorn");
            volcanicMountains.clear();


            boolean isAvailable = famousMountains.contains("Mount Everest");
            System.out.println("Is Mount Everest in famous mountains? " + isAvailable);

            boolean isItContainsAll = famousMountains.containsAll(europeanMountains);
            System.out.println("Does famousMountains contain all europeanMountains? " + isItContainsAll);

            System.out.println("Number of mountains in volcanicMountains: " + volcanicMountains.size());

            Iterator<String> itr = famousMountains.iterator();
            System.out.println("Famous Mountains:");
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }
