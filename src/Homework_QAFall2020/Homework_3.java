package Homework_QAFall2020;

public class Homework_3 {
    public static void main(String[] args) {

        double cTemperature = 16;
        double fTemperature = 9/5.0 * (cTemperature) + 32;
        System.out.println(fTemperature);
        double kTemperature2 = 200;
        double fTemparature2 = 9/5.0 * (kTemperature2 - 273) + 32;
        System.out.println(fTemparature2);
        double cTemperature3 = 30.5;
        double kTemperature3 = cTemperature3 + 273;
        System.out.println(kTemperature3);
        double kTemperature4 = 303.50;
        double cTemperature4 = kTemperature4 - 273;
        System.out.println(cTemperature4);
        double fTemperature5 = 90;
        double kTemperature5 = 5/9.0 * (fTemperature5 - 32) + 273;
        System.out.println(kTemperature5);
        // values are a little different because in the website they use 273.15 instead of 273

    }
}
