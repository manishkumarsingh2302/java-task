//Write a program in java to replace the spaces of a string with a specific
character.

String based Task 5

By Ram Lovewanshi

Test Data :
Input a string :Be glad to see the back of
Input replace character : *
Expected Output :
After replacing the space with * the new string is :
Be*glad*to*see*the*back*of*
=======================================================================================
  import java.util.Scanner;

    class ReplaceSpaces {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Input the string
        System.out.print("Input a string: ");
        String inputString = scanner.nextLine();
        
        // Input the character to replace spaces
        System.out.print("Input replace character: ");
        char replaceChar = scanner.next().charAt(0);
        
        // Replace spaces with the specified character
        String result = inputString.replace(' ', replaceChar);
        
        // Display the result
        System.out.println("After replacing the space with '" + replaceChar + "' the new string is:");
        System.out.println(result);
        
        // Close the scanner
        scanner.close();
  
