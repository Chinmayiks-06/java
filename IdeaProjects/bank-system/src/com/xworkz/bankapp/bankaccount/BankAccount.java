package com.xworkz.bankapp.bankaccount;

public class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        System.out.println("deposit started");
        if(amount>0)
            balance=balance+amount;
        else System.out.println("Amount cant be deposit");
        System.out.println("deposit ended");
    }
    public void withDraw(double amount){
        System.out.println("withdraw started");
        if(amount<=balance)
            balance=balance-amount;
        else System.out.println("insufficient balance");
        System.out.println("withdraw ended");
    }
}
