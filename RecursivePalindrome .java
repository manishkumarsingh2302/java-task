public class RecursivePalindrome {

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return isPalindromeHelper(s, 0, s.length() - 1);
    }

    private static boolean isPalindromeHelper(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPalindromeHelper(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a car or a cat I saw?")); // true
        System.out.println(isPalindrome("Hello")); // false
    }
}
