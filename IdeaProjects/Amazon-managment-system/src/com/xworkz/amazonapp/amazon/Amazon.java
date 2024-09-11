package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.products.Product;

public class Amazon {
    public double price;

    public void displayProduct(Product details) {
        if (price > 0) {
            System.out.println("Product is available with the following details:");
            details.showDetails();
            System.out.println("Price: $" + this.price);
        } else {
            System.out.println("Product price is not available.");
        }
    }
}
