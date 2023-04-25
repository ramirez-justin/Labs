#include <stdio.h>
#include <stdlib.h>

struct node {
   int data;
   struct node *next;
};

void displayList(struct node *head) {
   struct node *ptr = head;
   printf("The linked list is: ");
   while (ptr != NULL) {
      printf("%d ", ptr->data);
      ptr = ptr->next;
   }
   printf("\n");
}

int main() {
   int n, i, data;
   struct node *head, *prev, *newnode;
   
   printf("Enter the number of nodes: ");
   scanf("%d", &n);
   
   head = NULL; // initially, the list is empty
   
   for (i = 1; i <= n; i++) {
      printf("Enter data for node %d: ", i);
      scanf("%d", &data);
      
      newnode = (struct node*) malloc(sizeof(struct node)); // allocate memory for new node
      newnode->data = data; // assign data to new node
      newnode->next = NULL; // set next pointer of new node to NULL
      
      if (head == NULL) { // if list is empty
         head = newnode; // make new node as head
         prev = newnode; // also make it as previous node
      }
      else {
         prev->next = newnode; // make previous node's next pointer to point to the new node
         prev = newnode; // set previous node as the new node
      }
   }
   
   displayList(head);
   
   return 0;
}