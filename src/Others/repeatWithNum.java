package Others;

public class repeatWithNum {
    public static void main(String[] args) {
        String[] word = {"happy", "peace", "laugh", "love", "grow", "learn", "happy", "laugh", "laugh"};
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            count = 0;
            for (int j = 0; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    count++;
                }
            }
            if(count>1)   //show only duplicate word
                System.out.println("the word " + word[i] + " occurred " + count + " time");

        }

    }
}
