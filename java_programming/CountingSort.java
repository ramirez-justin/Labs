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
        int max = 0;   // 1 step
        for (int i = 0; i < x.length; i++) {   // n time
            if (x[i] > max) {   // 1 step
                max = x[i];   // 1 step
            }
        }

        int[] count = new int[max + 1];   // 1 step
        for (int i = 0; i < x.length; i++) {   // n time
            count[x[i]]++;   // 1 step
        }

        int j = 0;   // 1 step
        for (int i = 0; i <=max; i++) {   // n time
            while (count[i] > 0) { // log(n) times
                x[j++] = i;   // 1 step
                count[i]--;   // 1 step
            }
        }
    }   // 3 + 3n + 2n*log(n) -> O(n*log(n))

    // Method to print the new array
    public static void printArray(int[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}