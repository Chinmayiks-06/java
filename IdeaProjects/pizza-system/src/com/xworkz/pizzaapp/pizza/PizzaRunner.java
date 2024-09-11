package com.xworkz.pizzaapp.pizza;

public class PizzaRunner {
    public static void main(String[] piz) {

        Pizza pizza1 = new Pizza();
        pizza1.setId(1);
        pizza1.setName("Margherita");
        pizza1.setPrice(200.00);
        pizza1.setTopping("Cheese");
        pizza1.setSize("Medium");

        System.out.println(pizza1);

        Pizza pizza2 = new Pizza();
        pizza2.setId(1);
        pizza2.setName("Pepperoni");
        pizza2.setPrice(250.00);
        pizza2.setTopping("Pepperoni");
        pizza2.setSize("Large");

        System.out.println(pizza2);

        Pizza pizza3 = new Pizza();
        pizza3.setId(3);
        pizza3.setName("Veggie");
        pizza3.setPrice(180.00);
        pizza3.setTopping("Veggies");
        pizza3.setSize("Small");

        System.out.println(pizza3);

        System.out.println("Pizza1 hashcode id is: " + pizza1.hashCode());
        System.out.println("Pizza2 hashcode id is: " + pizza2.hashCode());
        System.out.println("Pizza3 hashcode id is: " + pizza3.hashCode());

        boolean isEqual = pizza2.equals(pizza1);
        System.out.println(isEqual);
    }
}
