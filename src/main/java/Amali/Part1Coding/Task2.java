package Amali.Part1Coding;

public class Task2 {
    public static void main(String[] args) {
        String testString ="Hello World123";

        System.out.println("Alphabetic characters count: " + countAlphaCharacters(testString));
    }


    public static long countAlphaCharacters (String str) {
//        return str.chars().filter(Character :: isLetter).count();

        int letterCount = 0;
        for (int i = 0; i < str.length(); i++){
              if ( Character.isLetter( str.charAt(i) ) )  {
                  letterCount++;
              }
        }

        return letterCount;
    }

}
