Write a program in java to convert a string to uppercase without using
pre-defined function  
Test Data :
Input a string in lowercase : the quick brown fox jumps over the lazy dog
//=====================================================================================import java.util.Scanner;

    class StringToUppercase {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Input a string in lowercase:");
        String input = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Convert string to uppercase manually
        StringBuilder uppercaseString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase by subtracting 32
                ch = (char) (ch - 32);
            }

            // Append the character to the result
            uppercaseString.append(ch);
        }

        // Print the result
        System.out.println("String in uppercase: " + uppercaseString.toString());
    }
}
