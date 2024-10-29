package com.xworkz.app.dto;

import lombok.*;

import java.util.Comparator;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto{

    private int productId;
    private String productName;
    private Double productPrice;
    private String productCategory;
    private Double rating;

    /*@Override
    public int compareTo(ProductDto o) {
      //  return this.productId - o.productId;
        return  o.productPrice.compareTo(this.productPrice);
    }*/


    /*@Override
    public int compare(ProductDto o1, ProductDto o2) {
        System.out.println(o1.productId+" "+ o2.productId);
         // return o1.productId-o2.productId;
           return (int) (o1.rating-o2.rating);
       // return o1.getProductName().compareTo(o2.getProductName());
    }*/


}
