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

    // My method for removing the duplicates, requires sorting
    public static int[] removeDuplicates(int[] arr) {
        int current = arr[0];   // pointer to track current index
        int k = 1;      // unique counter for new array length
        for (int i = 1; i < arr.length; i++) {  // iterate through array once to compare current with i pointer beginning at 1
            if (arr[i] != current){     // not a duplicate
                arr[k] = arr[i];        // move next non duplicate to next non double spot 
                current = arr[i];       // move value of curent
                k++;
            }
        }
        int[] b = new int[k];   // initialize new array of length k
        for (int i = 0; i < k; i++){    // fill the new array using the rearanged arr
            b[i] = arr[i];
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