package Others;

public class repeating {
    public static void main(String[] args) {

        String[] words = {"happy", "peace", "laugh", "love", "grow", "learn", "happy", "laugh", "laugh"};
        String repeatName = "";
       // int count = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
              /*  if (words[i] == words[j]) {
                    count++;
                }*/
                if (words[i].equalsIgnoreCase(words[j])) {
                    repeatName = words[i];
                    System.out.println(repeatName);
                    break;
                }
            }
        }
    }
}

