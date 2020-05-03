package Homework_QAFall2020;

public class HomeWork_04_30_1 {
    public static void main(String[] args) {
        String firstName = "Iftaqar";

        int lengthOfFirstName = firstName.length();
        System.out.println("length of my first name: " + lengthOfFirstName);
        Boolean isEquals = firstName.substring(0, 1).equals("K");
        System.out.println("does my name starts with 'K': " + isEquals);
        char firstAlpha = firstName.charAt(0);
        System.out.println("first alphabet of my name is: " + firstAlpha);

        boolean isEqualsIgnoringCase = firstName.substring(firstName.length() -1).equalsIgnoreCase("M");
       System.out.println("does my name ends with 'M': " + isEqualsIgnoringCase);

    }

}
