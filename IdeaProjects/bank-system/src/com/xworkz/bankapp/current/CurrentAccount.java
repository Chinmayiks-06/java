package com.xworkz.bankapp.current;

import com.xworkz.bankapp.bankaccount.BankAccount;

public class CurrentAccount extends BankAccount {

    double interest=7.5;

    public CurrentAccount(double minBalance){
        setBalance(minBalance);
    }

    public  void calculateInterest(){
       double interestAmount= (getBalance()*interest)/100;
       deposit(interestAmount);
    }
}
