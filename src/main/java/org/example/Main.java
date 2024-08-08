package org.example;

import org.example.implementations.ArrayListImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayListImpl<Integer> list = new ArrayListImpl<>();
        for (int i = 0; i < 15; i++) {
            list.put(i);
        }
        list.delete(5);
        System.out.println(list);
        System.out.println(list.get(5));
    }
}