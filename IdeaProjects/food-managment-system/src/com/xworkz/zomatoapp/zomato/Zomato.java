package com.xworkz.zomatoapp.zomato;

import com.xworkz.zomatoapp.food.Food;

public class Zomato {

    public int orderId;
    public String customerName;
    public String address;

    public boolean placeOrder(Food food) {
        boolean isOrdered = false;
        if (food != null) {
            System.out.println("Order ID: " + this.orderId);
            System.out.println("Customer Name: " + this.customerName);
            System.out.println("Address: " + this.address);

            food.getDetails();
            isOrdered = true;
            System.out.println("Order has been placed successfully!");
        } else {
            System.out.println("No food item found to order.");
        }
        return isOrdered;
    }

}
