#include <stdio.h>

int main() {
    int arr[100], i, n, sum = 0;
    // Input the size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        // Input the elements of the array
        printf("Enter next element of array: ");
        scanf("%d", &arr[i]);
        // Add each element to the sum as it's entered
    }
    int *ptr = arr;  // Pointer to the first element of the array

    // Traverse the array using pointer arithmetic
    for (int i = 0; i < n; i++) {
        sum += *ptr;
        ptr++;
    }

    printf("\nThe sum of all elements in the array is: %d\n", sum);

    return 0;
}