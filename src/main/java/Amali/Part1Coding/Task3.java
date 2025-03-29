package Amali.Part1Coding;

public class Task3 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverse(str));

    }

    static String reverse(String text) {
        StringBuilder obj = new StringBuilder(text);

        return obj.reverse().toString();
    }
}