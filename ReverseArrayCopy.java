public class ReverseArrayCopy {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        printArray(original);

        int[] reversed = getReversedArray(original);

        System.out.println("\nReversed Array (New Array):");
        printArray(reversed);
    }

    static int[] getReversedArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
