package com.xworkz.customerapp.customer;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {

    private int customerId;
    private String customerName;
    private String email;
    private String address;
    private long phoneNumber;
    private String password;
}
