import java.util.*;

public class LongestBalancedSubarray {

    public static int longestBalancedSubarray(int[] arr) {
        Map<Integer, Integer> balanceMap = new HashMap<>();
        balanceMap.put(0, -1); // balance -> first index

        int balance = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                balance += 1;
            } else {
                balance -= 1;
            }

            if (balanceMap.containsKey(balance)) {
                int length = i - balanceMap.get(balance);
                maxLen = Math.max(maxLen, length);
            } else {
                balanceMap.put(balance, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Output 1: " + longestBalancedSubarray(arr1)); // Expected: 10

        // Test Case 2
        int[] arr2 = {2, 4, 6, 8, 10};
        System.out.println("Output 2: " + longestBalancedSubarray(arr2)); // Expected: 0

        // Test Case 3
        int[] arr3 =
