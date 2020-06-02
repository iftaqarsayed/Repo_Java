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
        int repeatRemove = 0;
        for (int i=0; i<originalArray.length; i++) {
                if (originalArray[i] == remove) {
               repeatRemove++;
                }
      }
        int [] newArray = new int[originalArray.length-repeatRemove];
        int temp = 0;
        int j=0;
            for (int i=0; i<originalArray.length; i++) {
                    if (originalArray[i] !=remove){
                       temp = originalArray[i];
                       if (newArray[j] == 0) {
                           newArray[j] = temp;
                           j++;
                       }
               }
            }

        return newArray;
    }


}
