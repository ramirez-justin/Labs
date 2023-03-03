#include <stdio.h>

int main(void) {
    float i;
    int x, y;
    printf("Enter a phone number in the form (XXX-XXX-XXX): ");
    scanf("%d-%f-%d", &x, &i, &y);
    printf("You entered (%d)%f-%d", x, i, y);
    return 0;
}