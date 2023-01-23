//Justin Ramirez
//CSC 2720 Lab CS225
//Lab time: W 1300
//Due time: 1/22

public class DeDuplication {
    public static void main(String[] args){
        int a[] = { 50, 11, 33, 21, 40, 50, 40, 40, 21 };
        // Sort Array
        sortArray(a);
        // Remove duplicates
        int b[] = removeDuplicates(a);
        // Print Array
        printArray(b);
          
    }

    // My method for sorting the array
    public static void sortArray(int[] a){
        int n = a.length;
        int tmp;
        for (int i = 0; i < n; i++){  
            for (int j = i + 1; j < n; j++){  
                    if (a[i] > a[j]){  
                        tmp = a[i];  
                        a[i] = a[j];  
                        a[j] = tmp;  
                    }  
                }
        }
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

    // Method for printing the array
    public static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}