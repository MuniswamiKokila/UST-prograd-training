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
        System.out.println(veggies);
        System.out.println("Enter the veggies to see the cost");
        String veg=sc.next();
        if(veggies.containsKey(veg)){
            Integer cost=veggies.get(veg);
            System.out.println(veggies.get(veg));
            if(cost>50){
                System.out.println("I don't want to buy " + veg);
                veggies.remove(veg);
            }
            else
            {
                System.out.println("I Like to buy " + veg);

            }
        }
        else {
            System.out.println(veg + "is not available");
        }
    }
}
