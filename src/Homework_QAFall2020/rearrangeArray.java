package Homework_QAFall2020;

import java.util.Arrays;

public class rearrangeArray {

        public static void main(String[] args) {
            int[] array = {11, 22, 43, 32, 54, 1};
            int[] sorted = sortedOfArray(array);
            System.out.println(Arrays.toString(sorted));

        }
        public static int[] sortedOfArray(int[] numbers) {

            for (int i = 0; i < numbers.length-1; i++) {
                for (int j= i+1; j<numbers.length; j++){
                    if (numbers[j] < numbers[i]) {
                        int firstNum = numbers[j];
                        numbers[j] = numbers[i];
                        numbers[i] = firstNum;
                    }
                }
            }
            return numbers;
        }

}
