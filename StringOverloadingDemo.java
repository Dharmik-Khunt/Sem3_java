import java.util.Scanner;

public class StringOverloadingDemo {
    
    // Method to handle string without space
    public void processString(String input) {
        if (!input.contains(" ")) {
            input = input.replace('A', 'Z');
            System.out.println("Modified String: " + input);
            System.out.println("Length of the string: " + input.length());
        }
    }
    
    // Method to handle string with space
    public void processString(String input, boolean hasSpace) {
        if (hasSpace) {
            int length = input.length();
            int halfLength = length / 2;
            String firstHalf = input.substring(0, halfLength);
            input = firstHalf + "CHARUSAT";
            System.out.println("Modified String: " + input);
        }
    }
    
    // Method to handle string with space and length more than 10
    public void processString(String input, boolean hasSpace, boolean isLong) {
        if (hasSpace && isLong) {
            input = input.toLowerCase();
            System.out.println("Modified String: " + input);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        StringOverloadingDemo demo = new StringOverloadingDemo();
        
        if (!input.contains(" ")) {
            demo.processString(input);
        } else {
            if (input.length() > 10) {
                demo.processString(input, true, true);
            } else {
                demo.processString(input, true);
            }
        }
        
        scanner.close();
    }
}
