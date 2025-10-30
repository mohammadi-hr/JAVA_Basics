package com.bank.app;
import com.bank.accounts.SavingsAccount;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args){

        System.out.println("Enter type of the account you wanna make : \n (1 : savineAccount and 2 : checkingAccount)");
        Scanner scnObj = new Scanner(System.in);
        int accountType = scnObj.nextInt();

        if(accountType == 1) {
            System.out.println("Enter the account balance : ");
            double balance = scnObj.nextDouble();
            System.out.println("Enter the account interest rate: ");
            double interestRate = scnObj.nextDouble();
            SavingsAccount s_v_1 = new SavingsAccount(balance, interestRate);
            System.out.println("Your account annual interest rate would be : " + s_v_1.calculateInterest());
        }

        if(accountType == 2){
            System.out.println("Your account annual interest rate would be : " + 0);
        }



    }
}
