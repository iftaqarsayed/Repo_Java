package Class13;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class studentMaxNumByHashmap {
    public static void main(String[] args) {
        Map<String, Integer> allStudent = new HashMap<>();
        allStudent.put("student1", 55);
        allStudent.put("student2", 65);
        allStudent.put("student3", 175);
        allStudent.put("student4", 85);
        allStudent.put("student5", 95);
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
