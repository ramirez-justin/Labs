// Justin Ramirez
// CSC 2720 Assignment2
// Class Time: TH 1415
// Due time: 2/21/2023 @ 2359

class DataStructuresAssignment2 {
    /* Test Cases:
     * Empty arrays
     * Arrays with no duplicates
     * Tested arrays of very different lengths
     * A varied number of duplicates
     * No matches
     * Unsorted arrays
     */
    public static void main(String[] args) {
        String[] words = { "spring", "summer", "fall", "summer", "winter" };
        String[] flowers = { "Rose", "Lily", "Tulip" };
        int[] nums = { 3, 4, 7, 6, 1 };
        hasDuplicates(words);
        flowers = sortFlowers(flowers);
        printStringArray(flowers);
        reverseArray(nums, nums.length);
        printIntArray(nums);
    }

    // My method for identifying whether or not the given array has duplicates
    public static void hasDuplicates(String[] words) {
        boolean isDuplicate = false;
        for (int i = 0; i < words.length-1; i++) {  // Pointer for initial item to compare
            for (int j = i+1; j < words.length; j++) {  // Pointer for item to compare to
                if (words[i].equals(words[j])) {    // Comparison using .equals
                    isDuplicate = true;
                    break;      // end inner loop if true
                }
            }
            if (isDuplicate)
                break;      // end outer loop if true
        }
        System.out.println(isDuplicate);    // print result
    }

    // My method for sorting an array of flowers alphabetically
    public static String[] sortFlowers(String[] flowers) {
        boolean swap;   // boolean used as a termination condition for the do while loop
        // Selection sort with a do while loop
        do {
            swap = false;
            for (int i = 0; i < flowers.length - 1; i++) {  // O(n) time
                if (flowers[i].charAt(0) > flowers[i+1].charAt(0)){ // compare the first character of each element to all others using .charAt 
                    swapWords(flowers, i, i+1); // Flip the elements in the array which are in the wrong order
                    swap = true;
                }
            }
        } while(swap);
        return flowers;
    }

    // My method for reversing an integer array using a swap method
    public static void reverseArray(int[] nums, int n) {
        int left = 0;   // left pointer
        int right = n - 1;  //right pointer
        while (left < right) {  // O(n) time complexity
            swapNums(nums, left, right); 
            left++;
            right--;
        }
    }

    // My method for swapping two integers in an array using a temporary storage
    public static void swapNums(int[] x, int y, int z) {
        int temp = x[y];    // space complexity O(1)
        x[y] = x[z];
        x[z] = temp;
    }

    // My method for swapping two words in an array
    public static void swapWords(String[] x, int y, int z) {
        String temp = x[y];    // space complexity O(1)
        x[y] = x[z];
        x[z] = temp;
    }

    // My method for printing an integer array
    public static void printIntArray(int[] nums) {
        if (nums.length == 0 || nums == null) 
            System.out.println("The given array is empty!");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    // My method for printing an String array
    public static void printStringArray(String[] words) {
        if (words.length == 0 || words == null) 
            System.out.println("The given array is empty!");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }
}