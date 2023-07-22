#include <stdio.h>
#include <stdlib.h>

/* Node structure for the linked list */
struct Node {
    int data;
    struct Node* next;
};

/* Function to delete a node from the middle of a singly linked list */
void deleteNodeFromMiddle(struct Node* head) {
    struct Node *slow_ptr = head;
    struct Node *fast_ptr = head;
    struct Node *prev = NULL;
    while (fast_ptr != NULL && fast_ptr->next != NULL) {
        fast_ptr = fast_ptr->next->next;
        prev = slow_ptr;
        slow_ptr = slow_ptr->next;
    }
    prev->next = slow_ptr->next;
    free(slow_ptr);
}

/* Function to print the linked list */
void printList(struct Node* node) {
    while (node != NULL) {
        printf("%d ", node->data);
        node = node->next;
    }
    printf("\n");
}

/* Main function */
int main() {
    struct Node* head = NULL;
    struct Node* second = NULL;
    struct Node* third = NULL;

    /* Allocate memory for the nodes */
    head = (struct Node*)malloc(sizeof(struct Node));
    second = (struct Node*)malloc(sizeof(struct Node));
    third = (struct Node*)malloc(sizeof(struct Node));

    /* Assign data values to the nodes */
    head->data = 1;
    second->data = 2;
    third->data = 3;

    /* Connect the nodes */
    head->next = second;
    second->next = third;
    third->next = NULL;

    printf("Original linked list: ");
    printList(head);

    deleteNodeFromMiddle(head);

    printf("Linked list after deleting the middle node: ");
    printList(head);

    return 0;
}