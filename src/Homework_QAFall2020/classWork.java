package Homework_QAFall2020;

public class classWork {
    public static void main(String[] args) {

        String var = "hello how are you? I am good.";

        int varLength = var.length();

        String last4Letter = var.substring(varLength-4);

        System.out.println("last 4 letters are " + last4Letter);

    }

}
