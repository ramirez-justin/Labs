#include <stdio.h>

typedef struct {
    int feet;
    int inches;
} Distance;

void add(Distance *d1, Distance *d2, Distance *result);

int main() {
    Distance d1, d2, result;

    // Prompt user for input values
    printf("Enter the first distance in feet and inches seperated by a space: ");
    scanf("%d %d", &d1.feet, &d1.inches);
    printf("Enter the second distance in feet and inches seperated by a space: ");
    scanf("%d %d", &d2.feet, &d2.inches);

    // Call the add function using pointers to structures
    add(&d1, &d2, &result);

    // Print the result
    printf("The sum is: %d feet %d inches\n", result.feet, result.inches);

    return 0;
}

void add(Distance *d1, Distance *d2, Distance *result) {
    // Add the inches and carry over if necessary
    result->inches = d1->inches + d2->inches;
    if (result->inches >= 12) {
        result->inches -= 12;
        result->feet += 1;
    }

    // Add the feet
    result->feet = d1->feet + d2->feet;
}
