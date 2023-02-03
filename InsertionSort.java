//Justin Ramirez
//CSC 2720 Lab CS225
//Lab time: W 1300
//Due time: 2/25

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {50, 11, 33, 21, 40, 50, 40, 40, 21};
        insertionSort(nums);
        printArray(nums);
    }

    public static void insertionSort(int[] arr) {   // input size 1
        int n = arr.length; // 1 step
        for (int i = 1; i < n; ++i) {   // n times
            int key = arr[i];   // 1 step
            int j = i - 1;  // 1 step
            /* Move elements of arr[0..i-1], that are
             * greater than key, to one position ahead
             * of their current position 
             */
            while (j >= 0 && arr[j] > key) {    // n time
                arr[j + 1] = arr[j];    // 1 step
                j = j - 1;  // 1 step
            }
            arr[j + 1] = key; // 1 step
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
