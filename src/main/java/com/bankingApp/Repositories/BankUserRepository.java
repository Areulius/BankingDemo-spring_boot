package com.bankingApp.Repositories;

import com.bankingApp.Entities.BankUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankUserRepository extends JpaRepository<BankUser, Long> {}