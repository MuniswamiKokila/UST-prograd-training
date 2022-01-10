package com.example.Banking.controller;

import com.example.Banking.entity.Customer;
import com.example.Banking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService service;
    Double balance;
    String name;
    @RequestMapping("/")
    public  String home(){
        return "home";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String details(HttpServletRequest request,Model model){
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");
        Customer customer;
        if(service.existsById(userName)) {
            customer = service.findById(userName);
            if (password.equals(customer.getPassword())) {
                model.addAttribute("userName", customer.getUserName());
                model.addAttribute("customerName", customer.getCustomerName());
                model.addAttribute("email",customer.getEmail());
                model.addAttribute("mobileNumber", customer.getMobileNumber());
                model.addAttribute("address", customer.getAddress());
                name = service.findById(userName).getCustomerName();
                return "details";
            }else {
                model.addAttribute("message", "Invalid Password");
                return "login";
            }
        } else {
            model.addAttribute("message", "Invalid Username");
            return "login";
        }
    }
    @RequestMapping("/registration")
    public String register(){
        return "registration";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }

    @PostMapping("/home")
    public String registration(HttpServletRequest request,Model model)
    {

        String userName=request.getParameter("userName");
        String customerName=request.getParameter("customerName");
        String password=request.getParameter("password");
        String email=request.getParameter("email");
        String mobileNumber=request.getParameter("mobileNumber");
        String address=request.getParameter("address");
        Long accountNumber= Long.parseLong(request.getParameter("accountNumber"));
        String branchName=request.getParameter("branchName");
        Customer customer1=new Customer(userName,customerName,password,email,mobileNumber,address,accountNumber,branchName);
        service.saveCustomer(customer1);
        return "home";
    }

    //update
    @RequestMapping("updateDetails/{id}")
    public String updateCustomerDetails(@PathVariable String id,Model model){
        model.addAttribute("customer",service.findById(id));
        return "updateDetails";
    }
    @PostMapping("/details")
    public String updateCustomer(HttpServletRequest request,Model model){
        Customer existingCustomer= service.findById(request.getParameter("userName"));
        existingCustomer.setCustomerName(request.getParameter("customerName"));
        existingCustomer.setEmail(request.getParameter("email"));
        existingCustomer.setAddress(request.getParameter("address"));
        existingCustomer.setMobileNumber(request.getParameter("mobileNumber"));
        existingCustomer.setPassword(request.getParameter("password"));
        service.updateCustomer(existingCustomer);
        model.addAttribute("customerName",existingCustomer.getCustomerName());
        model.addAttribute("mobileNumber",existingCustomer.getMobileNumber());
        model.addAttribute("email",existingCustomer.getEmail());
        model.addAttribute("address",existingCustomer.getAddress());
        model.addAttribute("password",existingCustomer.getPassword());
        model.addAttribute("userName", existingCustomer.getUserName());
        return "details";
    }

    @RequestMapping("/accountDetails/{id}")
    public String listAccount(@PathVariable String id, Model model) {
        model.addAttribute("customer", service.findById(id));
        model.addAttribute("customerName", service.findById(id).getCustomerName());
        model.addAttribute("userName", service.findById(id).getUserName());
        model.addAttribute("mobileNumber", service.findById(id).getMobileNumber());
        model.addAttribute("branchName", service.findById(id).getBranchName());
        model.addAttribute("accountNumber", service.findById(id).getAccountNumber());
        return "accountDetails";
    }


    //deposit
    @RequestMapping("/deposit/{id}")
    public String deposit(@PathVariable String id,Model model) {
        model.addAttribute("customer",service.findById(id));
        return "deposit";
    }
    @PostMapping("/deposit")
    public String deposit(HttpServletRequest request, Model model) {
        Customer customerAccount= service.findById(request.getParameter("userName"));
        Double newBalance=(customerAccount.getAccountBalance()+Double.parseDouble(request.getParameter("deposit")));
        customerAccount.setAccountBalance(newBalance);
        service.saveCustomer(customerAccount);
        model.addAttribute("message", "Deposited Successfully!...");
        model.addAttribute("name", customerAccount.getCustomerName());
        model.addAttribute("balance", customerAccount.getAccountBalance());
        model.addAttribute("userName", customerAccount.getUserName());
        return "checkBalance";
    }

    //transfer
    @RequestMapping("/fundTransfer")
    public String transfer(Model model) {
        model.addAttribute("customerName", service.findByAccountName(name).getCustomerName());
        model.addAttribute("accountNumber", service.findByAccountName(name).getAccountNumber());
        model.addAttribute("userName", service.findByAccountName(name).getUserName());
        return "fundTransfer";
    }

    @PostMapping("/fundTransfer")
    public String afterTransfer(HttpServletRequest request,Model model){
        Long fromAccountNumber=Long.parseLong(request.getParameter("fromAccountNumber"));
        Long toAccountNumber=Long.parseLong(request.getParameter("toAccountNumber"));
        Double amount=Double.parseDouble(request.getParameter("amount"));

        Customer fromCustomer=service.findByAccountNumber(fromAccountNumber);
        Customer toCustomer=service.findByAccountNumber(toAccountNumber);
        if(Objects.equals(fromCustomer.getAccountNumber(),fromAccountNumber)
                && Objects.equals(toCustomer.getAccountNumber(),toAccountNumber)){

            if(fromCustomer.getAccountBalance()>amount){
                fromCustomer.setAccountBalance(fromCustomer.getAccountBalance()-amount);
                service.saveCustomer(fromCustomer);
                toCustomer.setAccountBalance(toCustomer.getAccountBalance() + amount);
                service.saveCustomer(toCustomer);
                model.addAttribute("message", "Transferred Successfully...!");
                model.addAttribute("name", fromCustomer.getCustomerName());
                model.addAttribute("balance", fromCustomer.getAccountBalance());
                model.addAttribute("userName", fromCustomer.getUserName());
            }
        }
        return "checkBalance";
    }

    @RequestMapping("/checkBalance")
    public String getBalanceOfAccount(Model model) {
        model.addAttribute("userName", service.findByAccountName(name).getUserName());
        model.addAttribute("name", service.findByAccountName(name).getCustomerName());
        model.addAttribute("balance", service.findByAccountName(name).getAccountBalance());
        return "checkBalance";
    }

}
