package org.example.TristanFernandez;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        /*
        Check is 2 Strings are Anagrams: Given two strings, determine if they are anagram, meaning
        they contain the same characters in a different order. For example, "listen" and "silent" are
        anagrams.
         */
        Scanner input = new Scanner(System.in);
        String s1, s2;
        // Prompt the user for the 2 Strings that we will be checking if they are anagrams
        System.out.println("This program will check if the 2 Strings given are anagrams of each other.");
        System.out.print("Please enter the first String. ");
        s1 = input.nextLine();
        System.out.print("Please enter the second String. ");
        s2 = input.nextLine();
        // Now we have to find a way to figure out if they contain the same letters but in a different order.
        String check = s1.toLowerCase().replaceAll("[^a-z]", "");
        String checked = s2.toLowerCase().replaceAll("[^a-z]", "");
        String checker = checked;
        for (int i = 0; i < check.length(); i++) {
            for (int j = 0; j < checked.length(); j++) {
                if (check.charAt(i) == checked.charAt(j)) {
                    checked = checked.substring(0, j).concat(checked.substring(j + 1));
                    break;
                }
            }
        }
        // Print the results
        if (checked.isEmpty() && !s1.equalsIgnoreCase(s2) && checker.length() == check.length()) {
            System.out.println("The 2 Strings provided are in fact anagrams.");
        } else {
            System.out.println("The 2 Strings provided are not anagrams.");
        }
        // trying to use arraylist
        System.out.println("*********************************");
        System.out.println();
        System.out.println("Okay I want to try it another way");
        ArrayList<Character> string2 = new ArrayList<>();
        for (char b : s2.toLowerCase().replaceAll("[^a-z]","").toCharArray()) {
            string2.add(b);
        }
        ArrayList<Character> string1 = new ArrayList<>();
        for (char a : s1.toLowerCase().replaceAll("[^a-z]","").toCharArray()) {
            string1.add(a);
        }
        // I couldn't find a fancier way to make them into the arraylists :(
        string2.removeAll(string1);
        if (string2.isEmpty() && !s1.equalsIgnoreCase(s2) && checker.length() == check.length()) {
            System.out.println("The 2 Strings provided are actually anagrams.");
        } else {
            System.out.println("The 2 Strings given are not anagrams.");
        }
        input.close();
    }
}
