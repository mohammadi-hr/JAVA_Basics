package com.bank.customers;

public abstract class Person {
    private String national_code;
    private String email;
    private String phoneNo;
    private String username;

    public Person(String username, String phoneNo){
        this.username = username;
        this.phoneNo = phoneNo;
    }
}
