package com.example.Banking.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
public class Customer {
    @Id
    @Column(nullable=false,unique = true)
    String userName;
    @Column(nullable=false)
    String customerName;
    @Column(nullable = false)
    String email;
    @Column(nullable=false,unique = true)
    String mobileNumber;
    Long accountNumber;
    String branchName;
    Double accountBalance=0.0;
    @Column(nullable = false)
    String address;
    @Column(nullable = false)
    String password;

    public Customer(){}

    public Customer(String userName, String customerName,  String password, String email, String mobileNumber, String address,Long accountNumber, String branchName) {
        this.userName=userName;
        this.customerName = customerName;
        this.email=email;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.password = password;
        this.accountNumber=accountNumber;
        this.branchName=branchName;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String username) {
        this.userName = userName;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){this.email= this.email;}
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber= Long.valueOf(accountNumber);
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }


    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance){
        this.accountBalance=accountBalance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}