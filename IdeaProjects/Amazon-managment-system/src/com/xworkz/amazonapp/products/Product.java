package com.xworkz.amazonapp.products;

public class Product {
    public String productName;
    public String productID;
    public String brand;
    public String category;
    public double rating;

    public void showDetails() {
        System.out.println("Product Name: " + this.productName);
        System.out.println("Product ID: " + this.productID);
        System.out.println("Brand: " + this.brand);
        System.out.println("Category: " + this.category);
        System.out.println("Rating: " + this.rating + " stars");
    }
}
