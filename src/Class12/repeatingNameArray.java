package Class12;

import java.util.ArrayList;
import java.util.List;

public class repeatingNameArray {
    public static void main(String[] args) {
        String[] words = {"happy", "peace", "joy", "grow", "laugh", "joy", "happy", "laugh", "joy"};
        System.out.println(repeatName(words));

    }
    public static List<String> repeatName (String [] allWords) {
        List<String> names = new ArrayList<>();
        String repeatName = "";
        for (int i=0 ; i < allWords.length-1 ; i++) {
            for (int j = i + 1; j < allWords.length; j++) {
                if (allWords[i] == allWords[j]) {
                    repeatName= allWords[i];
                    names.add(repeatName);
                    break;
                }
            }
        }
       return names;
    }

}
