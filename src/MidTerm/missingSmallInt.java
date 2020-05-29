package MidTerm;

public class missingSmallInt {
    public static void main(String[] args) {
      int[] arrayAll = {0, 5, -1, 2, 5, 3, 10, 8, 2};

        System.out.println(smallInt(arrayAll));

    }

    public static int smallInt(int[] arrays) {
    int smallest = 0;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > 0) {
                for (int j = 1; j < 100; j++) {
                    if (j!=arrays[i]) {
                        smallest = j;
                    } break;
                }

            }
        }

return  smallest;
    }

}
