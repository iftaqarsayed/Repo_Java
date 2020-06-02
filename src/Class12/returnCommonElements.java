package Class12;

import java.util.ArrayList;
import java.util.List;

public class returnCommonElements {
    public static void main(String[] args) {
        int[] arr1 = {11, 32, 43, 54, 65, 89, 100, 45, 23};
        int[] arr2 = {76, 11, 89, 43, 87, 23, 32};

        searchCommon(arr1,arr2);
    }
    public static void searchCommon(int[] first, int[] toSearch) {
        List<Integer> result = new ArrayList<>();
        int commonNum;
        for (int i=0; i<first.length; i++) {
            for (int j=0;j<toSearch.length;j++) {
                if (first[i]==toSearch[j]) {
                    commonNum = first[i];
                    result.add(commonNum);
                }
            }
        }
        System.out.println(result);
    }

}
