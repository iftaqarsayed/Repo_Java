package Homework_QAFall2020;

import java.util.Arrays;

public class HW_04_30_3 {
    public static void main(String[] args) {
        String firstName = "Iftaqar";

        int indexOfr = firstName.indexOf('r');
        int length = indexOfr + 1;

        System.out.println("the length of my first name is: " + length);

       String[] arrayFirstName = firstName.split("");
        System.out.println(Arrays.toString(arrayFirstName));

        int lengthOfArray = arrayFirstName.length;

        System.out.println("length of array is : " + lengthOfArray);

    }
}
