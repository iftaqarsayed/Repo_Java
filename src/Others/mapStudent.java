package Others;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class mapStudent {
    public static void main(String[] args) {
        Map<String, Integer> allStudent = new HashMap<>();
        allStudent.put("student1", 55);
        allStudent.put("student2", 65);
        allStudent.put("student3", 175);
        allStudent.put("student4", 85);
        allStudent.put("student5", 95);

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
