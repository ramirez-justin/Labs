#include <stdio.h>
#include <string.h>

int main() {
    char str[100];
    int i;

    // Prompt user for input string
    printf("Enter a string: ");
    scanf("%s", str);

    // Print the string in reverse order
    printf("The reverse order of the string is: ");
    for (i = strlen(str) - 1; i >= 1; i--) {
        printf("%c, ", str[i]);
    }
    printf("%c\n", str[0]);

    return 0;
}