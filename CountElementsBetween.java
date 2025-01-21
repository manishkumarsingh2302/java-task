//Count number of elements between two given elements in array
   

    import java.util.Arrays;

   class CountElementsBetween {
    public static int countElementsBetween(int[] arr, int elem1, int elem2) {
        try {
            // Find the indices of the two elements
            int index1 = findIndex(arr, elem1);
            int index2 = findIndex(arr, elem2);
            
            // If either element is not found, throw an exception
            if (index1 == -1 || index2 == -1) {
                throw new IllegalArgumentException("One or both elements not found in the array.");
            }
            
            // Calculate the number of elements between the two indices
            return Math.abs(index2 - index1) - 1;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return -1; // Return -1 to indicate an error
        }
    }

    private static int findIndex(int[] arr, int elem) {
        // Find the index of the element in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                return i;
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args) {
     
