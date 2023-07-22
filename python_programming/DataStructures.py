# Node Class
class LinkedListNode:
    def __init__(self, data):
        self.data = data
        self.next = None

# LinkedList class
class LinkedList:
    # Constructor Method
    def __init__(self):
        self.head = None

    # Add Node Method
    def add_node(self, data):
        new_node = LinkedListNode(data)
        if self.head is None:
            self.head = new_node
        else:
            current_node = self.head
            while current_node.next is not None:
                current_node = current_node.next
            current_node.next = new_node

    #Remove Node Method
    def remove_element(head, data):
        if head is None:
            return
        head.next = remove_element(head.next, data)
        return head.next if head.data == data else head

    # Print Linked List Method
    def print_list(self):
        current_node = self.head
        while current_node is not None:
            print(current_node.data)
            current_node = current_node.next

# Main Method
if __name__ == "__main__":
    pass
