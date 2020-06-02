package Homework_QAFall2020;

import java.util.ArrayList;
import java.util.List;

public class temp {
    public static void main(String[] args) {
        String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};

        List<String> names = new ArrayList<>();
        String repeatName = "";
        for (int i=0 ; i < words.length-1 ; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i] == words[j]) {

                    repeatName= words[i];
                    names.add(repeatName);
                    break;
                }
            }
        }
        System.out.println(names);
    }
}
