#include <stdio.h>

int main(void) {
    int a1, a2, a3;
    printf("Enter a phone number in the form (XXX-XXX-XXX): ");
    scanf("%d-%d-%d", &a1, &a2, &a3);
    printf("You entered: (%03d)%03d-%04d", a1, a2, a3);
    return 0;
}