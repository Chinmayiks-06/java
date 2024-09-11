package com.xworkz.zomatoapp.food;

public class Food {
    public String foodName;
    public int price;
    public String cuisine;
    public int quantity;
    public String restaurantName;

    public void getDetails() {
        System.out.println("Food Name: " + this.foodName);
        System.out.println("Price: " + this.price);
        System.out.println("Cuisine: " + this.cuisine);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Restaurant Name: " + this.restaurantName);
    }
}

