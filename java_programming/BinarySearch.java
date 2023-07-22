//Justin Ramirez
//CSC 2720 Lab CS225
//Lab time: W 1300
//Due time: 1/22

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        // I hard coded the array but it would be really easy to use the same methods from my DeDuplication class
        int a[] = { 11, 21, 33, 40, 50 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number to search for: ");
        int n = sc.nextInt();
        int index = binarySearch(a, n);
        if (index >= 0)
            System.out.println("The index of " + n + " is: " + index);
        sc.close();
    }

    public static int binarySearch(int v[], int n) {
        int left = 0;
        int right = v.length - 1;
        int count = 0;
        while (left <= right) {
            int mid = left + (right - left)/2;
            count++;
            if(v[mid] == n) {
                System.out.println("Found input number, search required " + count + " check(s).");
                return mid;
            } else if (v[mid] < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Failed to find the input number.");
        return -1;
    }
}