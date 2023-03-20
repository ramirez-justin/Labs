// Justin Ramirez
// CSC 2720 Assignment2
// Class Time: TH 1415
// Due time: 3/12/2023 @ 2359
import java.util.*;

/* Test Cases: 
 * Handling empty stack
 * Stack with duplicates
 * Tested stacks of very different lengths
 * A varied number of duplicates
 * Try/catch block to handle improper input
 * If statement to handle improper mode selection input
 */

public class MinStack {
    private Stack<Integer> stack;   // regular stack attribute for my minStack class
    private Stack<Integer> minStack;    // minStack attribute for my minStack class
    public static Scanner sc = new Scanner(System.in); // made a scanner that can be used throughout the class
    
    public static void main(String[] args) {    // main method
        MinStack minStack = new MinStack();     // initialize minStack and its two stack attributes
        program(minStack);      // run method to prompt udser for input
    }

    public static void program(MinStack minStack) {
        char type = ' ';    // character to track mode
        do {
            type = ' ';     // initialize/reset mode selection
            int current;
            System.out.println("Please enter an operation character(a = add, r = remove, m = minimum element of stack, t = top, q = quit):");
            type = sc.next().charAt(0);    //input for mode selection
            if (type == 'a') {      // input mode
                try {       // needed a try/catch for posible input type errors
                // input mode prompt to add numbers to queue
                    System.out.print("Please enter a number to add to the stack: ");
                    current = sc.nextInt();
                    sc.nextLine();
                    minStack.push(current); // method to add numbers to stack and min stack if min
                } catch (Exception e) {     // catch block for handling improper input types
                    System.out.println("Error: improper input!");
                    sc.next();
                }
            } else if (type == 'r') {   // remove mode
                minStack.pop();     // method to remove nu8mber from stack
            } else if (type == 'm') {   // minimum number mode
                int min = minStack.getMin();    // method to get the minimum number in the stack
                System.out.println("The minimum number in the stack is " + min);
            } else if (type == 't') {   // top of stack mode
                int top = minStack.top();   // method to get the number at the top of the stack
                System.out.println("The number at the top of the stack is " + top);
            } else if (type == 'q') {    //quit mode
                break;
            } else {
                System.out.println("Invalid input. Please try again."); // handles improper input so mode selection
            }
        } while(type != 'q');      
        sc.close();
    }

    public MinStack() {     // contstructor for MinStack
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) { // method to add numbers to stack and min stack if min
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() { // method to remove number from stack
        int val = stack.pop();
        System.out.println("The number " + val + " has been removed.");
        if (val == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {  // method to get the number at the top of the stack
        return stack.peek();
    }

    public int getMin() {   // method to get the minimum number in the stack
        return minStack.peek();
    }
}