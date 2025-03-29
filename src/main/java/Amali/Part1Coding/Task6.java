package Amali.Part1Coding;

public class Task6 {
    public static void main(String[] args) {
        String word = "documentation";
        int count = vowelsCount(word);
        System.out.println(count);
     }

    public static int vowelsCount (String str){
        String vowels = "aeiou";
        char ch ;
        int counter = 0;

        for (int i = 0; i < str.length() ; i++){
            ch = str.charAt(i);

            if (vowels.indexOf(ch) >=0){
                counter++;
            }
        }
         return counter;
    }
}
