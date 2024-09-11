package com.xworkz.bankapp.savings;


import com.xworkz.bankapp.bankaccount.BankAccount;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(){

    }

    public SavingsAccount(double minBalance){
     setBalance(minBalance);
    }

}
