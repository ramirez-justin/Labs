/* Your Name
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
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int pi = low-1;
        for (int i = low; i <= high-1; i++) {   //   O(n)
            if (arr[i] < pivot) {
                pi++;
                int temp = arr[pi];
                arr[pi] = arr[i];
                arr[i] = temp; 
            }
        }
        int temp = arr[pi+1];
        arr[pi+1] = arr[high];
        arr[high] = temp;
        return (pi+1);
    }

    // This is a different method I found in a book I was reading,
    public static int[] quickSort2(int[] arr){
        if (arr.length < 2) // base case
            return arr;
        int pivot = arr[0]; // Recursive case
        int low = 0;
        int high = 0;
        int[] less = new int[arr.length]; // Sub-array of all elements less than pivot
        int[] greater = new int[arr.length]; // Sub-array of all elements greater than pivot
        for (int i = 1; i < arr.length; i++){
            if (arr[i] <= pivot)
                less[low++] = arr[i]; // adds elements less than or equal to pivot to less
            else 
                greater[high++] = arr[i]; // adds elements greater than pivot to greater
        }
        // Create shorter copies of the less and greater arrays
        int[] sortedLess = new int[low];
        int[] sortedGreater = new int[high];
        for (int i = 0; i < low; i++) {
            sortedLess[i] = less[i];
        }
        for (int i = 0; i < high; i++) {
            sortedGreater[i] = greater[i];
        }
        // run them back through the quicksort to properly sort them
        sortedLess = quickSort2(sortedLess);
        sortedGreater = quickSort2(sortedGreater);
        // Create new array with proper length
        int[] result = new int[low + 1 + high];
        for (int i = 0; i < low; i++) {
            result[i] = sortedLess[i];
        }
        result[low] = pivot;
        for (int i = 0; i < high; i++) {
            result[low + 1 + i] = sortedGreater[i];
        }
        return result;
    }

    public static void printArray(int[] x){
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
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        int[] newArr = new int[j+1];
        for (int i = 0; i < j+1; i++) { // O(n) time
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
