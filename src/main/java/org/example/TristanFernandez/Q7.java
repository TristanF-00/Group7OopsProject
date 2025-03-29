package org.example.TristanFernandez;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        /* Count the number of words in a String: Write a function to count the number of words in a given string.
        Words are separated by spaces or punctuation. For example, the input "Hello, World!" should return 2.
         */
        Methods me = new Methods();
        Scanner scanner = new Scanner(System.in);
        String phrase;
        // prompt the user for input
        System.out.println("This program will employ a method to count the words in the sentence you provide.");
        System.out.print("Please enter the String of which you would like the words counted. ");
        phrase = scanner.nextLine();
        // call the method and print the results
        System.out.println("There are " + me.numOfWords(phrase) + " words in the String you provided.");
        scanner.close();
    }
}
