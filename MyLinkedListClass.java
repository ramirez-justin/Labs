//Justin Ramirez
//CSC 2720 Lab CS225
//Lab time: W 1300
//Due time: 2/26/2023 @ 11:59PM

public class MyLinkedListClass {
    Node head;  // first object in my linked list
    static class Node {
        int data;
        Node next;
        
        Node(int data) {    // Create a node
        this.data = data;
        this.next = null; 
        }
    }
    /* Test Cases:
     * No Nodes in linked list;  if (head == null)
     * Tested different N
     * Tested linked lists of very different lengths
     * Unsorted lists
     */
    public static void main(String[] args) {
        MyLinkedListClass myList = new MyLinkedListClass(); // Create new object myList
        // fill myList
        myList.add(50);
        myList.add(11);
        myList.add(33);
        myList.add(21);
        myList.add(40);
        myList.add(71);
        // print original myList
        System.out.println("Here is the original List:");
        myList.printList();
        // remove Nth from last
        myList.removeNthFromLast(2);
        // print new myList
        System.out.println("Here is the new List:");
        myList.printList();
    }

    void removeNthFromLast(int n) {     // method to remove the Nth from last node of a linked list
        Node slow = head, fast = head;  // initializing two pointers at the beggining of the linked list
        while (n != 0) {                // set fast pointer to n nodes ahead 
            fast = fast.next;           
            n--;
        }
        while (fast.next != null) {     // move each pointer through linked list until fast is just before null
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;     // make the node before Nth from last point to the node after
    }

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