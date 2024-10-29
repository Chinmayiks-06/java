package com.xworkz.app;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PoetWriterNames {
    public static void main(String[] args) {
        Collection<String> classicPoets = new ArrayList<>();
        classicPoets.add("William Shakespeare");
        classicPoets.add("Robert Frost");
        classicPoets.add("Emily Dickinson");
        classicPoets.add("John Keats");
        classicPoets.add("Walt Whitman");

        Collection<String> contemporaryPoets = new ArrayList<>();
        contemporaryPoets.add("Maya Angelou");
        contemporaryPoets.add("Billy Collins");
        contemporaryPoets.add("Rupi Kaur");
        contemporaryPoets.add("Claudia Rankine");
        contemporaryPoets.add("Ocean Vuong");

        Collection<String> spokenWordPoets = new ArrayList<>();
        spokenWordPoets.add("Sarah Kay");
        spokenWordPoets.add("Phil Kaye");
        spokenWordPoets.add("Button Poetry");
        spokenWordPoets.add("Lemonade");
        spokenWordPoets.add("Sabrina Benaim");

        classicPoets.addAll(contemporaryPoets);

        classicPoets.remove("Rupi Kaur");
        spokenWordPoets.clear();

        boolean isAvailable = classicPoets.contains("William Shakespeare");
        System.out.println("Is William Shakespeare in classic poets? " + isAvailable);

        boolean isItContainsAll = classicPoets.containsAll(contemporaryPoets);
        System.out.println("Does classicPoets contain all contemporaryPoets? " + isItContainsAll);

        System.out.println("Number of poets in spokenWordPoets: " + spokenWordPoets.size());

        Iterator<String> itr = classicPoets.iterator();
        System.out.println("Classic Poets:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
