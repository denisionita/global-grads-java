package com.db.generics;

public class Account {
    private double balance;
    public String name;

    public Account(String name){
        this.name = name;
        this.balance = 0;
    }

    public void deposit(double sum){
        this.balance += sum;
    }

    public void withdraw(double sum) throws NegativeSumException {
        if(balance < sum){
            throw new NegativeSumException();
        }
        this.balance -= sum;
    }

    public double getBalance() {
        return balance;
    }
}
