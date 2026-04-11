package org.example;

import java.io.Serializable;

public abstract class  BankAccount implements Serializable {

    private int accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(int accountNumber, String ownerName, int balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
        }
    }
    public double getBalance(){
            return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }


    public void getAccountInfo(){
        System.out.println("Номер аккаунта: " + accountNumber);
        System.out.println("Владелец аккаунта: " + ownerName);
        System.out.println("Баланс счёта: " + balance);
    }

     public abstract void calculateMonthEnd();


}
