package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<String> menu=new ArrayList();
        menu.add("Biriyani");
        menu.add("Soup");
        menu.add("FriedRice");
        menu.add("Manchuriya");
        System.out.println("Here is the menu of Items available");
        System.out.println(menu);
        System.out.println("Wanted Item in menu");
        String item=sc.next();
        if (menu.contains(item)){
            System.out.println(item + " is available in menu");
        }
        else {
            System.out.println(item + " is not available in menu");
            menu.add(item);
            System.out.println("List after Adding Item in menu");
            menu.forEach(list -> System.out.println(list));
        }


    }
}
