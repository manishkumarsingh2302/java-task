public class ReverseNumber2 {

    // Helper method to initiate recursion
    public static int reverse(int number) {
        return reverseHelper(number, 0);
    }

    // Recursive method
    private static int reverseHelper(int number, int reversed) {
        if (number == 0) {
            return reversed;
        }
        int lastDigit = number % 10;
        reversed = (reversed * 10) + lastDigit;
        return reverseHelper(number / 10, reversed);
    }

    public static void main(String[] args) {
        int num = 12345;
        int reversed = reverse(num);
        System.out.println("Reversed number: " + reversed);
    }
}
