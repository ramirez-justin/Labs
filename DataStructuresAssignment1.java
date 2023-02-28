// Justin Ramirez
// CSC 2720
// Class Time: TH 1415
// Due time: 2/7

public class DataStructuresAssignment1 {
    /* Test Cases:
     * Empty arrays
     * Switched array 1 and 2
     * Tested arrays of very different lengths
     * A varied number of duplicates
     * No matches
     * Unsorted arrays
     */
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 6, 6, 9, 9, 9, 11, 11, 21};
        int[] arr2 = {6, 6, 9, 11, 21, 21, 21};
        System.out.println("Here is array one:");
        printArray(arr1);
        System.out.println("Here is array two");
        printArray(arr2);
        arr1 = quickSort(arr1);
        arr2 = quickSort(arr2);
        int[] newArr1 = solutionOne(arr1, arr2);
        int[] newArr2 = solutionTwo(arr1, arr2);
        System.out.println("Here is the new array using solution one:");
        printArray(newArr1);
        System.out.println("Here is the new array using solution two:");
        printArray(newArr2); 
    }

    // My solution for problem 1
    public static int[] solutionOne(int[] arr1, int[] arr2) {
        isEmpty(arr1, arr2);    // check if one or both arrays is empty
        int[] newArr1 = new int[arr1.length];   // New array to store matches
        int x = 0;  // Counter for the number of elements in my new array of matches
        for (int i = 0; i < arr1.length; i++) {     // O(n)
            for (int j = 0; j < arr2.length; j++) {     //O(m)
                if (arr1[i] == arr2[j]) {   // checks elements in arr1 against arr2 until match is found
                    newArr1[x++] = arr1[i];
                    break;
                }
            }
        }
        if (x == 0) // Test for no matches found
            System.out.println("No matches found between your two arrays.");
        int[] newArr2 = removeDuplicates(newArr1); // removes the duplicates 
        return newArr2;
    }
    
    // My solution for problem 2
    public static int[] solutionTwo(int[] arr1, int[] arr2) {
        isEmpty(arr1, arr2); // check if one or both arrays is empty
        int[] newArr1 = new int[arr1.length]; // New array to store matches
        int x = 0; // Counter for the number of elements in my new array of matches
        for (int i = 0; i < arr1.length; i++) { // O(n)
          // Check if arr1[i] exists in arr2 using binary search
          if (binarySearch(arr2, arr1[i]) != -1) { // O(log(n))
            newArr1[x++] = (arr1[i]);
          }
        }
        int[] newArr2 = removeDuplicates(newArr1); // removes the duplicates
        if (x == 0)
            System.out.println("No matches found between your two arrays.");
        return newArr2;
    }
    /* In the solutionTwo code, we can improve the performance by leveraging 
     * the fact that both arrays are already sorted. We can use two pointers, 
     * one for each array, and traverse through the arrays comparing the values 
     * at each pointer. If both values are equal, add to the result and move both 
     * pointers. If the value in the first array is smaller, move the pointer in 
     * the first array. If the value in the second array is smaller, move the pointer 
     * in the second array. This way, we can avoid the use of binary search and achieve 
     * an O(m + n) time complexity solution. Like this:
     *  int p1 = 0, p2 = 0, index = 0;
     *  while (p1 < arr1.length && p2 < arr2.length) {
     *      if (arr1[p1] == arr2[p2]) {
     *          newArr1[index++] = arr1[p1];
     *          p1++;
     *          p2++;
     *      } else if (arr1[p1] < arr2[p2]) {
     *          p1++;
     *      } else {
     *          p2++;
     *      }
     *  }
     */

    // My method for printing the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // My method for sorting the array; probably more difficult than it needed to be but I was reading
    // about quick sort and I wanted to see what it would look like in java without using library functions.
    // Would have been easier using java.util.arrays
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

    // My method for binary search
    public static int binarySearch(int v[], int n) {
        int left = 0;
        int right = v.length - 1;
        while (left <= right) { // O(log(n))
            int mid = left + (right - left)/2; 
            if(v[mid] == n) {
                return mid;
            } else if (v[mid] < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // My method to test if either array is empty
    public static void isEmpty(int[] arr1, int[] arr2) {
        if (arr1.length == 0 || arr2.length == 0)
            System.out.println("One of your arrays is empty!");
    }
}
