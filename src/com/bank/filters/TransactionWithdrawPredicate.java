package com.bank.filters;

import com.bank.transactions.Transaction;

public class TransactionWithdrawPredicate implements TransactionPredicate {
    public boolean checkTransaction(Transaction transaction) {
        return "withdraw".equals(transaction.getType());
    }
}
