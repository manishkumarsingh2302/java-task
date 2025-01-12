//Q NO 3===Q3.Java Program to Reverse a String using Stack?

Input: Hello World
Output: &lt;- Reverse -&gt; dlroW olleH



  import java.util.Stack;

 class ReverseStringUsingStack {

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


