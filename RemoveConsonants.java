6. Write a program to delete all consonents from the
string &quot;Hello, have a good day&quot;.
Example:
Input : Hello
Output: eo
Example:
Input: Hello, have a good day
Output: eo, ae a oo

 class RemoveConsonants {
    public static void main(String[] args) {
        // Input string
        String input = "Hello, have a good day";

        // Call the method to remove consonants
        String result = removeConsonants(input);

        // Print the result
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }

    // Method to remove consonants from a string
    public static String removeConsonants(String str) {
        // Define vowels
        String vowels = "AEIOUaeiou";

        // Use StringBuilder for efficient string manipulation
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Add to result if it is a vowel or not a letter
            if (vowels.indexOf(c) != -1 || !Character.isLetter(c)) {
                result.append(c);
            }
        }

        // Return the result as a string
        return result.toString();
    }
}

