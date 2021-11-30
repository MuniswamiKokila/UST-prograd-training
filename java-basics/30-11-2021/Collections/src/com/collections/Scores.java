package com.collections;

import java.math.BigInteger;
import java.util.ArrayDeque;

public class Scores {
    public static void main(String[] args) {
        ArrayDeque<Integer> scores=new ArrayDeque();
        scores.add(95);
        scores.add(85);
        scores.add(67);
        scores.add(60);
        scores.add(55);
        System.out.println("Scores of subjects");
        scores.forEach(score -> System.out.println(score));

        System.out.println("removing a first score");
        System.out.println(scores.poll());
        System.out.println("After Adding First Subject Score");
        scores.addFirst(94);
        System.out.println(scores);
        System.out.println("After Adding Elective Subject Score");
        scores.addLast(89);
        System.out.println(scores);
        System.out.println("Checking the Scores of all Subjects");
        for(Integer element : scores){
            System.out.println(element);
        }

    }
}
