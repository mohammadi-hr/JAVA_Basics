package com.bank.transactions;
import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {
    private List<Transaction> transactions;

    public TransactionHistory(){
        this.transactions = new ArrayList<>();
    }

    public List<Transaction> getTransactions(){
        return transactions;
    }

    public void printTransactions(){
        if(transactions.isEmpty()){
            System.out.println("No Transactions yet.");
        }else{
            for(Transaction transaction : transactions){
                System.out.println(transaction.getAmount()+ " " + transaction.getType() + " at" + transaction.getTimestamp());
            }
        }
    }
}
