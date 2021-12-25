package com.banking.Bank;

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
    double accountBalance;
    public void setCustomerAccountDetails(String customerName,String mobileNumber,String accountNumber,String branchName)
    {
    this.customerName=customerName;
    this.mobileNumber=mobileNumber;
    this.accountNumber=accountNumber;
    this.branchName=branchName;
    }
    public void setAccountBalance(double accountBalance){
        this.accountBalance=accountBalance;
    }
    public void displayCustomerAccountDetails(){
        System.out.println("****************Customer Account Details*************");
        System.out.println("Account Holder : " + customerName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Account Number : "+ accountNumber);
        System.out.println("Branch Name : "+ branchName);
        System.out.println("Account Balance : "+accountBalance);
    }
}
