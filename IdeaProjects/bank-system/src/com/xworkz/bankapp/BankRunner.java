package com.xworkz.bankapp;

import com.xworkz.bankapp.bankaccount.BankAccount;
import com.xworkz.bankapp.current.CurrentAccount;
import com.xworkz.bankapp.savings.SavingsAccount;

public class BankRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        SavingsAccount savingsAccount= new SavingsAccount();

        System.out.println("the balance is: "+savingsAccount.getBalance());

        savingsAccount.deposit(1200);
        System.out.println("After deposit the balance is: "+savingsAccount.getBalance());

        savingsAccount.withDraw(200);
        System.out.println("after withdraw the amount is: "+savingsAccount.getBalance());

        SavingsAccount savingsAccount1 = new SavingsAccount(2000);
        savingsAccount.withDraw(100);
        System.out.println("Total balance is: "+savingsAccount.getBalance());

        System.out.println("main ended");

        CurrentAccount currentAccount=new CurrentAccount(2000);
        currentAccount.calculateInterest();
        System.out.println("balance after adding interest: "+currentAccount.getBalance());
    }
    }
