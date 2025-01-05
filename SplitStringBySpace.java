//Write a program in java to split string by space into words.
Test Data :
Input a string : this is a test string
Expected Output :
Strings or words after split by space are :
this
is
a
test
string
=============================================
import java.util.Scanner;
 class SplitStringBySpace {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Input a string: ");
        String inputString = scanner.nextLine();

        // Split the string by spaces
        String[] words = inputString.split(" ");

        // Display the words
        System.out.println("Strings or words after split by space are:");
        for (String word : words) {
            System.out.println(word);
        }

        // Close the scanner
        scanner.close();
    }
}
