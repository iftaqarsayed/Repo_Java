package Class8_HW;

public class palindrome {
    public static void main(String[] args) {
        String word = "lEvel";  //ecar
        boolean result=false;
        String new1 = "";
        String[] newWord = word.split("");
        for (int i=newWord.length-1; i>=0; i--) {
            String new2 = newWord[i];
            new1 += new2;
        }
            if (word.equalsIgnoreCase(new1)) {
                result = !result;
            }

        System.out.println("is " + word + " a palindrome: " + result);


    }
}
