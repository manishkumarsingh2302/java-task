Q2. Write a program to check if the word &#39;orange&#39; is
present in the &quot;This is orange juice&quot;.

Enter Any String: This is orange juice
orange is Present in the Sentence :YES
   

    import java.util.Scanner;

   class CheckWordPresence {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Enter a string
        System.out.print("Enter Any String: ");
        String input = scanner.nextLine();

        // Check if the word "orange" is present in the sentence
        if (input.toLowerCase().contains("orange")) {
            System.out.println("orange is Present in the Sentence : YES");
        } else {
            System.out.println("orange is Present in the Sentence : NO");
        }

        // Close the scanner
        scanner.close();
 }
}
====================================================================================================

