package Class8_HW;

public class HW_2 {
    public static void main(String[] args) {
        String line = "once upOn a tiMe in the UNIVERSE";
        System.out.println("Line (Before modification) : " + line);
        String finalWord = "";
        for (String name : line.split(" ")) {

            String newName = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

        finalWord = finalWord + " " + newName;

        line = finalWord;

        }

        System.out.println("Line (After modification) : " + line);
// i cant get rid of a space in front of the modified line (that is in front of "Once")

    }
}
