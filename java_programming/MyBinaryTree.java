// Justin Ramirez
// CSC 2720 Lab 10
// Class Time: TH 1415
// Due time: 3/26/2023 @ 2359

public class MyBinaryTree {
/* Test Cases: 
 * Handling empty BinaryTree
 * Tree with duplicates
 * Tested Trees of different sizes
 */
    public static void main(String[] args) {
        MyBinaryTree tree = new MyBinaryTree(); //Create instance of Binary Tree
        tree.root = new Node(4);    //Adding new nodes at respective locations in tree
        tree.root.left = new Node(2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(7);

        System.out.print("Pre-order traversal: ");   // Print each method for travesing tree      
        tree.preOrder(tree.root);

        System.out.print("\nIn-order traversal: ");
        tree.inOrder(tree.root);

        System.out.print("\nPost-order traversal: ");
        tree.postOrder(tree.root);
        System.out.println();
        tree.printKth(tree.root, 3);
        tree.isBST(tree.root);
    }

    // Class to represent Tree node 
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = null;
            right = null;
        }
    }

    Node root;

    /** 
     * Pre-order traversal of the binary tree
     * Root - Left - Right
     * @param
     */
    public void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * In-order traversal of the binary tree
     * Left - Root - Right
     * @param 
     */
    public void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    /** 
     * Post-order traversal of the binary tree
     *  Left - Right - Root
     * @param 
     */
    public void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void printKth(Node node, int x) {
        if (node == null)
            return;
        printKth(node.left,x-1);
        if (x == 0)
            System.out.println(node.data);
        printKth(node.right, x-1);
    }

    public boolean isBST(Node node) {
        if (node == null)
            return true;
        else if (node.left.data > node.data)
            return false;
        else if (node.right.data < node.data)
            return false;
        return isBST(node.left) && isBST(node.right);
    }
}