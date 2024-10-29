package com.xworkz.customerapp;

import com.xworkz.customerapp.customer.Customer;
import com.xworkz.customerapp.ecommerce.ECommerce;
import com.xworkz.customerapp.ecommerce.impl.AmazonImpl;
import lombok.ToString;

public class CustomerRunner {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setCustomerId(1);
        customer.setCustomerName("chinmayi");
        customer.setAddress("hassan");
        customer.setEmail("chin@gmail.com");
        customer.setPhoneNumber(643567898765L);
        customer.setPassword("chik@123");

        Customer customer1 = new Customer();
        customer1.setCustomerId(2);
        customer1.setCustomerName("saumya");
        customer1.setAddress("bidar");
        customer1.setEmail("sau@gmail.com");
        customer1.setPhoneNumber(19876685686L);
        customer1.setPassword("somu@123");

        ECommerce eCommerce = new AmazonImpl();
        eCommerce.addCustomer(customer);
        eCommerce.addCustomer(customer1);
        eCommerce.getAllCustomers();

       Customer returned=eCommerce.getCustomerById(2);
        System.out.println(returned);
        Customer getEmail=eCommerce.getCustomerByEmail("chin@gmail.com");
        System.out.println(getEmail);
    }
}
