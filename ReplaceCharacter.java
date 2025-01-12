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