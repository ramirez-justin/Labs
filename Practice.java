

public class Practice {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1 };
        System.out.println(inClassEx1(arr));
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

    public static void rotate(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[l] < arr[m]) {
                l = m;
            }
        }
    }

    

}