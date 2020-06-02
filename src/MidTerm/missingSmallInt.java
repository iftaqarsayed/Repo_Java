package MidTerm;

public class missingSmallInt {
    public static void main(String[] args) {
      int[] arrayAll = {0, 6, -1, 1, 4, 5, 3, 10, 8, 2};

        int missing = smallInt(arrayAll);
        System.out.println(missing);

    }

    public static int smallInt(int[] arrays) {

    int smallest=0;
        while (true) {
            boolean foundNum = false;
            smallest++;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == smallest) {
                foundNum = true;
                break;
            }
        }
       if (!foundNum) {
           break;
     }
       }

return  smallest;
    }

}
