package Homework_QAFall2020;

public class Labwork2 {
    public static void main(String[] args) {
     /**   String fullName = "Iftaqars Sayed";
        String firstName = fullName.split(" ")[0];

        int length = firstName.length();
        String isEnrolled = length>7 || firstName.startsWith("A")?"enrolled":"try later";

        System.out.println("is enrolled = " + isEnrolled);
      */
     String threeWord = "how are you";
     int lengthOfstring = threeWord.split(" ").length;

        System.out.println(lengthOfstring);

        char first = threeWord.split(" ")[0].charAt(0);
        char second = threeWord.split(" ")[1].charAt(0);
        char third = threeWord.split(" ")[2].charAt(0);

        System.out.println(first + "" + second + "" + third);
    }

}
