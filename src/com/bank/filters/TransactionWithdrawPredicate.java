package com.bank.filters;

import com.bank.transactions.Transaction;

public class TransactionWithdrawPredicate {
    boolean checkTransaction(Transaction transaction) {
        return "withdraw".equals(transaction.getType());
    }
}
