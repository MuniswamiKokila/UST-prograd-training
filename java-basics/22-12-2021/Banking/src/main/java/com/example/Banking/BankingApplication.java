package com.example.Banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BankingApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BankingApplication.class, args);
		Customer customer1=context.getBean(Customer.class);
		Customer customer2=context.getBean(Customer.class);
		FundTransfer fundTransfer=context.getBean(FundTransfer.class);
		customer1.setCustomerAccountDetails("Kokila Muniswami","9846416591","265621549956","Tekkali");
		customer2.setCustomerAccountDetails("Deepika Gnana","9563154845","231515495965","Visakhapatnam");
		fundTransfer.fundTransfer(500,customer1,customer2);
	}

}
