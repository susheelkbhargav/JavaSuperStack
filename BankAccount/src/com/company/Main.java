package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount Customer1= new BankAccount();
        Customer1.setCustomerName("Susheel");
        Customer1.setBalance(9000);
        Customer1.deposit(100);
        Customer1.withdraw(900);
    }
}
