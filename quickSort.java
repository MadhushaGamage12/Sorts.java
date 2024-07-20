package sortingMethod;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
       
        int[] numbers = { 14, 31, 1, 21, 95, 72,7 };
        System.out.println("Before Sorting: " + Arrays.toString(numbers));
        quickSort(numbers);
        System.out.println("After Sorting : " + Arrays.toString(numbers));  
    }
       

    public static void quickSort(int[] arr) {
        recursiveQuickSort(arr, 0, arr.length - 1);
    }

    public static void recursiveQuickSort(int[] arr, int startIdx, int endIdx) {
        if (startIdx < endIdx) {
            int idx = partition(arr, startIdx, endIdx);
            // Recursively call quicksort on the left and right parts of the partitioned array
            recursiveQuickSort(arr, startIdx, idx - 1);
            recursiveQuickSort(arr, idx, endIdx);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        // Choosing the middle element as the pivot by /2
        int pivot = arr[(left + right) / 2];
        while (left <= right) {
            // Move left index to the right until finding an element greater than the pivot
            while (arr[left] < pivot) {
                left++;
            }
            // Move right index to the left until finding an element smaller than the pivot
            while (arr[right] > pivot) {
                right--;
            }
            // Swap the elements at left and right indices if needed
            if (left <= right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
        return left;
    }
}
