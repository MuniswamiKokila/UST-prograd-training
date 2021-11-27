package com.bankaccount;

import javax.swing.*;
import java.util.Scanner;

public class Bank {
    int balance = 0;
    int deposit = 0;
    int withdrawal = 0;
    Scanner sc = new Scanner(System.in);

    public void Deposit() {
        System.out.println("-----Deposit-----");
        System.out.println("Enter Deposit Amount");
        deposit = sc.nextInt();
        balance += deposit;
        System.out.println("-----Thank You-----");

    }

    public void Withdraw() {
        System.out.println("-----Withdrawal-----");
        System.out.println("Enter Withdrawal Amount");
        withdrawal = sc.nextInt();
        if (withdrawal > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= withdrawal;
        }
        System.out.println("-----Thank You-----");
    }

    public void Display() {
        System.out.println("-----Balance Enquiry-----");
        System.out.println("Your Balance Amount is " + balance);
        System.out.println("-----Thank You-----");
    }

    public static void main(String[] args) {
        Bank account = new Bank();
        int input;
        int i = 0;
        System.out.println("---------Welcome to Bank Services");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please enter your input");
            System.out.println("1.Deposit 2.Withdrawal 3.Balance Enquiry 4.Exit");

            input = sc.nextInt();
            switch (input) {
                case 1:
                    account.Deposit();
                    break;
                case 2:
                    account.Withdraw();
                    break;
                case 3:
                    account.Display();
                    break;
                case 4:
                    i = 1;
                    break;
                default:
                    System.out.println("Thank You for choosing our Services");
            }
        } while (i == 0);
    }
}