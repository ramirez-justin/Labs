#include <stdio.h>
#include <string.h>

int main() {
    char str[100];
    int vowels = 0, consonants = 0;

    printf("Enter a string: ");
    fgets(str, 100, stdin);  // Read string from user input

    for (int i = 0; i < strlen(str); i++) {
        char ch = str[i];

        // Check if the character is a letter
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            // Check if the letter is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            } else {  // Otherwise, it's a consonant
                consonants++;
            }
        }
    }

    printf("The total number of vowels in the string is: %d\n", vowels);
    printf("The total number of consonants in the string is: %d\n", consonants);

    return 0;
}