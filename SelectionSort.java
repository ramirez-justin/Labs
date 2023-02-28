//Justin Ramirez
//CSC 2720 Lab CS225
//Lab time: W 1300
//Due time: 2/25

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {50, 11, 33, 21, 40, 50, 40, 40, 21};
        selectionSort(nums, nums.length);
        printArray(nums);
    }

    // My method for selection sort, Selection sort iterates through the array n^2 times
    // finding the minimum element in the array and bringing it to the front of the 
    // unsorted portion
    public static void selectionSort(int arr[], int n) {   // input size 1  
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;        // Find the minimum element in unsorted array
            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            // Swap the found minimum element with the first element
            swap(arr, i, min_idx);
        }
    }

    // My method for swapping two elements of an array
    public static void swap(int arr[], int i, int min_idx) {
        int temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;

    }

    // My method for printing all the elements of an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}