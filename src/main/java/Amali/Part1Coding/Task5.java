package Amali.Part1Coding;

public class Task5 {
    public static void main(String[] args) {
        String name = "heart";
        String name1 = "heard";

        if (isAnagrame(name,name1)){

            System.out.println("Is anagram ");
        }
        else {
            System.out.println("Is not anagram ");
        }

    }

   static boolean isAnagrame (String str,String str1){

        if (str.length() != str1.length()){
            return false;
        }

        char ch;
        for (int i = 0; i < str.length(); i++){
           ch = str.charAt(i);

           if (str1.indexOf(ch) == -1){
               return false;
           }
        }

        return true;
    }
}
