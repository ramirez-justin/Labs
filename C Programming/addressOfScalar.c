#include <stdio.h>

int main() {
    // intialize a char variable, print its address and the next address
    char charvar = 'a';
    printf("address of charvar = %p\n", (void *)(&charvar));
    printf("address of charvar - 1 = %p\n", (void *)(&charvar - 1));
    printf("address of charvar + 1 = %p\n", (void *)(&charvar + 1));

    // intialize an int variable, print its address and the next address
    double doublevar = 1.0;
    printf("address of doublevar = %p\n", (void *)(&doublevar));
    printf("address of doublevar - 1 = %p\n", (void *)(&doublevar - 1));
    printf("address of doublevar + 1 = %p\n", (void *)(&doublevar + 1));
}