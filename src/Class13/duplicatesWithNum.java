package Class13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class duplicatesWithNum {
    public static void main(String[] args) {
        String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        System.out.println(duplicateWords(words));

    }
        public static Map<String, Integer> duplicateWords (String[] allWords) {
            Map<String, Integer> withValue = new HashMap<>();
            int count = 0;
            for (int i=0; i<allWords.length;i++) {
                count = 0;
                for (int j = 0; j < allWords.length; j++) {
                    if (allWords[i].equals(allWords[j])) {
                        count++;
                    }
                }
                if(count>1){
                    withValue.put(allWords[i], count);
                }

            }
            return withValue;
    }


}
