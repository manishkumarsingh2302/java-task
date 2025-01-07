//Java Program to Add Characters to a String
Input:
Input custom string = Hello
Output:
--&gt; String to be added &#39;Ram&#39;
--&gt; If end position, Output: HelloRam
--&gt; If in beginning, Output: RamHello
--&gt; If at sat 3rd index, Output: HelRamlo
====================================import java.util.Scanner;
 class AddCharactersToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input custom string
        System.out.print("Enter the custom string: ");
        String customString = scanner.nextLine();

        // Input the string to be added
        System.out.print("Enter the string to be added: ");
        String stringToAdd = scanner.nextLine();

        // Input the position (beginning, end, or specific index)
        System.out.print("Enter the position to add the string (beginning/end/index): ");
        String position = scanner.nextLine();

        String result = "";
        switch (position.toLowerCase()) {
            case "beginning":
                result = stringToAdd + customString;
                break;
            case "end":
                result = c
