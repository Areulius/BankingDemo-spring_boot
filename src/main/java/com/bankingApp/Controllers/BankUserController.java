package com.bankingApp.Controllers;

import com.bankingApp.Entities.BankUser;
import com.bankingApp.Repositories.BankUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class BankUserController {
    private final BankUserRepository repository;

    @Autowired
    public BankUserController(BankUserRepository repository) {
        this.repository = repository;
    }

    @PostMapping("register")
    public BankUser createUser(@RequestBody BankUser user) {
        return repository.save(user);
    }
}
