package com.map;

import java.util.Scanner;
import java.util.TreeMap;

public class Contacts {
    public static void main(String[] args) {
        TreeMap<String, Integer> contact=new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        contact.put("Kokila",121);
        contact.put("Akshaya",213);
        contact.put("Neelu",136);
        contact.put("Gnana",164);
        contact.put("Deepika",139);
        contact.put("GNANA",154);
        System.out.println(contact);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Contact to call the number");
        String num=sc.next();
        if(contact.containsKey(num)){
            System.out.println("Calling " + num + " the number");
            System.out.println(contact.get(num));
        }
        else{
            System.out.println("There is no such contact");
        }

    }
}
