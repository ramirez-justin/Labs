#include <stdio.h>
#include <stdlib.h>

int main() {
    int x, y, temp;
    printf("Please enter two integers(seperate using spaces): ");
    scanf("%d %d", &x, &y);
    printf("You have entered: %d and %d\n", x, y);
    temp = x;
    x = y;
    y = temp;
    printf("Now we have swapped them: %d and %d\n", x, y);
    return 0;
}