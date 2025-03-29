package Amali.Part1Coding;

public class Task4 {
    public static void main(String[] args) {
        String name = "Madam";
        name = name.toLowerCase();
      StringBuilder obj = new StringBuilder(name);
      String reversed = obj.reverse().toString();

//        String reversed = "";
//        for (int i = name.length() -1 ; i >= 0; i--){
//           reversed = reversed + name.charAt(i);
//        }

        if (name.equals(reversed)){
            System.out.println(name + " is a palindrome ");
        }
        else {
            System.out.println(name + " is not palindrome ");
        }


    }
}
