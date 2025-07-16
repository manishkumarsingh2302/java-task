public class StringCycle {
    // Function to rotate string left by n positions
    public static String rotateLeft(String str, int n) {
        int len = str.length();
        n = n % len;  // Handle large n
        return str.substring(n) + str.substring(0, n);
    }

    // Function to rotate string right by n positions
    public static String rotateRight(String str, int n) {
        int len = str.length();
        n = n % len;  // Handle large n
        return str.substring(len - n) + str.substring(0, len - n);
    }

    public static void main(String[] args) {
        String original = "abcdef";

        System.out.println("Original: " + original);

        // Cycle left by 2
        String leftRotated = rotateLeft(original, 2);
        System.out.println("Left Cycle by 2: " + leftRotated);

        // Cycle right by 2
        String rightRotated = rotateRight(original, 2);
        System.out.println("Right Cycle by 2: " + rightRotated);
    }
}
