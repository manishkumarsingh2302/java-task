// Write a java Program to check given number is Even or Odd Using Function
  





   import java.util.Scanner
   class EvenOddCheck {
    
    // Function to check whether the number is even or odd
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter Any Number: ");
        int number = scanner.nextInt();

        // Call the function to check if the number is even or odd
        String result = checkEvenOdd(number);

        // Output the result
        System.out.println("The number " + number + " is " + result + ".");

        // Close the scanner
        scanner.close();
    }
}
