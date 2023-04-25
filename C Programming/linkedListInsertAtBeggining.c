#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *next;
};

struct Node* create_Node(int data){
    // allocate memory for new Node
    struct Node* p = (struct Node*) malloc(sizeof(struct Node)); 
    p->data = data;  // assign data to new Node
    p->next = NULL;  // set next pointer of new Node to NULL
    return p;
}

/* Function to delete a Node from the middle of a singly linked list */
void deleteNodeFromMiddle(struct Node* head) {
    // Start pointers at head of linkedList
    struct Node *slow_ptr = head;
    struct Node *fast_ptr = head;
    struct Node *prev = NULL;
    // For every 1 move of slow pointer, fast pointer will make 2
    while (fast_ptr != NULL && fast_ptr->next != NULL) {
        fast_ptr = fast_ptr->next->next;
        prev = slow_ptr;
        slow_ptr = slow_ptr->next;
    }
    prev->next = slow_ptr->next;
    free(slow_ptr);   // deallocates the memory previously allocated
}

void insert_Node_at_beginning(struct Node** head_ref, int data){
    // call create Node function
    struct Node* new_Node = create_Node(data);  
    // new Node points to previous head as next
    new_Node->next = *head_ref; 
    // head reference pointer point to new Node
    *head_ref = new_Node;  
}

void print_list(struct Node *head){
    struct Node *current = head;
    while(current != NULL){
        printf("%d ", current->data);
        current = current->next;
    }
}

int main(){
    struct Node *head = NULL;
    int num_Nodes, i, data;
    printf("Enter the number of Nodes: ");
    scanf("%d", &num_Nodes);

    for(i = 0; i < num_Nodes; i++){
        printf("Enter the data for Node %d: ", i+1);
        scanf("%d", &data);
        insert_Node_at_beginning(&head, data);
    }

    printf("The linked list is: ");
    print_list(head);

    deleteNodeFromMiddle(head);

    printf("\nLinked list after deleting the middle node: ");
    print_list(head);

    return 0;
}