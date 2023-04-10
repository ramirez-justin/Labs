// Justin Ramirez
// CSC 2720 Assignment 4
// Class Time: TH 1415
// Due time: 4/11/2023 @ 2359

class BST {
    /* Test Cases: 
     * Handling empty BinaryTree
     * Tree with duplicates
     * Tested Trees of different sizes
     */
    public static void main(String[] args) {
        BST tree = new BST(); //Create instance of Binary Tree
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(7);

        System.out.print("BST prior to removal of root: ");
        tree.inOrder(tree.root);
        tree.deleteRoot();
        System.out.print("\nBST after the removal of root: ");
        tree.inOrder(tree.root);
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
     * Delete the root node and replace with the next 
     * node in the in order traversal
     */
    public void deleteRoot() {
        if (root == null) {
            return;
        }
        Node newRoot = null;
        if (root.left == null) {
            newRoot = root.right;
        } else if (root.right == null) {
            newRoot = root.left;
        } else {
            // Find the inorder successor of the root
            Node successorParent = root;
            Node successor = root.right;
            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }
            // Replace the root with the successor
            successor.left = root.left;
            if (successorParent != root) {
                successorParent.left = successor.right;
                successor.right = root.right;
            }
            newRoot = successor;
        }
        root = newRoot;
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
}