package com.collections;

import java.util.LinkedList;

public class Attendance {
    public static void main(String[] args) {
        LinkedList<Integer> rollno=new LinkedList();
        rollno.add(01);
        rollno.add(02);
        rollno.add(03);
        rollno.add(04);
        System.out.println("Roll Nos of Students");
        System.out.println(rollno);
        System.out.println("Roll no 02 is absent");
        rollno.remove(1);
        rollno.forEach(present -> System.out.println(present));
    }
}
