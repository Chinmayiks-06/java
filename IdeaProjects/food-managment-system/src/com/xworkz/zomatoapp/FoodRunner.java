package com.xworkz.zomatoapp;

import com.xworkz.zomatoapp.food.Food;
import com.xworkz.zomatoapp.zomato.Zomato;

public class FoodRunner {
    public static void main(String[] args) {

        Food food = new Food();
        food.foodName = "Pizza";
        food.price = 250;
        food.cuisine = "Italian";
        food.quantity = 1;
        food.restaurantName = "Pizza Hut";

        Zomato order = new Zomato();
        order.orderId = 101;
        order.customerName = "Chinmayi";
        order.address = "123, ABC Street, Bangalore";

        order.placeOrder(food);
    }
}
