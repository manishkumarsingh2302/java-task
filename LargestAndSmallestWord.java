1. Write a program in java to find the largest and smallest word in a
string.
Test Data :
Input the string : It is a string with smallest and largest word.
Expected Output :
import java.util.Scanner;

  class LargestAndSmallestWord {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Split the string into words
        String[] words = input.split("\\s+");

        // Initialize variables to store the smallest and largest words
        String smallest = words[0];
        String largest = words[0];

        // Iterate through the words to find the smallest and largest
        for (String word : words) {
            if (word.length() < smallest.length()) {
                smallest = word;
            }
            if (word.length() > largest.length()) {
                largest = word;
            }
        }

        // Print the results
        System.out.println("Smallest word: " + smallest);
        System.out.println("Largest word: " + largest);
    }
}
