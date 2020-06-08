package Class13;

import java.util.*;

public class studentMaxNumByHashmap {
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

      String studentName = maxNumStudent(allStudent);
        System.out.println(studentName + " scored max " + allStudent.get(studentName) + " number in the class");
    }
    public static String maxNumStudent (Map<String, Integer> students) {

        Collection<Integer> marks = students.values();

        Integer maxNum = Collections.max(marks);
        String topper = "";

        for (String name : students.keySet()) {
            if (students.get(name) == maxNum) {
                topper = name;
                break;
            }
        }
    return topper;
    }
}
