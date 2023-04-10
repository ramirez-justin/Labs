#include <stdio.h>

int main() {
    int arr[100], n, i, j, flag;

    // Input the size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    // Input the elements of the array
    printf("Enter the elements of the array seperated by spaces: ");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Loop through each element of the array
    printf("The unique elements in the array are: ");
    for (i = 0; i < n; i++) {
        flag = 0;
        // Check if the element is repeated
        for (j = 0; j < i; j++) {
            if (arr[i] == arr[j]) {
                flag = 1;  // If it is repeated, set flag to 1
                break;
            }
        }
        if (flag == 0) {
            printf("%d ", arr[i]);  // If the flag is 0, the element is unique
        }
    }

    return 0;
}