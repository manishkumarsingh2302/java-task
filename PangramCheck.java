//Write a java Program to check given String is
//panagram or not?

//Enter Any String: abcdefghijklmnopqrstuvwxyz
//This is panagram string

//Enter Any String: xyz
//This is not a panagram String.....
     

import java.util.Scanner;

 class PangramCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter Any String: ");
        String input = scanner.nextLine();

        // Convert the string to lowercase to make it case-insensitive
        input = input.toLowerCase();

        // Initialize a boolean array to track the presence of each alphabet letter
        boolean[] alphabet = new boolean[26];

        // Iterate over the string and mark the corresponding index for each alphabet letter
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If the character is between 'a' and 'z', mark its position
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        // Check if all 26 letters are present in the string
        boolean isPangram = true;
        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                isPangram = false;
                break;
            }
        }

        // Output the result
        if (isPangram) {
            System.out.println("This is a pangram string");
        } else {
            System.out.println("This is not a pangram string");
        }

        // Close the scanner
        scanner.close();  
    }
}
