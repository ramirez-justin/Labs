#include <stdio.h>
#include <stdlib.h>

int main() {
    int x = 5;
    int y = 5;
    char name[] = "Justin";
    int age = 34;
    if (x + y == 10) {
        printf("\n");
        printf("My name is %s Ramirez\n", name);
        printf("My age is %d \n", age);
    } else {
        printf("Sorry %s, wrong answer!\n", name);
    }
    return 0;
}