package sortingMethod;

public class mergeSort {
    public static void main(String[] args) {
        // Initialize an array with unsorted values
        var array = new int[] {3, 90, 10, 17, 8, 72, 5, 12};
        
        // Print the unsorted array
        System.out.println("Unsorted array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Call mergeSort to sort the array
        mergeSort(array);
       
        // Print the sorted array
        System.out.println("\nSorted array is:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    // Method to perform merge sort on an array
    public static void mergeSort(int[] array) {
        // Base case: if the array is null or has 1 or no elements, it's already sorted
        if (array == null || array.length <= 1) {
            return;
        }

        // Find the middle index to split the array into two halves by index/2
        int mid = array.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];

        // Copy the left half of the array
        System.arraycopy(array, 0, leftArray, 0, mid);
        // Copy the right half of the array
        System.arraycopy(array, mid, rightArray, 0, array.length - mid);

        // Print the left and right sub arrays
        System.out.print("\nLeft split: ");
        for (int element : leftArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Right split: ");
        for (int element : rightArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Recursively sort both halves
        mergeSort(leftArray);
        mergeSort(rightArray);

        // Merge the sorted halves back into the original array
        merge(leftArray, rightArray, array);

        // Print the array after merging
        System.out.print("Merged array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Method to merge two sorted subarrays into a single sorted array
    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int i = 0, j = 0, k = 0;

        // Merge elements from leftArray and rightArray into the original array
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        // Copy any remaining elements from leftArray
        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }
        // Copy any remaining elements from rightArray
        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }

        
        System.out.println();
    }
}
