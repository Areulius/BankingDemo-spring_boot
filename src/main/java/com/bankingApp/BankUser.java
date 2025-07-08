package com.bankingApp;

import java.util.ArrayList;

public class BankUser {
    private String username;
    private String password;
    private final ArrayList<BankAccount> userAccounts =  new ArrayList<>();

    // Constructors
    public BankUser() {}
    public BankUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters/Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
