//Java Program to Iterate Over Characters in
String?

Input : str = “welcometobhopal”
Output : w e l c o m e t o b h o p a l
Input : str = &quot;RAM&quot;
Output : R A M
========================================================
import java.util.Scanner;

class IterateOverCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Initialize an empty string to hold the result
        StringBuilder result = new StringBuilder();

        // Iterate over the characters in the string
        for (int i = 0; i < inputString.length(); i++) {
            result.append(inputString.charAt(i));
            // Add a space after each character except the last one
            if (i != inputString.length() - 1) {
                result.append(" ");
            }
        }

        // Print the output
        System.out.println("Output: " + result.toString());
    }
}
