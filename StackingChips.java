import java.io.*;
import java.util.*;

public class StackingChips {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Enter a series of parantheses and press enter, \nwhen you are done entering groups, \nenter 'q'");
        Scanner sc = new Scanner(System.in);
        String input = "i";
        while (input != "q") {
            input = sc.nextLine();            
            stack.push(input);
        }
        sc.close();
        System.out.println(stack);
        isBalanced(stack);
    }    

    public static boolean isBalanced(Stack stack) {
        boolean status = false;
        
        return status;
    }


}
