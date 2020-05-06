package Class_7_HW;

public class HW_2 {
    public static void main(String[] args) {
     char carMode = 'D';
     String driveType = "eco";

     switch (carMode) {
         case 'P':
             System.out.println("you can park car");
         break;
         case 'D':
             if (driveType == "snow") {
                 System.out.println("You are on Snow mode");
             } else if (driveType == "sport") {
                 System.out.println("You are on Sport mode");
             } else if (driveType == "eco") {
                 System.out.println("You are on Eco mode");
             }
         break;
         case 'N':
             System.out.println("put car in car wash");
         break;
         case 'R':
             System.out.println("revere the car");
         break;
         default:
             System.out.println("Wrong car mode: " + carMode);
     }



    }
}
