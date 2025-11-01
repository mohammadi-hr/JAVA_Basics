package com.bank.accounts;

import java.util.List;

public class AccountPrinter {

    public static void prettyPrintAccount(List<BankAccount> bankAccountList, RichnessFormatter formatter){
        for (BankAccount bc : bankAccountList){
            String info = formatter.format(bc);
            System.out.println(info);
        }
    }

}
