package com.xworkz.customerapp.ecommerce;


import com.xworkz.customerapp.customer.Customer;

public interface ECommerce{

    boolean addCustomer(Customer customer);
    void getAllCustomers();
    Customer getCustomerById(int id);
    Customer getCustomerByEmail(String email);
}
