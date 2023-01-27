//Justin Ramirez
//CSC 2720 Lab CS225
//Lab time: W 1300
//Due time: 1/29

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = { 50, 11, 33, 21, 40, 50, 40, 40, 21 };
        bubbleSort(nums);
        printArray(nums);
    }

    // Method to sort an array using bubble sort method
    public static void bubbleSort(int x[]) { // input size n
        int n = x.length;   // 1 step
        boolean swpd;   // 1 step
        do {   // n-1 times
            swpd = false;
            for (int i = 0; i < n-1; i++) {   // n-1 times
                if (x[i] > x[i+1]) {   // 2 steps
                    int temp = x[i];   // 1 step, 1 space
                    x[i] = x[i+1];   // 1 step
                    x[i+1] = temp;   // 1 step
                    swpd = true;   // 1 step
                }
            }
        } while (swpd); // 2 + n^2 + 6 -> O(n^2)
    }   // space complexity O(1)

    // Method to print the array
    public static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}