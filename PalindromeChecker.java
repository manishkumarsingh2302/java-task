public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";

        System.out.println("\"" + test1 + "\" is palindrome? " + isPalindrome(test1));
        System.out.println("\"" + test2 + "\" is palindrome? " + isPalindrome(test2));
    }
}
