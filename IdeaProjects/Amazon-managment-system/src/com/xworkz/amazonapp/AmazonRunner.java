package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.products.Product;

public class AmazonRunner {
    public static void main(String[] args) {

        Amazon product = new Amazon();
        product.price = 24999.99;
        Product productDetails = new Product();
        productDetails.productName = "Apple iPhone 13";
        productDetails.productID = "IP13-256GB-BLUE";
        productDetails.brand = "Apple";
        productDetails.category = "Smartphones";
        productDetails.rating = 4.8;

        product.displayProduct(productDetails);
    }
}
