package MidTerm;

public class speedLimit {
    public static void main(String[] args) {

        speedLimit(139);

    }
    public static void speedLimit(int speed) {
        int maxSpeed = 70;
        System.out.println("your speed is = " + speed);
        System.out.println("speed limit is = " + maxSpeed);
        int point = ((speed-maxSpeed)/5);
        if (speed<maxSpeed) {
            System.out.println("Thank you for driving within the speed limit");
        } else if(speed<74) {
            System.out.println("You are over the speed limit");
        } else  if (point>0 && point<12) {
            System.out.println(point + " charged against the license for over speeding");
        } else  {
            System.out.println("For over speeding your license is suspended");
        }

    }

}
