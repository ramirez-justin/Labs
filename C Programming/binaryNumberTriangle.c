#include <stdio.h>

int main() {
    int n;

    // user input for number of rows
    printf("Enter the number of rows: ");
    scanf("%d", &n);

    // for loop to print the triangle
    for (int i = 1; i <= n; i++) {
        int val = i % 2 == 0 ? 0 : 1; // Starting value
        for (int j = 1; j <= i; j++) {
            printf("%d ", val);
            // Toggle between 0 and 1
            val = val == 0 ? 1 : 0; 
        }
        printf("\n");
    }

    return 0;
}