package com.example.Banking;


import org.springframework.stereotype.Component;

@Component
public class Account {
    double balanceAmount=1000;
    public double getCustomerAccountBalance() {
        return balanceAmount;
    }
}
