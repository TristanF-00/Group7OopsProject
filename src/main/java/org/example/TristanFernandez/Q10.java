package org.example.TristanFernandez;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        // How can you remove all duplicates from ArrayList?
        Methods help = new Methods();
        Scanner input = new Scanner(System.in);
        // Prompt the user for input
        System.out.println("This program will remove any duplicates in the given ArrayList.");
        System.out.println("Please enter a series of words separated by single spaces.");
        String phrase = input.nextLine();
        ArrayList<String> arr = new ArrayList<>(List.of(phrase.split(" ")));
        // call the method and print the results
        arr = help.removeDuplicates(arr);
        System.out.println("The duplicated have been removed.");
        System.out.println(arr);
        // I did it for Strings here but the question did not specify what kind of ArrayList. But I believe the principal is the same.
        input.close();
    }
}
