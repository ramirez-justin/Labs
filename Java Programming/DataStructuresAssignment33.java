
public class DataStructuresAssignment33 {
    /** 
     * Test Cases:
     * Empty linked list
     * Tested linked list of very different lengths
     * A varied number of duplicates
     * Did not test non integers since values were hard coded
     */
    public static void main(String[] args) {
        MyLinkedListClass myList = new MyLinkedListClass();
        myList.add(5);
        myList.add(7);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.print("Original list: ");
        myList.printList();
        myList.reverseLinkedList();
        System.out.print("Reversed list: ");
        myList.printList();
    }
    /**
     * Custom LinkedList Class; linear data structure which has a head Node that points to  
     * the next Node which points to each subsiquent node
     */
    static class MyLinkedListClass {
        Node head;  // first characteristic, head of linkedList
        static class Node {
            int data;
            Node next;
            
            Node(int data) {    // Create a node
            this.data = data;
            this.next = null; 
            }
        }
        /**
         * Method that reverses the MyLinkedList object 
         */
        public void reverseLinkedList() {
            if (head == null) {  // empty list
                return;
            }
            Node prev = null;
            Node curr = head;
            while (curr != null) {
                Node next = curr.next;  // save next pointer
                curr.next = prev;  // reverse link
                prev = curr;  // move pointers forward
                curr = next;
            }
            head = prev;  // set new head
        }
        /**
         * Method for adding Nodes to the MyLinkedListClass object
         * @param new_data
         */
        public void add(int new_data) {
            Node new_node = new Node(new_data);     // allocates new node, inserts data, sets next as null 
            if (head == null) {     // if the linked list is empty, the first entry is the head
                head = new Node(new_data);
                return;
            }
            new_node.next = null; // sets next as null
            Node last = head;       // new pointer to find the end of the list
            while (last.next != null) {     // while loop to find the end of the list
                last = last.next;
            }
            last.next = new_node;   // insert new node at end of list
            return;
        }

        /**
         * Method for printing the MyLinkedList object in a formatted way
         */
        public void printList() {       // method to print each node in a linked list
            Node n = head;              // pointer to iterate through the linked list
            while (n.next != null) {         // while the pointer is not null, print the current nodes data
                System.out.print(n.data + ", ");
                n = n.next;
            }
            System.out.print(n.data);   // print last node
            System.out.println();
        }
    }
}