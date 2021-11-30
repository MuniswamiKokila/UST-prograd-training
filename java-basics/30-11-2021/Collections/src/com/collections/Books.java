package com.collections;

import java.util.Stack;

public class Books {
    public static void main(String[] args) {
        Stack<String> book=new Stack();
        book.push("Java");
        book.push("Python");
        book.push("C");
        book.push("C++");
        book.pop();
        book.pop();
        System.out.println(book.indexOf("Python"));
        System.out.println(book.peek());
    }
}
