
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = { 50, 11, 33, 21, 40, 50, 40, 40, 21 };
        quickSort2(nums, 0, nums.length-1);
        printArray(nums);
    }

    // My method for sorting the array
    public static int[] quickSort(int[] arr){
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
        sortedLess = quickSort(sortedLess);
        sortedGreater = quickSort(sortedGreater);
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

    public static void quickSort2(int[] arr, int low, int high) {
        if (low<high){
            int pivotIndex = partition(arr, low, high);
            quickSort2(arr, low, pivotIndex-1);
            quickSort2(arr, pivotIndex+1,high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[arr.length-1];
        int pi = low-1;
        for (int i = low; i <= high-1; i++) {
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
}
