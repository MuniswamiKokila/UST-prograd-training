package com.banking.Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BankApplication.class, args);
		Customer customer1=context.getBean(Customer.class);
		Customer customer2=context.getBean(Customer.class);
		FundTransfer fundTransfer=context.getBean(FundTransfer.class);
		Account account=context.getBean(Account.class);

		customer1.setCustomerAccountDetails("Kokila","9525454511","265487144996","Tekkali");
		customer2.setCustomerAccountDetails("Deepika","9745165817","246157889156","Visakhapatnam");

		customer1.setAccountBalance(2000);
		customer2.setAccountBalance(1000);

		fundTransfer.fundTransferFromOneAccountToOtherAccount(500,customer1,customer2);
		account.amountDepositOrWithdrawal(customer1,500,"deposit");
	}

}
