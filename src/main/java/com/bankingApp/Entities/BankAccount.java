package com.bankingApp.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "bank_accounts")
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double balance;

    @ManyToOne
    @JoinColumn(name = "username")
    private BankUser connectedUser;

    // Constructors
    public BankAccount() {}
    public BankAccount(double balance, BankUser connectedUser) {
        this.balance = balance;
        this.connectedUser = connectedUser;
    }

    // Getters/Setters
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankUser getConnectedUserId() {
        return connectedUser;
    }

    public void setConnectedUserId(BankUser connectedUserId) {
        this.connectedUser = connectedUserId;
    }
}
