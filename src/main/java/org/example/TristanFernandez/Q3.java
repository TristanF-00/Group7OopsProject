package org.example.TristanFernandez;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Reverse a String: Write a program to reverse a given String
        // For example "Hello" should become "olleH"
        Scanner input = new Scanner(System.in);
        String phrase;
        // Prompt the user
        System.out.println("This Program will reverse the given String.");
        System.out.print("Please enter the String. ");
        phrase = input.nextLine();
        // reverse it
        int length = phrase.length();
        for (int i = length - 1; i >= 0; i--) {
            phrase = phrase.concat(String.valueOf(phrase.charAt(i)));
        }
        phrase = phrase.substring(length);
        // print the results
        System.out.println("The reversed String is: " + phrase);

        System.out.println("***************************");
        System.out.println();
        System.out.println("This program will reverse the given String. we are going to use StringBuilder this time.");
        System.out.print("Please enter the String. ");
        StringBuilder sentence = new StringBuilder(input.nextLine());
        // reverse it
        sentence.reverse();
        // print out the results
        System.out.println("The reversed String is: " + sentence);
        input.close();
    }
}
