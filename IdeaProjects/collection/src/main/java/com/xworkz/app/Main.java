package com.xworkz.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList();
        Collection collection1=new ArrayList();
        collection1.add("eclairs");
        collection1.add("Kacha mango bite");

        collection.add("kitkat");
        collection.add("Dairy milk");
        collection.add("milkybar");
        collection.add("Ferrero Rocher");
        collection.add("Munch");
        collection.addAll(collection1);
        collection.remove("Munch");
        collection.removeAll(collection1);

        Collection collection2=new ArrayList();
        collection2.add("C");
        collection2.add("C++");
        collection2.clear();
        System.out.println(collection2);


        boolean isAvailable =collection.contains("kitkat");
        System.out.println(isAvailable);

        boolean isItContainsAll=collection.containsAll(collection1);
        System.out.println(isItContainsAll);



        System.out.println(collection.size());
        System.out.println("-------------------------------------");
        //retrive the collection object
        for (Object st:collection){
            System.out.println(st);
        }

        System.out.println("----------Another way to retrive-----------");

//to retrive a object from collection
        Iterator<String> itr=collection.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

       // collection.forEach();
      // to sort in alphabetical order
   // collection.stream().sorted().collect(Collectors.toList());

    }
}