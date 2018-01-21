package com.company;

public class BankAccount {
    private long AccountNumber;
    private long balance;
    private String CustomerName;
    private String CustomerEmail;
    private long phoneNumber;

    public long getAccountNumber() {
        return AccountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setAccountNumber(long accountNumber) {
        AccountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int amount){
        long amountInBank= this.getBalance();
        amountInBank+= (long)amount;
        this.setBalance(amountInBank);
        System.out.println("balance is now"+this.getBalance());
    }

    public void withdraw(int amount){
        long amountInBank= this.getBalance();
        if(amountInBank<(long)amount){
            return;
        }
        amountInBank-= (long)amount;
        this.setBalance(amountInBank);
        System.out.println("balance is now"+this.getBalance());
    }
}
