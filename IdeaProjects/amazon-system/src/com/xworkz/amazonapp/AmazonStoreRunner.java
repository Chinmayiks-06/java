package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazonstore.AmazonStore;
import com.xworkz.amazonapp.amazonstore.impl.AmazonStoreImpl;
import com.xworkz.amazonapp.product.Product;

public class AmazonStoreRunner {
    public static void main(String[] args) {

        Product product = new Product();
        product.setProductId(1);
        product.setProductName("Laptop");
        product.setProductPrice(800.00);
        product.setCategory("Electronics");

        Product product1=new Product();
        product1.setProductId(2);
        product1.setProductName("babi");
        product1.setProductPrice(700.00);
        product1.setCategory("EEE");

        AmazonStore amazonStore = (AmazonStore) new AmazonStoreImpl();
        System.out.println(amazonStore.addProduct(product));
        System.out.println(product);

        amazonStore.getProduct();

        System.out.println(amazonStore.updateProductPrice(850.00));
        amazonStore.getProduct();
        System.out.println(product);

        amazonStore.deleteProduct();
        System.out.println(product1);


        amazonStore.getProduct();
        System.out.println(product);

    }
}
