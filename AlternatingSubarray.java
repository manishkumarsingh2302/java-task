public class AlternatingSubarray {

    public static int maxAlternatingLength(int[] arr) {
        if (arr.length == 0) return 0;

        int maxLen = 1;
        int currLen = 1;

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2) != (arr[i - 1] % 2)) {
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            } else {
                currLen = 1; // reset when pattern breaks
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {1, 2, 3, 4, 6, 7, 8, 9};
        System.out.println("Output 1: " + maxAlternatingLength(arr1)); // Expected: 5

        // Test Case 2
        int[] arr2 = {2, 4, 6, 8};
        System.out.println("Output 2: " + maxAlternatingLength(arr2)); // Expected: 1

        // Test Case 3
        int[] arr3 = {1, 2, 1, 2, 1};
        System.out.println("Output 3: " + maxAlternatingLength(arr3)); // Expected: 5

        // Test Case 4
        int[] arr4 = {1};
        System.out.println("Output 4: " + maxAlternatingLength(arr4)); // Expected: 1
    }
}
