import java.util.*;
public class Practice {
    public static void main(String[] args) {
        
    }

    public static int sumElements(ArrayList<Integer> numsList) {
        int sum = 0;
        for (int i = 0; i < numsList.size(); i++) {
            sum += numsList.get(i);
        }
        return sum;
    }

    public static void fillArrayList(ArrayList<Integer> numsList, int size) {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            numsList.add(rand.nextInt(100));
        }
    }

    public static void twice2DArray(int[][] twoDArr) {
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[i].length; j++) {
                twoDArr[i][j] *= 2;           
            }
        }
    }

    public static void print2DArray(int[][] twoDArr) {
        for (int[] arr : twoDArr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }         
            System.out.println();
        }
    }

    public static int inClassEx1(int[] arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            sum = sum + arr[i];
        }
        for (int i = 0; i < arr.length; i++){
            
        }
        return max;
    }

    public static void countUpTo(int x, int y) {
        if ( x == y) 
            System.out.println(x);
        else {
            System.out.println(x);
            countUpTo(x + 1, y);
        }
    }

    public static void rotate(int[] arr, int k) {
        do {
            int last = arr[arr.length-1];
            for (int i = arr.length-2; i >= 0; i--) {
                arr[i+1] = arr[i];
            }
            arr[0] = last;
            k--;
        } while (k != 0);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}