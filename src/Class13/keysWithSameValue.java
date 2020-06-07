package Class13;

import java.util.*;

public class keysWithSameValue {
    public static void main(String[] args) {
        Map<Integer, String> myMapList = new HashMap<>();
        myMapList.put(10, "John");
        myMapList.put(20, "Robin");
        myMapList.put(30, "John");
        myMapList.put(40, "Chris");
        myMapList.put(50, "Robin");
        myMapList.put(60, "Steve");
        myMapList.put(70, "John");
        System.out.println(myMapList);
        sameValueKeys(myMapList);
    }

    public static void sameValueKeys (Map<Integer, String> myHash){
        Collection<String> names = myHash.values();
       // System.out.println(names);

        Set<Integer> allKeys = new HashSet<>(myHash.keySet());
        System.out.println(allKeys.size());
        Set<Integer> sameKeys = new HashSet<>();
        for (Integer i=0; i<allKeys.size()-1; i++){          //cant figure out how to do the for loop twice
            for (Integer j=i+1;j<allKeys.size(); j++){
                if (myHash.get(i).equals(myHash.get(j))){
                    sameKeys.add(i);
                    sameKeys.add(j);
                }
            }
        }
        if (sameKeys.size()>0) {
            System.out.println(sameKeys);
        } else {
            System.out.println("All keys have different values");
        }

    }

}
