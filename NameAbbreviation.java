Q4. Write a program that takes your full name as input and
displays the abbreviations of the first and middle names
except the last name which is displayed as it is.
For example, if your name is Robert Brett Roser, then the
output should be R.B.Roser.
Example:
Input:
Enter Full Name : Sanjay Kumar Jain
Result: S.K. Jain
   

import java.util.Scanner;

   class NameAbbreviation {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for full name
        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine().trim();

        // Split the full name into parts
        String[] nameParts = fullName.split(" ");

        // Initialize a StringBuilder to store the result
        StringBuilder abbreviatedName = new StringBuilder();

        // Process all parts of the name except the last one
        for (int i = 0; i < nameParts.length - 1; i++) {
            // Append the first character of the part followed by a period
            abbreviatedName.append(nameParts[i].charAt(0)).append(".");
        }

        // Append the last name as it is
        abbreviatedName.append(nameParts[nameParts.length - 1]);

        // Print the result
        System.out.println("Result: " + abbreviatedName);

        // Close the scanner
        scanner.close();
    }
}
=========================================================================================
