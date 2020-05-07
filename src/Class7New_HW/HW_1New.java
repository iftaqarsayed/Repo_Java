package Class7New_HW;

public class HW_1New {
    public static void main(String[] args) {
        double studentScore = 175;
        double maxScore = 200;
        double percentage = (studentScore/maxScore) * 100;
        String grade = " ";

        if (percentage >= 91 && percentage <= 100) {
            grade = "A";
        }
        else if (percentage >= 81 && percentage <= 90) {
            grade = "B";
        }
        else if (percentage >= 71 && percentage <= 80) {
            grade = "C";
        }
        else if (percentage >= 61 && percentage <= 70) {
            grade = "D";
        }
        else if (percentage >= 51 && percentage <= 60) {
            grade = "E";
        }
        else if (percentage <= 50) {
            grade = "F";
        } else {
            grade = "Wrong score entered ";
        }
        System.out.println("your percentage is: " + percentage + " and your grade is: " + grade);

    }
}
