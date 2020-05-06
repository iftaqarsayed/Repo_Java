package Class_7_HW;

public class HW_3 {
    public static void main(String[] args) {

        int num = 15;
        int num2 = num%3;
        int num3 = num%5;

        if (num2 == 0 || num3 == 0) {
            if (num2 == 0 && num3 != 0) {
                System.out.println(num + " is divisible by 3");
            } else if (num2 != 0 && num3 == 0) {
                System.out.println(num + " is divisible by 5");
            } else {
                System.out.println(num + " is divisible by both");
            }
        }
            else {
                System.out.println("the number is: " + num);
            }




    }
}
