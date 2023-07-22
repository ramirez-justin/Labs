// Justin Ramirez
// CSC 2720 Lab 11
// Class Time: TH 1415
// Due time: 4/2/2023 @ 2359

import java.util.*;

// Class to represent Tree node
class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = null;
        right = null;
    } 
}


public class LevelOrderTraversal {
    /* Test Cases: 
     * Handling empty BinaryTree
     * Tree with duplicates
     * Tested Trees of different sizes
     */
    public static void main(String[] args) {
        // Construct the binary tree
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);
        
        // Perform level order traversal using Deque
        Deque<Node> queue = new LinkedList<>();
        queue.addLast(root);
        
        while (!queue.isEmpty()) {  
            Node current = queue.removeFirst();
            System.out.print(current.data + " ");   // Prints curretn starting with root
            
            if (current.left != null) {
                queue.addLast(current.left);    // adds left to end of queue, if it exists
            }

            if (current.right != null) {
                queue.addLast(current.right);   // adds right to end of queue, if it exists
            }
        }
    }
}
