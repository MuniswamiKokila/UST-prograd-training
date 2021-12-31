package com.banking.Bank.repository;

import com.banking.Bank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Customer, Long> {
}
