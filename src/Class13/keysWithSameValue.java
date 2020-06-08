package Class13;

import java.util.*;

public class keysWithSameValue {
    public static void main(String[] args) {
        Scanner list = new Scanner(System.in);
        System.out.println("Please enter how many pair of key-value you want to put");
       int num = list.nextInt();
        Map<Integer, String> myMapList = new HashMap<>();
        for (int i = 0; i < num ; i++) {
            System.out.println("Please enter a key (Integer) :");
            Integer key = list.nextInt();
            System.out.println("Please enter value (String) to store with '" + key + "' key:");
            String value = list.next();
            myMapList.put(key, value);
        }

        System.out.println(myMapList);
        sameValueKeys(myMapList);
    }

    public static void sameValueKeys (Map<Integer, String> myHash){
        Collection<String> names = myHash.values();
        System.out.println(names);

        Set<Integer> sameKeys = new HashSet<>();
        Set<Integer> allKeys = myHash.keySet();

        for (Integer key : allKeys) {
            System.out.println(myHash.get(key));
            // how i can create the second loop to compare?
           if (myHash.get(key) ==myHash.get((key+1))) { // cant even compare here
                sameKeys.add(key);
            }

            if (sameKeys.size() > 0) {
                System.out.println(sameKeys);
            } else {
                System.out.println("All keys have different values");
            }
        }
    }

}
