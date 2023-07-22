/* reverse.c */
#include<stdio.h>
#define N 100

int main() {
    int arr[N],i=0;
    char ch;
    
    printf("Enter a message: ");
    
    // Read the message one character at a time and store in array
    while ((ch = getchar()) != '\n' && i < N) {
        arr[i++] = ch;
    }

    printf("Reversal is: ");
    
    // Print out the reversal by using putchar()
    for (int j = i-1; j >= 0; j--) {
        putchar(arr[j]);
    }

    printf("\n");

    return 0;
}