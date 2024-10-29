package com.xworkz.app.employee.movie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Movies {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList();
        collection.add("Kgf");
        collection.add("RRR");
        collection.add("mogina manasu");
        collection.add("KGF2");

        Collection collection1 = new ArrayList<>();
        collection1.add("mmm");
        collection1.add("mm2");

        Collection collection2=new ArrayList<>();
        collection2.add("mm");

        collection.addAll(collection1);
        collection1.clear();
        System.out.println(collection.size());
        System.out.println("--------------");

        collection.remove(collection2);
        for (String moviename : collection) {
           // if (moviename.startsWith("M"))
                System.out.println(moviename);
        }

    }
}
