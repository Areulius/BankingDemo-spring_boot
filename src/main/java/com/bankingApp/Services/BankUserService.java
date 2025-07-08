package com.bankingApp.Services;

import com.bankingApp.Entities.BankUser;
import com.bankingApp.Repositories.BankUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankUserService {

    @Autowired
    private BankUserRepository userRepo;

    public BankUser createUser(BankUser user) {
        return userRepo.save(user);
    }

    public List<BankUser> getAllUsers() {
        return userRepo.findAll();
    }

    public BankUser getUserById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    public BankUser updateUser(BankUser updatedUser) {
        return userRepo.save(updatedUser);
    }

    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}