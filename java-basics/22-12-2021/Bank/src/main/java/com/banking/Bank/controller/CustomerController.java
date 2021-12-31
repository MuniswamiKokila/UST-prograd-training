package com.banking.Bank.controller;

import com.banking.Bank.entity.Customer;
import com.banking.Bank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
@RestController
public class CustomerController {
    @Autowired
    private BankService service;
    @PostMapping("/home")
    public String register(HttpServletRequest request)
    {
        String name=request.getParameter("customerName");
        String password=request.getParameter("password");
        String email=request.getParameter("email");
        String mobileNumber=request.getParameter("mobileNumber");
        String accountNumber=request.getParameter("accountNumber");
        String branchName=request.getParameter("branchName");
        Customer customer1=new Customer(name,password,email,mobileNumber,accountNumber,branchName);
        service.save(customer1);
        return "Registration Completed";
    }
}
