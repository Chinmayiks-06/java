package com.xworkz.app;

import com.xworkz.app.dto.ProductDto;
import com.xworkz.app.service.EcommerceService;
import com.xworkz.app.service.EcommerceServiceImpl;

public class ProductRunner {
    public static void main(String[] args) {

        ProductDto productDto=new ProductDto();
        productDto.setProductId(1);
        productDto.setProductName("Cetaphil");
        productDto.setProductPrice(650.00);
        productDto.setProductCategory("Cosmetics");
        productDto.setRating(4);
        System.out.println(productDto);

        EcommerceService ecommerceService=new EcommerceServiceImpl();
        ecommerceService.validateAndSaveProduct(productDto);


    }
}
