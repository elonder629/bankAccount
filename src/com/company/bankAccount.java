package com.company;

/**
 * Created by el693 on 10/4/17.
 */
public class bankAccount {
    public double accountBalance;
    public String accountname;

    public bankAccount(String name, Double initial) {
        accountname = name;
        accountBalance = initial;
    }
    public void deposit(Double amtdep){
        accountBalance += amtdep;
    }
    public void withdraw(Double amtwith){
        if (accountBalance < amtwith)
            System.out.println("Im Sorry you cannot withdraw that ammount right now, your account is too low. ");
        else
            accountBalance -= amtwith;
    }
}
