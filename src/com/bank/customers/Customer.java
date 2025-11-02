package com.bank.customers;

public class Customer extends Person{

    private double dailyLimit = 200;

    public Customer(String username, String phoneNo){
        super(username, phoneNo);
    }

    public double getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(double dailyLimit) {
        this.dailyLimit = dailyLimit;
    }
}
