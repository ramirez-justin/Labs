#include <stdio.h>

int main() {
    int arr[100], i, n, sum = 0;
    // Input the size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    // Input the elements of the array
    printf("Enter the elements of the array seperated by spaces: ");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
        sum += arr[i];  // Add each element to the sum as it's entered
    }
    // Print the sum of the array elements
    printf("The sum of the array elements is %d\n", sum);
    return 0;
}
