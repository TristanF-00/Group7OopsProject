package Amali.Part1Coding;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Animal", "Angel", "Syntax", "Flowers", "Hello"));
        list.removeIf(word -> !word.startsWith("A"));

        String currentWord;
        for (int i = 0; i < list.size(); i++) {
                currentWord = list.get(i);

                list.set(i, currentWord.toLowerCase());




        }
                 System.out.println(list);
      }
  }