package com.xworkz.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionIntRunner {
    public static void main(String[] args) {

        Collection<Integer> collection=new ArrayList();
        collection.add(34);
        collection.add(67);
        collection.add(76);
        collection.add(789);
        collection.add(567);
        collection.add(98);
                                                                           //lambda structure
        List<Integer> collectionOffOddNumbers = collection.stream().filter(i ->(i % 2==0)).collect(Collectors.toList());
        collectionOffOddNumbers.forEach(System.out::println);

        System.out.println(collection);
    }
}
