package com.example.Banking;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Customer {
    String customerName;
    String mobileNumber;
    String accountNumber;
    String branchName;
    @Autowired
    Account account;
    public void setCustomerAccountDetails(String customerName, String mobileNumber, String accountNumber, String branchName) {
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
        this.accountNumber = accountNumber;
        this.branchName=branchName;
    }
    public void displayCustomerAccountDetails(){
        System.out.println("\nFirst Customer Details:\n");
        System.out.println("Account Holder's Name : "+customerName);
        System.out.println("Mobile Number : "+mobileNumber);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Branch Name:"+ branchName);
        System.out.println("Account Balance:"+account.getCustomerAccountBalance());
    }
}
