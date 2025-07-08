package com.bankingApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("bank-users")
public class BankUserController {

    @GetMapping
    public List<BankUser> getUsers() {
        return List.of(
                new BankUser("Jacky", "12345"),
                new BankUser("Samantha", "coins221"));
    }
}
