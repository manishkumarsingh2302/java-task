//Q2. Write a program that accept a string and check for following:
//a. The string should have at least 3 characters.
//b. The string should not have any special characters or digits except
//alphabets.
//If any of the condition does not matches appropriate error message
//should be displayed.
           


  import java.util.Scanner;

 class ValidateString {

    public static String validateString(String input) {
        // Check if the string has at least 3 characters
        if (input.length() < 3) {
            return "Error: The string should have at least 3 characters.";
        }

        // Check if the string contains only alphabets
        if (!input.matches("[a-zA-Z]+")) {
            return "Error: The string should only contain alphabets without any special characters or digits.";
        }

        return "The string is valid.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Validate the string and print the result
        String result = validateString(userInput);
        System.out.println(result);

        }
}
