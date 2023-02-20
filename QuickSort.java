/* Justin Ramirez
 * CSc 2720 Lab #6
 * Lab time: W1300
 * Due time: 02/19/2023 @ 2359
 */
public class QuickSort {

    /* Test Cases:
     * Empty arrays
     * Switched array 1 and 2
     * Tested arrays of very different lengths
     * A varied number of duplicates
     * No matches
     * Unsorted arrays
     */    
    public static void main(String[] args) {
        int[] nums = { 50, 11, 33, 21, 40, 50, 40, 40, 21 };
        quickSort(nums, 0, nums.length-1);
        nums = removeDuplicates(nums, nums.length);
        printArray(nums);
    }

    // This method solves the lab as requested in O(n log2(n)) time complexity
    // it uses the partition method to split the array
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high){
            int pivotIndex = partition(arr, low, high); // Use partition to choose pivot & reorganize values less or higher than pivot
            quickSort(arr, low, pivotIndex-1); // recursively call quick sort for the range on the left of pivotIndex
            quickSort(arr, pivotIndex+1, high); // recursively call quick sort for the range on the right of pivotIndex
        }   // O(log(n))
    }
    // This method chooses a pivot and places all smaller to the left and all larger to the right
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Pivot value is last index in array
        int pi = low-1; // lower pointer
        for (int i = low; i <= high-1; i++) {   //   O(n)
            if (arr[i] < pivot) {
                pi++;   // increment smaller pointer
                int temp = arr[pi]; // swap
                arr[pi] = arr[i];
                arr[i] = temp; 
            }
        }
        int temp = arr[pi+1];   // swap
        arr[pi+1] = arr[high];
        arr[high] = temp;
        return (pi+1);
    }

    public static void printArray(int[] x){
        if (x.length == 0 || x == null)
            System.out.println("The array is empty!");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static int[] removeDuplicates(int[] arr, int n) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int j = 0;
        for (int i = 0; i < arr.length; i++) {  // O(n) time
            if (arr[i] != arr[j]) {     // if pointer i is noty equal to pointer j,
                j++;                    //  increment j and store value of i at j
                arr[j] = arr[i];
            }
        }
        int[] newArr = new int[j+1];    // New array of size j
        for (int i = 0; i < j+1; i++) { // O(n) time
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
