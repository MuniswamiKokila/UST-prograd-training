package com.library;

import java.util.Scanner;


public class Library {

    public static void addbook() {
        int coun=0;
        if(coun==9){
            System.out.println("\n no space \n");
            return;
        }
        System.out.println("Add Book Information");
    }
    public static void displaybook(){

    }
    public static void authorbook(){

    }
    public static void count(){

    }
    public static void listaccount(){

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag = 0;
        int coun;
        System.out.println("-------------------------------------------------");
        System.out.println("          LIBRARY MANAGEMENT SYSTEM              ");
        System.out.println("-------------------------------------------------");
        while (true){
            System.out.println("\n==================================================");
            System.out.println("press 1 for Add Book Information");
            System.out.println("Press 2 for Display Book Information");
            System.out.println("Press 3 for List all books for given author");
            System.out.println("Press 4 for List the count of books in the Library");
            System.out.println("Press 5 for List the title of Specified book");
            System.out.println("Press 6 for Exit");
            int num=sc.nextInt();
            switch (num){
                case 1 : addbook();
                         break;
                case 2 : displaybook();
                         break;
                case 3 : authorbook();
                         break;
                case 4 : count();
                         break;
                case 5 : listaccount();
                         break;
                case 6 : flag=1;
                         break;
                default:
                    System.out.println("Invaild Entry");
                    break;
            }
            if (flag==1){
                break;
            }
        }
    }

}
