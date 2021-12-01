package com.map;

import java.util.HashMap;
import java.util.Scanner;

public class Vegetables {
    public static void main(String[] args) {
        HashMap<String, Integer> veggies=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        veggies.put("Potatoes",30);
        veggies.put("Tomatoes",60);
        veggies.put("Onions",45);
        veggies.put("Cabbage",40);
        System.out.println("Here are the veggies available");
        System.out.println(veggies);
        System.out.println("Enter the veggies to see the cost");
        String veg=sc.next();
        if(veggies.containsKey(veg)){
            System.out.println(veggies.get(veg));
        }
    }
}
