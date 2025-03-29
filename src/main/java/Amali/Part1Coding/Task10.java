package Amali.Part1Coding;

import java.util.ArrayList;
import java.util.HashSet;

public class Task10 {
    public static void main(String[] args) {
        ArrayList <String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("strawberry");
        fruits.add("Banana");

        HashSet <String> list = new HashSet<>(fruits);
        fruits.clear();
        fruits.addAll(list);
        System.out.println(fruits);
    }

}
