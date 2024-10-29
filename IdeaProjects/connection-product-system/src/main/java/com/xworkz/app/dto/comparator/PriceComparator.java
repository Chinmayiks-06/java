package com.xworkz.app.dto.comparator;

import com.xworkz.app.dto.ProductDto;

import java.util.Comparator;

public class PriceComparator implements Comparator<ProductDto> {
    @Override
    public int compare(ProductDto o1, ProductDto o2) {
        return (int) (o1.getProductPrice()-o2.getProductPrice());
    }
}
