//Justin Ramirez
//CSC 2720 Lab CS225
//Lab time: W 1300
//Due time: 2/12/2023 @ 11:59PM

// Source for  solution https://www.geeksforgeeks.org/merge-sort/

    /* Test Cases:
     * Empty arrays
     * Switched array 1 and 2
     * Tested arrays of very different lengths
     * A varied number of duplicates
     * No matches
     * Unsorted arrays
     */

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 50, 11, 33, 21, 40, 50, 40, 40, 21 };
        if (arr.length == 0) {
            isEmpty(arr);
        }
        else {
            System.out.println("\nThis is the input array:");
            printArray(arr);
            sort(arr, 0, arr.length-1);     // Merge Sort
            arr = removeDuplicates(arr);      // Remove Duplicates
            System.out.println("This is the sorted array using merge sort with no duplicates:");        
            printArray(arr);
        }
    }

    // My method to sort the array using merge
    public static void sort(int arr[], int l, int r) {
        if (l < r) {                // 
            int m = l + (r - l) / 2; // Find the middle point
            sort(arr, l, m);        // Sort the left side
            sort(arr, m + 1, r);    // Sort the right side
            merge(arr, l, m, r);    // Merge the sorted halves
        }
    }

    // My Method for merging the sorted array
    public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;     // Find length for the left array
        int n2 = r - m;         // Find length for the right array
        int L[] = new int[n1];  // Create left array of new size
        int R[] = new int[n2];  // Create right array of new size
 
        // building the new temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;       // Initial indexes of first and second subarrays
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        // Copy remaining elements of L[] if any 
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        // Copy remaining elements of R[] if any 
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // My method for removing the duplicates
    public static int[] removeDuplicates(int[] arr) {
        int[] newArr = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == newArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                newArr[k++] = arr[i];
            }
        }
        int[] b = new int[k];
        for (int i = 0; i < (k); i++){
            b[i] = newArr[i];
        }
        return b;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void isEmpty(int[] arr1) {
        if (arr1.length == 0)
            System.out.println("\nYour array is empty!");
    }
}
