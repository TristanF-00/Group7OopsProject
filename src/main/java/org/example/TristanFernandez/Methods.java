package org.example.TristanFernandez;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Methods {
    // method to count how many vowels are present in a string
    int numOfVowels(String string) {
        return string.toLowerCase().replaceAll("[^aeiou]", "").length();
    }

    // method to count how many words are in a String
    int numOfWords(String sentence) {
        // I don't understand the punctuation part, when are we not putting spaces in between all of our words and just putting punctuation?
        String[] words = sentence.split(" ");
        return words.length;
    }

    // method to trim list of Strings, keep the ones that start with "A" and return in lower case
    ArrayList<String> trimArrayList(ArrayList<String> stringArrayList) {
        stringArrayList.removeIf(string -> !string.startsWith("A"));
        stringArrayList.replaceAll(String::toLowerCase);
        return stringArrayList;
    }

    // method to find the first non-repeating character in a String
    char firstNonRepeatChar(String string) {
        string = string.toLowerCase().replaceAll(" ","");
        String check = string;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    check = check.replaceAll(String.valueOf(string.charAt(i)),"");
                    break;
                }
            }
        }
        return check.charAt(0);
    }
    // method to remove the duplicates from an ArrayList
    ArrayList<String> removeDuplicates(ArrayList<String> arrayList) {
        Set<String> set = new LinkedHashSet<String>(arrayList);
        arrayList = new ArrayList<>(set);
        return arrayList;
    }
}
