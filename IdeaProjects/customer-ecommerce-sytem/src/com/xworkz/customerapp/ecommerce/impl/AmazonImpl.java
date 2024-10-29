package com.xworkz.customerapp.ecommerce.impl;


import com.xworkz.customerapp.customer.Customer;
import com.xworkz.customerapp.ecommerce.ECommerce;
import lombok.ToString;


public class AmazonImpl implements ECommerce {

    Customer customer[] = new Customer[2];
    int index;
    @Override
    public boolean addCustomer(Customer customer) {
        boolean isCustomerAdded = false;
        if(customer != null){
            this.customer[index++]    =  customer;
            isCustomerAdded = true;
        }
        return isCustomerAdded;
    }

    @Override
    public void getAllCustomers() {
        for (Customer customer1 : customer) {
            System.out.println(customer1);
        }
    }

    @Override
    public Customer getCustomerById(int id) {
        Customer customer=null;
                               //array variable
        for (Customer ref :this.customer){
        if (ref.getCustomerId()==id){
            customer=ref;
        }
        }
        return customer;
    }

    @Override
    public Customer getCustomerByEmail(String email) {
        Customer customer=null;
        for(Customer ref:this.customer){
            if(ref.getEmail().equals(email)){
                customer=ref;
            }
        }
        return customer;
    }


}
