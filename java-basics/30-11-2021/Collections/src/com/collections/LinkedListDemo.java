package com.collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<String> linkedlist=new LinkedList<>();
        linkedlist.add("Hi");
        linkedlist.add("Hello");
        linkedlist.add("Fine");
        linkedlist.add("Bye");
        linkedlist.add("Hello");
        System.out.println(linkedlist);
        linkedlist.remove(2);
        System.out.println(linkedlist);
        linkedlist.forEach(message -> System.out.println(message));
        System.out.println(linkedlist.lastIndexOf("Fine"));
    }
}
