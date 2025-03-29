package org.example.TristanFernandez;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        /*
        Find the First Non-Repeating Character in a String: Given a String, find and return the first non-repeating
        character. For example, in the string "abracadabra", the first non-repeating character is "c".
         */
        Methods methods = new Methods();
        Scanner input = new Scanner(System.in);
        // Prompt the user for input
        System.out.println("This program will employ a method to tell you the first non-repeating character in the String you provide.");
        System.out.println("Please enter the String you would like to check.");
        String phrase = input.nextLine();
        // Call the method and print the results
        System.out.println("The first non-repeating character in the String is: " + methods.firstNonRepeatChar(phrase));
        input.close();

    }
}
