package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.println("Please enter your initial balance");
        Double initial = input.nextDouble();
        bankAccount myAccount = new bankAccount(name, initial);
        while(true) {
            System.out.println("You may (1)deposit, (2)withdraw, or (3)print your balance, or (4)exit");
            String action = input.nextLine();
            if (action.equals(1)){
                System.out.println("How much would you like to deposit?");
                myAccount.deposit(input.nextDouble());
            }
            else if(action.equals(2)){
                System.out.println("How much would you like to withdraw?");
                myAccount.withdraw(input.nextDouble());
            }
            

        }
        System.out.println(myAccount.accountname + " your bank balance is " + myAccount.accountBalance);
    }
}
