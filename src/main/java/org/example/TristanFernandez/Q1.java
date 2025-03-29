package org.example.TristanFernandez;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Write a program to swap 2 Strings without a temporary variable
        Scanner input = new Scanner(System.in);
        String s1, s2;
        // Prompt the user for input
        System.out.println("This program will swap the values of 2 Strings without a temporary variable.");
        System.out.print("Please enter the value for the first String. ");
        s1 = input.nextLine();
        System.out.print("Please enter the value for the second String. ");
        s2 = input.nextLine();
        input.close();
        // switch the values
        s1 = s1.concat(s2);
        s2 = s1.replace(s2,"");
        s1 = s1.replace(s2,"");
        // print the results
        System.out.println("We will now print the results.");
        System.out.println("String 1 is now: " + s1);
        System.out.println("String 2 is now: " + s2);
    }
}
