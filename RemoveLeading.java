
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

