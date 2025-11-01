package com.bank.filters;

import com.bank.transactions.Transaction;

public interface TransactionPredicate {
    boolean checkTransaction(Transaction transaction);
}
