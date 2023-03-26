#include <stdio.h>

int main(void) {
    // initialize an array of int
    int numbers[5] = {0};
    int i = 0;

    // print the address of the array variable
    printf("numbers = %p\n", numbers);

    // print address of each array element using method 1
    printf("Method 1: Addresses of array elements");
    do {
    printf("numbers[%u] = %p\n", i, (void *)(&numbers[i]));
    i++;
    } while(i < 5);

    i=0;
    printf("Method 2: Addresses of array elements");
    // print address of each array element using method 2
    do {
    printf("numbers[%u] = %p\n", i, (void *)(numbers + i));
    i++;
    } while(i < 5);

    // print the size of the array
    printf("sizeof(numbers) = %lu\n", sizeof(numbers));
}