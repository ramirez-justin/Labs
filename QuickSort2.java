public class QuickSort2 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 4, 7, 22, 56, 44, 55, 1, 55, 60, 45 };
        arr = quickSort2(arr);
        arr = removeDuplicates(arr);
        printArray(arr);
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
        for (int i = 1; i < arr.length; i++){   // O(n) Time
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
        sortedGreater = quickSort2(sortedGreater);  // These recursive methods are O(log(n)) time complexity
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

    public static int[] removeDuplicates(int[] arr) {
        if (arr.length == 0 || arr == null)
            return arr;
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[j]) { // compares pointer for j to a moving pointer for i, they are different it brings i to the next spot
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

    public static void printArray(int[] arr) {
        if (arr.length == 0)
            System.out.println("The array is empty!");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
