#include <stdio.h>

void add(int *a, int *b, int *result);

int main() {
    int a, b, result;

    // Prompt user for input values
    printf("Enter the first number: ");
    scanf("%d", &a);
    printf("Enter the second number: ");
    scanf("%d", &b);

    // Call the add function using pointers
    add(&a, &b, &result);

    // Print the result
    printf("The sum is: %d\n", result);

    return 0;
}

void add(int *a, int *b, int *result) {
    *result = *a + *b;
}