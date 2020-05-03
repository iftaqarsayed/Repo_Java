package Homework_QAFall2020;

import java.util.Arrays;

public class HW_04_30_2 {
    public static void main(String[] args) {
     String myStatement = "I am a good programmer";
        String[] splitSentence = myStatement.split(" ");

    String allWord = Arrays.toString(splitSentence);
        System.out.println(allWord);

    int lengthOfSentence = splitSentence.length;

        System.out.println("last word of the sentence is: " + allWord.substring(lengthOfSentence-1));
        // i don't know whats wrong here, couldn't find the proper code for last word

        int indexOfP = myStatement.indexOf('p');
        System.out.println("index of 'p': " + indexOfP);

        String lastWord2 = myStatement.substring(12);
        System.out.println("last word of the sentence is: " + lastWord2);
        // i tried a different way here to get the last word but i still need to know the proper way to find it.

      System.out.println("total number of words in the myStatement is: " + lengthOfSentence);
       String afterReplacement = myStatement.replaceAll("r", "f");

        System.out.println("after replacing 'r' to 'f' the sentence : " + afterReplacement);
    }
}
