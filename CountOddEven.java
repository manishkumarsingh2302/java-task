//Count Odd Even
    class CountOddEven {
    public static void main(String[] args) {
        int[] array = {10, 15, 20, 25, 30, 35, 40}; // Example array

        int oddCount = 0;
        int evenCount = 0;

        // Loop through the array
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++; // Increment even counter if the number is divisible by 2
            } else {
                oddCount++; // Increment odd counter otherwise
            }
        }

        // Print the counts
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
