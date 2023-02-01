//Justin Ramirez
//CSC 2720 Lab CS225
//Lab time: W 1300
//Due time: 1/29

public class CountingSort {
    public static void main(String[] args) {
        int[] nums = { 50, 11, 33, 21, 40, 50, 40, 40, 21 };
        countingSort(nums);
        printArray(nums);
    }

    // Method to sort array using counting sort
    public static void countingSort(int[] x) {
        int max = 0;
        // Determines the max number in the given array
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        
        int[] count = new int[max + 1];
        for (int i = 0; i < x.length; i++) {
            count[x[i]]++;
        }

        int j = 0;
        for (int i = 0; i <=max; i++) {
            while (count[i] > 0) {
                x[j++] = i;
                count[i]--;
            }
        }
    }

    // Method to print the new array
    public static void printArray(int[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}