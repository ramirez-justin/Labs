#include <stdio.h>
#include <stdbool.h>

bool check30(int num1, int num2) {
    // checks if either number is 30 or if their sum is 30
    if (num1 == 30 || num2 == 30 || num1 + num2 == 30) {
        return true;
    } else {
        return false;
    }
}

int main() {
    int num1, num2;

    printf("Enter two integers: ");
    scanf("%d %d", &num1, &num2);
    // call check30() function
    if (check30(num1, num2)) {
        printf("True\n");
    } else {
        printf("False\n");
    }

    return 0;
}