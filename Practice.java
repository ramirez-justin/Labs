import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer n: ");
        int n = sc.nextInt();
        int low = 0;
        int high = n-1;
        int guess = (low + high) / 2;
        System.out.println("Welcome to Guess My Number!" + "\nPlease think of a number between 0 and "+ high);

        while (low <= high) { 
            System.out.print("Is yor number " + guess + "? \nEnter your response (H/L/C): ");
            char response = sc.next().charAt(0);
            if (response == 'L') {
                low = guess + 1;
            } else if (response == 'H') {
                high = guess - 1;
            } else if (response == 'C') {
                System.out.println("I guessed your number!");
                break;
            } else {
                System.out.println("Invalid response. Please enter 'l', 'h', or 'c'.");
            }
            guess = (low + high) / 2;
        }
        sc.close();
    }
}