package com.example.Banking.service;

import com.example.Banking.entity.Customer;
import com.example.Banking.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.RowSet;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repo;

    public Customer saveCustomer(Customer customer) {
        return repo.save(customer);
    }

    public List<Customer> ListAll() {
        return repo.findAll();
    }

    public Boolean existsById(String userName) {
        return repo.existsById(userName);
    }

    public Customer findById(String userName) {
        return repo.getById(userName);
    }

    public Customer updateCustomer(Customer existingCustomer) {
        return repo.save(existingCustomer);
    }

    public Customer findByAccountNumber(Long accountNumber) {
        return repo.findByAccountNumber(accountNumber);
    }

    public Customer findByAccountName(String customerName) {
        return repo.findByCustomerName(customerName);
    }

}