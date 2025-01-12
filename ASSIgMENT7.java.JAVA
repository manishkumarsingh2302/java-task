//  Q NO 1=  Replace a character at a specific index in a
String in Java

Examples of Replacing Characters in a String
Input: String = &quot;Geeks Gor Geeks&quot;, index = 6, ch = &#39;F&#39;
Output: &quot;Geeks For Geeks.&quot;

Input: String = &quot;Geeks&quot;, index = 0, ch = &#39;g&#39;
Output: &quot;geeks&quot;


		 class ReplaceCharacter {

    public static String replaceCharacter(String str, int index, char ch) {
        // Check for valid index
        if (index < 0 || index >= str.length()) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        // Use StringBuilder for mutable string operations
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.setCharAt(index, ch);
        
        // Convert back to String and return
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        // Example 1
        String str1 = "Geeks Gor Geeks";
        int index1 = 6;
        char ch1 = 'F';
        System.out.println(replaceCharacter(str1, index1, ch1)); // Output: Geeks For Geeks

        // Example 2
        String str2 = "Geeks";
        int index2 = 0;
        char ch2 = 'g';
        System.out.println(replaceCharacter(str2, index2, ch2)); // Output: geeks
    
========================================================================================================
  //QNO 2==Q2. Remove Leading Zeros From String in Java?
Example:
Input : 00000123569
Output: 123569
Input: 000012356090
Output: 12356090

   class RemoveLeadingZeros {

    public static String removeLeadingZeros(String str) {
        // Replace leading zeros with an empty string
        return str.replaceFirst("^0+", "");
    }

    public static void main(String[] args) {
        // Example 1
        String input1 = "00000123569";
        System.out.println(removeLeadingZeros(input1)); // Output: 123569

        // Example 2
        String input2 = "000012356090";
        System.out.println(removeLeadingZeros(input2)); // Output: 12356090

        // Example 3: All zeros
        String input3 = "0000";
        System.out.println(removeLeadingZeros(input3)); // Output: (empty string)

        // Example 4: No leading zeros
        String input4 = "12345";
        System.out.println(removeLeadingZeros(input4)); // Output: 12345
    }
}
==================================================================================================  

//Q NO 3===Q3.Java Program to Reverse a String using Stack?

Input: Hello World
Output: &lt;- Reverse -&gt; dlroW olleH



  import java.util.Stack;

public class ReverseStringUsingStack {

    public static String reverseString(String str) {
        // Create a stack to hold the characters of the string
        Stack<Character> stack = new Stack<>();

        // Push each character of the string onto the stack
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        // Pop characters from the stack and append to result
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        // Convert StringBuilder to String and return
        return reversedString.toString();
    }

    public static void main(String[] args) {
        // Example Input
        String input = "Hello World";

        // Reverse the string
        String result = reverseString(input);

        // Output the reversed string
        System.out.println("Input: " + input);
        System.out.println("Output: <- Reverse -> " + result);
    }
}


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

public class CheckPangram {

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
