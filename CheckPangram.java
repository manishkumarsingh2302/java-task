======================================================================================
Q NO 5==Q5. Check if a given string is Pangram in Java?

A string is a pangram string if it contains all the character of
the alphabets ignoring the case of the alphabets.

Examples:
Input: str = “Abcdefghijklmnopqrstuvwxyz”
Output: Yes
Explanation: The given string contains all the letters from a to z
(ignoring case).
   

   import java.util.HashSet;

 class CheckPangram {

    public static boolean isPangram(String str) {
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
