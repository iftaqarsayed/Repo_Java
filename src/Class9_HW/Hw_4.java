package Class9_HW;

public class Hw_4 {

    public static void main(String[] args) {
        int [] allNumbers = {80, 115, 120, 100, 180};
        String[] names = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
        int result = maximumOf(allNumbers);
        
        String studentName = names[result];
      System.out.println(studentName + " scored the maximum score(" + allNumbers[result] + ")");
    }

    public static int maximumOf(int[] numbers) {
        int maximumNumber = numbers[0];
        int indexOf = 0;
        for (int i=0; i<numbers.length; i++) {
            if ( numbers[i] > maximumNumber ) {
                maximumNumber=numbers[i];
                indexOf=i;
            }
        }
        return indexOf;
    }

}
