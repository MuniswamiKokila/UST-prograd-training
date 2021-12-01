package com.map;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Descending {
    public static void main(String[] args) {
        TreeMap<Integer, String> desc=new TreeMap<>();
        desc.put(20,"Java");
        desc.put(40,"C");
        desc.put(10,"Python");
        desc.put(30,"C++");
        System.out.println("Before Descending");
        for (Map.Entry<Integer, String > m : desc.entrySet()){
            System.out.println(m.getKey() + " -> " + m.getValue());
        }
        Set<Integer> keySet=desc.descendingKeySet();
        System.out.println("After Descending");
        for (Integer key : keySet){
            System.out.println(key + " -> " + desc.get(key));
        }

    }
}