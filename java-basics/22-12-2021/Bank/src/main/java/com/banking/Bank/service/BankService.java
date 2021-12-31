package com.banking.Bank.service;

import com.banking.Bank.entity.Customer;
import com.banking.Bank.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankService {
    @Autowired
    private BankRepository repo;
    public Customer save(Customer customer){
        return repo.save(customer);
    }
public List<Customer> listAll(){
        return repo.findAll();
}
}
