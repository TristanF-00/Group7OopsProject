package org.example.TristanFernandez;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        /*
        Check if a String is a Palindrome: Determine whether a given string is a palindrome,
        which means it reads the same forwards and backward. For example "madam" is a palindrome.
         */
        Scanner input = new Scanner(System.in);
        String phrase;
        // Prompt the user for input
        System.out.println("This program will determine whether a given String is a Palindrome or not.");
        System.out.print("Please enter the String you'd like to check. ");
        phrase = input.nextLine();
        // We check if it is a Palindrome or not
        String cleanedPhrase = phrase.toLowerCase().replaceAll("[^a-z]","");
        StringBuilder reverse = new StringBuilder(cleanedPhrase);
        reverse.reverse();
        // Print the results
        if (cleanedPhrase.equals(reverse.toString())) {
            System.out.println("The String provided: " + phrase);
            System.out.println("Is a Palindrome.");
        } else {
            System.out.println("The String provided: " + phrase);
            System.out.println("Is not a Palindrome.");
        }
        input.close();
    }
}
