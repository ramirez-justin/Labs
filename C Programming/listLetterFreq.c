#include <stdio.h>
#include <ctype.h>

int main() {
    char str[250];
    int freq[26] = {0}; // initialize frequency array to 0

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin); // read input string

    // count frequency of each letter, ignoring case
    for (int i = 0; str[i] != '\0'; i++) {
        if (isalpha(str[i])) {
            char c = tolower(str[i]);
            freq[c - 'a']++;
        }
    }

    // print frequency of each letter
    for (int i = 0; i < 26; i++) {
        printf("Letter %c or %c appears %d times\n", 'a' + i, 'A' + i, freq[i]);
    }

    return 0;
}