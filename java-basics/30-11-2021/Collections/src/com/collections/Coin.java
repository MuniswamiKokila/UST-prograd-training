package com.collections;

import java.util.ArrayDeque;

public class Coin {
    public static void main(String[] args) {
        ArrayDeque<String> coin=new ArrayDeque();
        coin.add("Tail");
        coin.add("Head");
        coin.add("Head");
        coin.add("Tail");
        System.out.println(coin);
    }
}
