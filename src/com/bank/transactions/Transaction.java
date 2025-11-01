package com.bank.transactions;

import java.time.LocalDateTime;
import java.time.LocalDateTime;

public class Transaction {
    private double amount;
    private String type; // deposit or withdraw
    private LocalDateTime timestamp;

    public Transaction(double t_amount, String t_type){
        this.amount = t_amount;
        this.type = t_type;
        this.timestamp = LocalDateTime.now();
    }

    public double getAmount(){
        return amount;
    }

    public String getType(){
        return type;
    }

    public LocalDateTime getTimestamp(){
        return timestamp;
    }

    @Override
    public String toString(){
        return type + " of " + amount + " Rials on " + timestamp;
    }

}
