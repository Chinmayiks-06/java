package com.xworkz.app.dto;

import com.xworkz.app.dto.comparator.PriceComparator;
import com.xworkz.app.dto.comparator.RatingComparator;

import java.util.*;
import java.util.stream.Collectors;

public class  ProductDtoRunner {

    public static void main(String[] args) {
        List<ProductDto> collection=new ArrayList<>();

        ProductDto productDto=new ProductDto(1,"power bank",2455.00,"Electronics",4.99);
        ProductDto productDto1=new ProductDto(2,"Dairy milk silk",568.00,"Chocolates",4.98);
        ProductDto productDto2=new ProductDto(3,"Laptop",64567.00,"electronic gadget",4.97);
        ProductDto productDto3=new ProductDto(4,"Don't Believe everything you think",456.00,"Book",4.1);
        ProductDto productDto4=new ProductDto(5,"maybelline new york Kajal",2999.00,"Kajal",4.96);

        collection.add(productDto);
        collection.add(productDto3);
        collection.add(productDto1);
        collection.add(productDto4);
        collection.add(productDto2);


        /*System.out.println(collection.stream().sorted(Comparator.comparing(ProductDto::getProductPrice)
                .thenComparing(ProductDto::getProductName)).collect(Collectors.toList()));*/

        System.out.println(collection.stream().sorted(Comparator.comparing(ProductDto::getProductPrice)).findFirst());












        //collection.sort(new PriceComparator());
        //retrive/fetch/process
      /*  Collections.sort(collection);

      //  list.sort(c);     --here we use directly sort
    Collections.sort(collection,new PriceComparator());
    Collections.sort(collection,new RatingComparator());*/
        /*   for (ProductDto product:collection){
        System.out.println(product);
        }*/
    }

}
