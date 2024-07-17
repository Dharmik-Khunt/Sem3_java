
import java.util.*;

public class practical3 {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        char[] letter = {'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4',
            '5', '6', '7', '8', '9', '0'};
        String[] code
                = {".-", "-...", "-.-.", "-..", ".",
                    "..-.", "--.", "....", "..", ".---",
                    "-.-", ".-..", "--", "-.", "---",
                    ".--.", "--.-", ".-.", "...", "-",
                    "..-", "...-", ".--", "-..-", "-.--",
                    "--..", "|"};

        System.out.print("Enter 1 for String to Morse code conversion\nEnter 2 for Morse code to String conversion\nEnter 3 To Exit\n");
        int n = sr.nextInt();

        if (n == 1) {
            System.out.print("enter a string :");
            String str = sr.next();
            System.out.print("morce code   ");
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < letter.length; j++) {
                    if (str.charAt(i) == letter[j]) {
                        System.out.print(code[j]);
                    }

                }

            }

        }
        if (n == 2) {

            System.out.print("enter a morce code :");
            Scanner S = new Scanner(System.in);
            String str = S.nextLine();
            System.out.print("string :");
            String[] array = str.split(" ");
            for (String morce : array) {
                for (int k = 0; k < code.length; k++) {
                    if (morce.equals(code[k])) {

                        System.out.print(letter[k]);
                    }
                }
            }
            S.close();

        } else if (n == 3) {
            System.out.print("thank you  ");
        }
        sr.close();

    }

}
