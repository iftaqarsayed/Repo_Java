package Homework_QAFall2020;

public class Homework_1 {

    public static void main(String[] args) {

        int d = 5;
        System.out.println(d++); // 5
        System.out.println(d++); // 6
        System.out.println(++d); // 8
        System.out.println(d);   // 8
        System.out.println(--d); // 7
        System.out.println(d);   // 7
        System.out.println(d++);  // 7

        /*
     added this to see if it works also
     */
        System.out.println(d);     // 8
        System.out.println(d--);  //  8
        System.out.println(d++);  //  7
        System.out.println(d++);  // 8
        System.out.println(d);    // 9

    }

}
