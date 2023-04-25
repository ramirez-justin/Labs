//Justin Ramirez
//CSC 2720 Lab CS225
//Lab time: W 1300
//Due time: 4/23/2023 @ 11:59PM
public class BinaryTreeDetect {
    /*
     * // Valid binary search trees
     * int[] arr1 = {10,5,15,2,7,11,25,1};
     * System.out.println(isBinarySearchTree(arr1))
     * 
     * int[] arr2 = {8,3,10,1,6,9,14};
     * System.out.println(isBinarySearchTree(arr2))
     * 
     * int[] arr3 = {5};
     * System.out.println(isBinarySearchTree(arr3))
     * 
     * int[] arr4 = {};
     * System.out.println(isBinarySearchTree(arr4))
     * 
     * Invalid binary search trees
     * int[] arr5 = {2,4,5};
     * System.out.println(isBinarySearchTree(arr5))
     * 
     * int[] arr6 = {3,2,4,1,5};
     * System.out.println(isBinarySearchTree(arr6))
     * 
     * int[] arr7 = {10,5,15,2,7,11,25,26};
     * System.out.println(isBinarySearchTree(arr7))
     * 
     */
    public static boolean isBinarySearchTree(int[] arr) {
        // Check if the array is empty
        if (arr.length == 0) {
            return true;
        }
        
        // Call the recursive helper function to check the binary search tree property
        return isBinarySearchTreeHelper(arr, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private static boolean isBinarySearchTreeHelper(int[] arr, int index, int min, int max) {
        // Base case: an empty subtree is a valid binary search tree
        if (index >= arr.length || arr[index] < min || arr[index] > max) {
            return true;
        }
        
        // Check if the current node satisfies the binary search tree property
        if (arr[index] <= min || arr[index] >= max) {
            return false;
        }
        
        // Recursively check the left and right subtrees
        return isBinarySearchTreeHelper(arr, 2*index+1, min, arr[index]) && isBinarySearchTreeHelper(arr, 2*index+2, arr[index], max);
    }

    public static void main(String[] args) {
        int[] arr1 = {10,5,15,2,7,11,25,1};
        System.out.println(isBinarySearchTree(arr1)); // true
        
        int[] arr2 = {2,4,5};
        System.out.println(isBinarySearchTree(arr2)); // false
    }
}