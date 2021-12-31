package com.banking.Bank.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Component
@Scope("prototype")
public class Customer {
    @Id
    @GeneratedValue
    Long id;
    @Column(nullable = false)
    String customerName;
    @Column(nullable = false,unique = true)
    String mobileNumber;
    @Column(nullable = false,unique = true)
    String accountNumber;
    @Column(nullable = false)
    String branchName;
    double accountBalance;
    @Column(nullable=false)
    String password;
    @Column(nullable = false,unique = true)
    String email;


    public Customer(){}
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


    public Customer(String customerName,String password,String email,String mobileNumber,String accountNumber,String branchName)
    {
        this.customerName=customerName;
        this.password=password;
        this.email=email;
        this.mobileNumber=mobileNumber;
        this.accountNumber=accountNumber;
        this.branchName=branchName;
    }

    public void setId(){
        this.id=id;
    }
    public void setCustomerName(){this.customerName=customerName;}
    public void setPassword(){this.password=password;}
    public void setEmail(){this.email=email;}
    public void setMobileNumber(){this.mobileNumber=mobileNumber;}
    public void setAccountNumber(){this.accountNumber=accountNumber;}
    public void setBranchName(){this.branchName=branchName;}


    public String getCustomerName(){return customerName;}
    public String getPassword(){return password;}
    public String getEmail(){return email;}
    public String getMobileNumber(){return mobileNumber;}
    public String getAccountNumber(){return accountNumber;}
    public String getBranchName(){return branchName;}
}
