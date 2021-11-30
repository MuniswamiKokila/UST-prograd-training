package com.collections;

import java.util.HashSet;
import java.util.List;

public class Student {
    public static void main(String[] args) {
        HashSet<Integer> details=new HashSet();
        HashSet<Integer> details1=new HashSet(List.of(101,205,106,110));
        details.add(101);
        details.add(201);
        details.add(105);
        details.add(106);
        System.out.println("Rollno of Students who completed Java Exam");
        System.out.println(details);
        System.out.println("Rollno of Students who completed C exam");
        details.addAll(List.of(101,205,106,110));
        System.out.println(details1);
        details.addAll(details1);
        System.out.println("Students who completed atleast one exam in Java and C");
        System.out.println(details);
    }
}
