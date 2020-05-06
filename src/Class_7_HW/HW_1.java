package Class_7_HW;

public class HW_1 {
    public static void main(String[] args) {
        double studentScore = 170;
        double maxScore = 200;
        double percentage = (studentScore/maxScore) * 100;
        char grade = ' ';

        if (percentage >= 91 && percentage <= 100) {
            grade = 'A';
            System.out.println("your percentage is: " + percentage + " and your grade is: " + grade);
        }
        else if (percentage >= 81 && percentage <= 90) {
            grade = 'B';
            System.out.println("your percentage is: " + percentage + " and your grade is: " + grade);
        }
        else if (percentage >= 71 && percentage <= 80) {
            grade = 'C';
            System.out.println("your percentage is: " + percentage + " and your grade is: " + grade);
        }
        else if (percentage >= 61 && percentage <= 70) {
            grade = 'D';
            System.out.println("your percentage is: " + percentage + " and your grade is: " + grade);
        }
        else if (percentage >= 51 && percentage <= 60) {
            grade = 'E';
            System.out.println("your percentage is: " + percentage + " and your grade is: " + grade);
        }
        else if (percentage <= 50) {
            grade = 'F';
            System.out.println("your percentage is: " + percentage + " and your grade is: " + grade);
        } else {
            System.out.println("Wrong score entered and percentage is: " + percentage);
        }


    }
}
