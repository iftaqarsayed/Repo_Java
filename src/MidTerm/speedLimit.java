package MidTerm;

public class speedLimit {
    public static void main(String[] args) {

        speedLimit(76);

    }
    public static void speedLimit(int speed) {
        System.out.println("your speed is = " + speed);
        System.out.println("speed limit is = 70");
        int point = 0;

        if (speed<=70) {
            System.out.println("Thank you for driving within the speed limit");
        } else if (speed>70 && speed<=74) {
            System.out.println("you are over the speed limit");
        } else if (speed>=75 && speed<=79) {
            point = 1;
            System.out.println(point + " point charged against the license for over speeding");
        } else if (speed>=80 && speed<=84) {
            point = 2;
            System.out.println(point + " point charged against the license for over speeding");
        } else if (speed>=85 && speed<=89) {
            point = 3;
            System.out.println(point + " point charged against the license for over speeding");
        } else if (speed>=90 && speed<=94) {
            point = 4;
            System.out.println(point + " point charged against the license for over speeding");
        } else if (speed>=95 && speed<=99) {
            point = 5;
            System.out.println(point + " point charged against the license for over speeding");
        } else if (speed>=100 && speed<=104) {
            point = 6;
            System.out.println(point + " point charged against the license for over speeding");
        } else if (speed>=105 && speed<=109) {
            point = 7;
            System.out.println(point + " point charged against the license for over speeding");
        } else if (speed>=110 && speed<=114) {
            point = 8;
            System.out.println(point + " point charged against the license for over speeding");
        } else if (speed>=115 && speed<=119) {
            point = 9;
            System.out.println(point + " point charged against the license for over speeding");
        } else if (speed>=120 && speed<=124) {
            point = 10;
            System.out.println(point + " point charged against the license for over speeding");
        } else if (speed>=125 && speed<=129) {
            point = 11;
            System.out.println(point + " point charged against the license for over speeding");
        } else if (speed>=130) {
            point = 12;
            System.out.println(point + " point charged (License suspended)");
        }

    }

}
