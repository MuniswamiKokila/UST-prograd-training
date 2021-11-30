package com.collections;

import java.util.PriorityQueue;

public class Dictonary {
    public static void main(String[] args) {
        PriorityQueue<String> words=new PriorityQueue();
        words.add("Kokila");
        words.add("Akshaya");
        words.add("Deepika");
        words.add("Gnana");
        words.add("Neelu");
        System.out.println("Serial Alphabetical Order:" + words);
        System.out.println(words.poll());
        System.out.println(words);
    }
}
