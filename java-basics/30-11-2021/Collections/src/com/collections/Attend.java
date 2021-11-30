package com.collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Attend {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Students strength in this class");
        int n=sc.nextInt();
        System.out.println("Enter rollno of students in this class");
        for (int i=0;i<n;i++){
            lhs.add(sc.nextInt());
        }
        System.out.println("Enter the roll no you want to call");
        int roll=sc.nextInt();
        if(lhs.contains(roll)){
            System.out.println("Student " + roll + " is Present in this class");
        }
        else {
            System.out.println("Student " + roll + " is not there in this class");
        }

    }
}
