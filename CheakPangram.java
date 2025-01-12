//Q1. Write a program to check if the letter &#39;e&#39; is present in
the word &#39;Umbrella&#39;.

Enter Any String: Umbrella
e is Present in the word :YES
       import java.util.HashS
      class CheckPangram {

     static boolean isPangram(String str) {
        // Convert the string to lowercase and remove non-alphabetic characters
        str = str.toLowerCase();

        // Use a HashSet to store unique characters
        HashSet<Character> uniqueLetters = new HashSet<>();

        // Iterate through the string
        for (char ch : str.toCharArray()) {
            // Add alphabetic characters to the set
            if (ch >= 'a' && ch <= 'z') {
                uniqueLetters.add(ch);
            }
        }

        // If the set size is 26, it is a pangram
        return uniqueLetters.size() == 26;
    }

    public static void main(String[] args) {
        // Example inputs
        String input1 = "Abcdefghijklmnopqrstuvwxyz";
        String input2 = "The quick brown fox jumps over the lazy dog";
        String input3 = "Hello World!";

        // Check if the strings are pangrams
        System.out.println("Input: " + input1 + " -> Is Pangram? " + isPangram(input1)); // Output: Yes
        System.out.println("Input: " + input2 + " -> Is Pangram? " + isPangram(input2)); // Output: Yes
        System.out.println("Input: " + input3 + " -> Is Pangram? " + isPangram(input3)); // Output: No
    }
}
============================================================================================================

