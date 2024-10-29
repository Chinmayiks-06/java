package com.xworkz.app;

import java.util.*;
import java.util.stream.Collectors;

public class AmusementPark {
    public static void main(String[] args) {

       // List<String> collection=new ArrayList();
        Set<String> collection=new HashSet<>();
        collection.add("GRS fantacy park");
        collection.add("wonderla");
        collection.add("fun world");
        collection.add("SkyJumper Trampoline Park");
        collection.add("Sky High Fun");
        collection.add("Magic rides");
        collection.add("Maa world");

//        collection.add(1,"Ramoji film city");
//        collection.add(5,"Worlds of Wonder");
//        collection.add(0,"Black Knight");


        Iterator<String> iterator=collection.iterator();
        while (iterator.hasNext()){
            String amusementpark=iterator.next();
            //filtering the collection
            if (amusementpark.startsWith("Sk"))
            System.out.println(amusementpark);
        }

        System.out.println("----for each filtering----");
        //for each filtering
        for (String amusementParkName:collection){
            if (amusementParkName.startsWith("M"))
                System.out.println(amusementParkName);
        }

        System.out.println("----using Stream----");
                                                                               //lambda structure
    List<String> collectionOfStartingLetterGiven = collection.stream().filter(amusementParkName->amusementParkName.startsWith("S")).collect(Collectors.toList());
        collectionOfStartingLetterGiven.forEach(System.out::println);
        /*System.out.println("The given index park name is:"+collection.get(4));*/
    }
}
