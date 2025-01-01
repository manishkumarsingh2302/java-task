Write a program in java to convert a string to lowercase without using
pre-defined function
Test Data :
Input a string in UPPERCASE : THE QUICK BROWN FOX JUMPS
OVER THE LAZY DOG.
======================================================================================
import java.util.Scanner; 
public class StringToLowercase {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Input a string in UPPERCASE:");
        String input = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Convert string to lowercase manually
        StringBuilder lowercaseString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is an uppercase letter
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding 32
                ch = (char) (ch + 32);
            }

            // Append the character to the result
            lowercaseString.append(ch);
        }

        // Print the result
        System.out.println("String in lowercase: " + lowercaseString.toString());
    }
}
