package com.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Age {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> age=new LinkedHashMap<>();
        System.out.println("Checking the entries of before entering into competition");
        System.out.println(age.size());
        age.put("Kokila",22);
        age.put("Akshaya",21);
        age.put("Deepika",24);
        age.put("Gnana",18);
        age.put("Neelu",27);
        System.out.println("After Entries with their name and ages");
        System.out.println(age);
        System.out.println("removing the age group before 20 and after 25");
        age.remove("Gnana");
        age.remove("Neelu");
        System.out.println("Size of Entries after entering into competition");
        System.out.println(age.size());
        System.out.println(age);
        System.out.println("Names and Age groups entering the competition");
        for(Map.Entry<String, Integer> m : age.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
