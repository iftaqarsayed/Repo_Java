package Others;

import java.util.*;

public class mapStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter how many pair of key-value you want to put");
        int num = scanner.nextInt();
        Map<String, Integer> allStudent = new HashMap<>();
        for (int i = 0; i < num ; i++) {
            System.out.println("Please enter a key (String) :");
            String key = scanner.next();
            System.out.println("Please enter value (Integer) to store with '" + key + "' key:");
            Integer value = scanner.nextInt();
            allStudent.put(key, value);
        }
        /*allStudent.put("student1", 55);
        allStudent.put("student2", 65);
        allStudent.put("student3", 175);
        allStudent.put("student4", 85);
        allStudent.put("student5", 95);*/

        Collection<Integer> marks = allStudent.values();

        Integer maxNum = Collections.max(marks);
        String topper = "";

        for (String name : allStudent.keySet()) {
            if (allStudent.get(name) == maxNum) {
                topper = name;
                break;
            }
        }
        System.out.println(topper + " scored max " + maxNum + " in the class");

    }

}
