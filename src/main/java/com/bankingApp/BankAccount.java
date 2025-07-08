package com.bankingApp;

public class BankAccount {
    private int id;
    private double balance;
    private BankUser connectedUser;

    // Constructors
    public BankAccount() {}
    public BankAccount(int id, double balance, BankUser connectedUser) {
        this.id = id;
        this.balance = balance;
        this.connectedUser = connectedUser;
    }

    // Getters/Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankUser getConnectedUser() {
        return connectedUser;
    }

    public void setConnectedUser(BankUser connectedUser) {
        this.connectedUser = connectedUser;
    }
}
