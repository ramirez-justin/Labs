//Justin Ramirez
//CSC 2720 Lab CS225
//Lab time: W 1300
//Due time: 2/25

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {50, 11, 33, 21, 40, 50, 40, 40, 21};
        selectionSort(nums);
        printArray(nums);
    }

    public static void selectionSort(int arr[]) {   // input size 1
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        boolean swap;
        do {        // n time
            swap = false;
            for (int i = 0; i < n-1; i++) { // n-1 time
                // Find the minimum element in unsorted array
                int min_idx = i;    // 1 step
                if (arr[i + 1] < arr[min_idx]) {  
                    min_idx = i + 1;    // 1 step
                    // Swap the found minimum element with the first element
                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                    swap = true;
                }
            }
        } while (swap);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}