package Class8_HW;

public class LineModification {
    public static void main(String[] args) {
        String line = "once upOn a tiMe in the UNIVERSE";
        System.out.println("Line (Before modification) : " + line);
        String finalWord = "";
        for (String name : line.split(" ")) {

            String newName = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

        finalWord = finalWord + " " + newName;

        line = finalWord.trim();

        }

        System.out.println("Line (After modification) : " + line);

    }
}
