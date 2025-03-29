package Amali.Part1Coding;

public class Task7 {
    public static void main(String[] args) {
        String countNumber = "Hello, world!";
        int count = wordCount(countNumber);
        System.out.println(count);

    }

    public static  int wordCount (String str){
        String[] strArr = str.split(" ");
        return strArr.length;
    }

}
