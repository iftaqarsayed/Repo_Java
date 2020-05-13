package Class9_HW;

public class Hw_2 {
    public static void main(String[] args) {
        int [] allNumbers = {5, 10, 15, 10, 20, 0};
        double result = averageOf(allNumbers);

        System.out.println("Average of the given array: " + result);
    }

    public static double averageOf(int[] numbers) {
        double total = 0;
        double average = 0;

        for (int value : numbers) {
            double allNumbers = value;
            total += allNumbers;
            average = total/numbers.length;
        }
        return average;
    }

}
