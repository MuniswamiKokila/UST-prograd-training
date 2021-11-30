package com.collections;

import java.util.Vector;

public class VectorListDemo {
    public static void main(String[] args) {
        Vector<String> veggies=new Vector<String>(10);
        veggies.add("Carrot");
        veggies.add("Tomato");
        veggies.add("Onions");
        veggies.addElement("Potato");
        System.out.println(veggies);
        System.out.println(veggies.removeElement("Tomato"));
        veggies.forEach(veg -> System.out.println(veg));
    }
}
