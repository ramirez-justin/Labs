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
    public static void bubbleSort(int x[]) {
        int n = x.length;
        boolean swpd;
        do {
            swpd = false;
            for (int i = 0; i < n-1; i++) {
                if (x[i] > x[i+1]) {
                    int temp = x[i];
                    x[i] = x[i+1];
                    x[i+1] = temp;
                    swpd = true;
                }
            }
        } while (swpd);
    }

    // Method to print the array
    public static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}