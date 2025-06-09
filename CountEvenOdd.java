public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 8, 13, 22};
        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}
