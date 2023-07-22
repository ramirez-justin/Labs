//Justin Ramirez
//CSC 2720 Lab CS225
//Lab time: W 1300
//Due time: 4/23/2023 @ 11:59PM
import java.util.*;
    /** 
     * Test Cases:
     * arr = [3, 1, 4, 2, 5], k = 3
     * Expected output: 3
     * arr = [3, 1, 4, 2, 5], k = 5
     * Expected output: 1
     * arr = [5, 5, 5, 5, 5], k = 3
     * Expected output: 5
     * arr = [1], k = 1
     * Expected output: 1
     * arr = [1], k = 4
     * Expected output: 0
     * arr = [], k = 1
     * Expected output: throw an exception (such as NumberFormatException)
     */
public class KBiggestElement {
    public static void main(String[] args) {
        int[] arr = new int[50];    // Initialize large empty array
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter a comma separated list of numbers: ");
        String nums = sc.nextLine();    // Take input to string
        String[] numArr = nums.split(", ");     // change string to string array
        int n = numArr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(numArr[i]);   // Convert String array to int array
        }
        int k;
        System.out.print("Enter a 'k' for the kth biggest element to search for: ");
        k = sc.nextInt();
        System.out.print(kBiggest(arr, k));
        sc.close();
    }

    /**
     * A method for finding the Kth biggest integer in an array
     * @param arr
     * @param k
     * @return kth largest number
     */
    public static int kBiggest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for (int i = 0; i < k; i++) {
            pq.offer(arr[i]);   // add first k elements to Priority Queue
        }
        for (int i = k; i < arr.length; i++) {
            int current = arr[i];
            if (current > pq.peek()) {  // checks if the other elements of arr are greater than head of pq
                pq.poll();  // removes head
                pq.offer(current);  // adds current to Piority Queue
            }
        }
        return pq.peek();
    }
}
