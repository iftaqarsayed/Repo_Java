package Class8_HW;

import java.util.Arrays;

public class HW_3 {
    public static void main(String[] args) {
        String message = "happy holidays";
        String reverseMessage = "";
        System.out.println("Message : " + message);

        String [] newMessage = message.split("");


        for (int i=newMessage.length -1; i>=0; i--) {
           String new2 = newMessage[i];
           reverseMessage = reverseMessage + new2;
        }

        System.out.println("Message in reverse: " + reverseMessage);



    }
}
