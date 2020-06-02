package Others;

public class repeating {
    public static void main(String[] args) {

        String[] words = {"happy", "peace", "laugh", "love", "grow", "learn", "happy", "laugh", "loved"};

        for (int i=0 ; i < words.length-1 ; i++) {
            for (int j=i+1; j<words.length ; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    System.out.println(words[i]);
                    break;
                }
            }
        }

    }

}
