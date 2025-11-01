package com.bank.accounts;

//------------------------------------------
// implementing the behavior parameterized methodology for printing bank accounts
//------------------------------------------

public interface AccountFormatter {
    String format(BankAccount bankAccount);
}
