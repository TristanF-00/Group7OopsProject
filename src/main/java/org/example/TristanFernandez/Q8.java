package org.example.TristanFernandez;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        /*
        You have a list of Strings and you want to keep only those that start with "A" and you want to
        return them in lower case
         */
        Methods methods = new Methods();
        Scanner scan = new Scanner(System.in);
        // prompt the user for input
        System.out.println("This program will take in a list of Strings from you and then trim the list to only include those that started with a capital A.");
        System.out.println("Please enter the list of words each separated by a single space. ");
        String list = scan.nextLine();
        ArrayList<String> stringList = new ArrayList<>(List.of(list.split(" ")));
        // call the method and print the results
        stringList = methods.trimArrayList(stringList);
        System.out.println("Your list has been trimmed and these are the results.");
        System.out.println(stringList);
        scan.close();
    }
}
