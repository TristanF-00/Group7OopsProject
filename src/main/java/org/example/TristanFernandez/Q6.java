package org.example.TristanFernandez;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // Create a method to count how many vowels are present in a string "documentation"
        // see Methods
        Methods mine = new Methods();
        Scanner input = new Scanner(System.in);
        String userInput;
        // Prompt the user for input
        System.out.println("This program will employ a method to count the number of vowels present in the String you provide.");
        System.out.print("Please enter the String where you'd like the vowels counted. ");
        userInput = input.nextLine();
        // call the method and print the results
        System.out.println("There are " + mine.numOfVowels(userInput) + " vowels in the String you provided.");
        input.close();
    }
}
