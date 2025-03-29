package org.example.TristanFernandez;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Find out how many alpha characters are present in a String
        Scanner input = new Scanner(System.in);
        String phrase;
        // Prompt the user for input
        System.out.println("This program will report back the numbers of alpha characters present in a String.");
        System.out.print("Please enter the String. ");
        phrase = input.nextLine();
        // count the alpha characters
        int alphaChars = phrase.replaceAll("[^a-zA-Z]","").length();
        // print the results
        System.out.println("The number of alpha characters in the String is " + alphaChars);
        // now we are going to use Stringbuilder
        System.out.println("**********************************");
        System.out.println();
        System.out.println("This program will report back the number of alpha characters present in a String.");
        System.out.print("Please enter the String. ");
        StringBuilder sentence = new StringBuilder(input.nextLine());
        for (int i = sentence.length() - 1; i >= 0; i--) {
            if (!Character.isLetter(sentence.charAt(i))) {
                sentence.deleteCharAt(i);
            }
        }
        /** Alternatively
         * alphaChars = 0;
         * for (int i = 0; i < sentence.length(); i++) {
         *  if (Character.isLetter(sentence.charAt(i))) {
         *  alphaChars += 1;
         *  }
         * }
         *  System.out.println("The number of alpha characters in the String is " + alphaChars);
         */
        alphaChars = sentence.length();
        System.out.println("The number of alpha characters in the String is " + alphaChars);

        input.close();
    }
}
