package Amali.Part1Coding;

public class Task9 {
    public static void main(String[] args) {
        String name = "abracadabra";
        System.out.println(firstNonRepeatingCharacter(name));
    }

    static public char  firstNonRepeatingCharacter (String str){
     for (int i = 0; i <str.length(); i++){
         if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
             return str.charAt(i);
         }
     }
     return '1';
    }
}
