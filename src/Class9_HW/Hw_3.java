package Class9_HW;

public class Hw_3 {
    public static void main(String[] args) {
        int [] allNumbers = {5, 10, 15, 100, 140, 18};
        int result = maximumOf(allNumbers);

        System.out.println("Maximum value in the given array: " + result);
    }

    public static int maximumOf(int[] numbers) {
        int maximumNumber = numbers[0];
        for (int i=0; i<numbers.length; i++) {
            if ( numbers[i] > maximumNumber ) {
                maximumNumber = numbers[i];
            }
        }
        return maximumNumber;
    }
}
