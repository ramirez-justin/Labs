//Justin Ramirez
//CSC 2720
//Class time: TTH 1415
//Due time: 3/23
import java.util.*;

public class DataStructuresAssignment31 {
    /** 
     * Test Cases:
     * Empty String
     * Tested Strings of very different lengths
     * A varied number of duplicates
     * Use of characters which are not parentheses
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("\nEnter a series of parentheses and press enter: ");
        String str = sc.nextLine();     // user input
        sc.close();
        System.out.println(hasBalancedParentheses(str));    // method call using the provided input
    }    
    /** 
     * Method which uses a stack to identify if the parentheses are balanced
     * @param str user input from Scanner
     * @return true if stack is empty
     */
    public static boolean hasBalancedParentheses(String str) {
        Stack<Character> stack = new Stack<>();     // initialized stack object
        for (int i = 0; i < str.length(); i++) {    // for-loop bound by the user input
            char c = str.charAt(i);     // char pointer to identify each parentheses
            if (c == '(' || c == '[' || c == '{') {     // looks for open paren
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {   // looks for closed paren in non empty stack matching the last used open paren (
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {   // looks for closed paren in non empty stack matching the last used open paren [
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {   // looks for closed paren in non empty stack matching the last used open paren {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();     // if the stack is empty, then it was balanced and this will return true
    }
}

