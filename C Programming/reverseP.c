#include <stdio.h>
#define N 100

int main() {
    char arr[N], *ptr = arr;
    char ch;

    printf("Enter a message: ");

    // Read the message one character at a time and store in array
    while ((ch = getchar()) != '\n' && ptr < arr + N) {
        *ptr++ = ch;
    }

    printf("Reversal is: ");

    // Print the reversal of the message
    for (ptr--; ptr >= arr; ptr--) {
        putchar(*ptr);
    }

    printf("\n");

    return 0;
}
