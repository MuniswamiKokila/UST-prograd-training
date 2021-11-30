package com.collections;

import java.util.Scanner;
import java.util.TreeSet;

public class Rank {
    public static void main(String[] args) {
        TreeSet<Integer> rank=new TreeSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of students in class");
        int student=sc.nextInt();
        System.out.println("Enter How many got Passed in district level competition in this class ");
        int passed=sc.nextInt();
        System.out.println("Enter Students rank in their district");
        for (int i=0;i<passed;i++){
            rank.add(sc.nextInt());
        }
        System.out.println("Position of Passed students as per rank" + rank);
    }
}
