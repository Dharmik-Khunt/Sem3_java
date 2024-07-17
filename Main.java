
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a string:");
        String orignalString = src.nextLine();
        String Scrambled = generateScrambled(orignalString);
        System.out.println("Scrambled String:" + Scrambled);
        System.out.print("Enter your guess for anagram:");
        String input = src.nextLine();
        if (isAnagram(orignalString, input)) {
            System.out.println("It is an Anagram");
        } else {
            System.out.println("It is not an Anagram");
        }

    }

    public static String generateScrambled(String input) {
        char[] inputchar = input.toCharArray();
        Random random = new Random();
        int len = inputchar.length;
        for (int i = 0; i < len; i++) {
            int j = random.nextInt(len);
            char temp = inputchar[i];
            inputchar[i] = inputchar[j];
            inputchar[j] = temp;
        }
        return new String(inputchar);
    }

    public static boolean isAnagram(String orignal, String input) {
        int[] charcount = new int[26];
        if (orignal.length() != input.length()) {
            return false;
        }
        for (char c : orignal.toCharArray()) {
            charcount[c - 'a']++;

        }
        for (char c : input.toCharArray()) {
            if (charcount[c - 'a'] == 0) {
                return false;
            }
            charcount[c - 'a']--;
        }
        return true;
    }
}
