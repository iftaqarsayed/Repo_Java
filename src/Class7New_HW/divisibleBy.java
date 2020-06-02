package Class7New_HW;

public class divisibleBy {
    public static void main(String[] args) {

        int num = 15;


        if (num%3 == 0 || num%5 == 0) {
            if (num%3 == 0 && num%5 != 0) {
                System.out.println(num + " is divisible by 3");
            } else if (num%3 != 0 && num%5 == 0) {
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
