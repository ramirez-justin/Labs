#include <stdio.h>

#define NUM_LETTERS 26

int main() {
    int freq[NUM_LETTERS] = {0}; // initialize frequency array to 0

    int c;
    while ((c = getchar()) != EOF) {
        if (c >= 'a' && c <= 'z') {
            freq[c - 'a']++;
        } else if (c >= 'A' && c <= 'Z') {
            freq[c - 'A']++;
        }
    }

    // print frequency of each letter
    for (int i = 0; i < NUM_LETTERS; i++) {
        printf("\nLetter %c or %c appears %d times", 'a' + i, 'A' + i, freq[i]);
    }

    return 0;
}