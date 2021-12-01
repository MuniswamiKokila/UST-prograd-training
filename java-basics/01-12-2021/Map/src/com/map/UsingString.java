package com.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsingString {
    public static void main(String[] args) {
        ArrayList<String> dict=new ArrayList<>(List.of("Kokila","Akshaya","Deepika","Akash","Neelu"));
        System.out.println("Names with Starting Letter A");
        dict.stream()
                .filter(var -> var.startsWith("A"))
                .forEach(System.out::println);
        System.out.println("Names with Ending Letter a");
        dict.stream()
                .filter(var -> var.endsWith("a"))
                .forEach(System.out::println);
    }
}
