package com.xworkz.app.dto.comparator;

import com.xworkz.app.dto.ProductDto;

import java.util.Comparator;

public class RatingComparator implements Comparator <ProductDto>{


    @Override
    public int compare(ProductDto o1, ProductDto o2) {
        return o1.getRating().compareTo(o2.getRating());
    }
}
