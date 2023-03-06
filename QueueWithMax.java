// Justin Ramirez
// CSC 2720 Assignment2
// Class Time: TH 1415
// Due time: 3/5/2023 @ 2359
import java.util.*;
/* Test Cases: 
 * Handling empty Queue
 * Queue with duplicates
 * Tested queues of very different lengths
 * A varied number of duplicates
 * Try/catch block to handle improper input
 * If statement to handle improper mode selection input
 */
public class QueueWithMax {
    public static void main(String[] args){
        // Created two new objects, mainQueue and maxQueue
        ArrayDeque<Integer> mainQueue = new ArrayDeque<>();
        ArrayDeque<Integer> maxQueue = new ArrayDeque<>();
        // Created two scanners, one to track mode and one to recieve input data
        Scanner charScanner = new Scanner(System.in);
        Scanner dataScanner = new Scanner(System.in);
        // Character for mode selection
        char type;
        do {
            type = ' ';     // initialize/reset mode selection
            System.out.println("Please enter an operation character(i = insert, r = remove, q = quit):");
            type = charScanner.next().charAt(0);    //input for mode selection
            if (type == 'i') {      // input mode
                try {       // needed a try/catch for posible input type errors
                // input mode prompt to add numbers to queue
                    System.out.println("Please enter a number to add to the queue: ");
                    int current = dataScanner.nextInt();
                    mainQueue.add(current);
                // adding the max element to the maxQueue
                    while (!maxQueue.isEmpty() && maxQueue.peekLast() < current) {
                        maxQueue.removeLast();      // removing any elements at the end of maxQueue less than current
                    }
                    maxQueue.addLast(current); // adding current value to max queue
                } catch (Exception e) {     // catch block for handleing improper input types
                    System.out.println("Error: improper input!");
                    dataScanner.next();
                }
            } else if (type == 'r') {   // remove mode
                if (mainQueue.isEmpty())    // to prevent a NoSuchElementException
                    continue;
                int current = mainQueue.remove();   // Removes first element in queue
                if (current == maxQueue.peekFirst()) {  // check if current is first element of maxQueue and removes it
                    maxQueue.removeFirst();
                }
                System.out.println("The number " + current + " has been removed" );
  
            } else if (type == 'q'){    //quit mode
                break;
            } else {
                System.out.println("Invalid input. Please try again."); // handles improper input so mode selection
            }
            System.out.println("Main Queue: " + mainQueue);     // Prints mainQueue
            System.out.println("Max Queue: " + maxQueue);       // Prints maxQueue
        } while(type != 'q');      
        charScanner.close();
        dataScanner.close();
    }
}