//Justin Ramirez
//CSC 2720
//Class time: TTH 1415
//Due time: 3/23
import java.util.*;

public class DataStructuresAssignment32 {
    /** 
     * Test Cases:
     * Empty String
     * Expressions of varied length
     * Use of characters which are not the proper operators
     * Use of non integers
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a post-fix expression such as '10 2 * 15 +' \nMake sure all characters are seperated by spaces");
        String input = sc.nextLine();   // user input
        String[] expression = input.split("\\s+");  // fill array using spaces to identify elements
        int result = evaluate(expression);  // method call and store result of expresion in int var
        System.out.println("Result: " + result);    
        sc.close();
    }
    /**
     * Evaluates the post-fix expression using stack object
     * @param tokens String array from main() method
     * @return result of operations stored at top of stack
     */
    public static int evaluate(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {   // for-loop iterates through each token in tokens
            if (isNumber(token)) {  // method call tests if token is a number
                stack.push(Integer.parseInt(token)); // adds number to stack
            } else {    // not a number
                int operand2 = stack.pop();     // assigns second number to operand2
                int operand1 = stack.pop();     // assigns first number to operand1
                int result = evaluateOperation(token, operand1, operand2);      // method call using operator and two operands
                stack.push(result);     // adds result of evaluation to stack
            }
        }
        return stack.pop();     // returns last result stored on stack
    }
    /**
     * Checks if variable is an integer
     * @param token String from evaluate() method
     * @return true if string is an integer
     */
    private static boolean isNumber(String token) {
        try {       // try-catch to handle non-integers
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    /**
     * Evaluates mathmatical operation given an operator and two operands
     * @param operator character from evaluate() method
     * @param operand1 integer from evaluate() method
     * @param operand2 integer from evaluate mehtod
     * @return the result of the mathmatical operation
     * @throws IllegalArgumentException if operator is not '+' '-' '/' '*'
     */
    private static int evaluateOperation(String operator, int operand1, int operand2) {
        switch (operator) {     // cases for +, -, /, and *
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);    // if operator is not as expected
        }
    }
    /* Time Complexity: The time complexity of this implementation is O(n), where n is 
     * the number of tokens in the input array. This is because we iterate over the array 
     * of tokens once, and each operation within the loop takes constant time.
     * 
     * Space Complexity: The space complexity of this implementation is O(n), where n is 
     * the number of tokens in the input array. This is because we use a stack to store 
     * the operands and intermediate results, and the stack can have at most n elements. 
     */
}
