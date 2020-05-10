package Class8_HW;

public class HW_1 {
    public static void main(String[] args) {


        String msg = "have a great day to you";
        String abr = "";
        for (String name : msg.split(" ") ) {
            char firstLetter = name.toUpperCase().charAt(0);
            abr = abr + firstLetter;
        }
        System.out.println("Abbreviation: " + abr);



    }

}
