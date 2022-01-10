package com.example.Banking.repository;

import com.example.Banking.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    Customer findByCustomerName(String customerName);

    Customer findByAccountNumber(Long accountNumber);

}
