package MidTerm;

import java.util.Arrays;

public class removeArray {
    public static void main(String[] args) {
        int[] mainArray = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int toRemove = 24;
        int [] finalArray = returnArray(mainArray,toRemove);
        System.out.println(Arrays.toString(finalArray));


    }

    public static int[] returnArray(int[] originalArray, int remove) {

        int firstNum = originalArray[0];
        for (int i=0; i<originalArray.length; i++) {
                if (originalArray[i] != remove) {
               firstNum = originalArray[i];
               originalArray[i] =firstNum;
               break;
                }


            }


        return originalArray;
    }


}
