//Write a program that accepts an array by 10 names and display all names that start with “A”.?
//=====================================================================================================



       import java.util.Scanner;

     class PrintName {

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

    public static void displayNamesStartingWithA(String[] names) {
        System.out.println("Names starting with 'A':");
        for (String name : names) {
            if (name.startsWith("A") || name.startsWith("a")) {
                System.out.println(name);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Validate the string and print the result
        String result = validateString(userInput);
        System.out.println(result);

        // Input array of names
        String[] names = new String[10];
        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = scanner.nextLine();
        }

        // Display names starting with 'A'
        displayNamesStartingWithA(names);

        
    }
}
