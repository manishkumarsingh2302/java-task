

// 2. Find the average of array elements
class ArrayAverage {
    public static void main(String[] args) {


        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
        double avg = (double) sum / arr.length;
        System.out.println("Average = " + avg);
    }
}

// 3. Find the maximum/minimum element
class ArrayMaxMin {
    public static void main(String[] args) {
        int[] arr = {25, 11, 7, 75, 56};
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Max = " + max + ", Min = " + min);
    }
}

// 4. Search for a given element
class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Element not found");
    }
}

// 5. Count occurrences of a specific element
class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        in
