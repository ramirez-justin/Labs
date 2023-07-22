#include <stdio.h>
#include <string.h>

#define MAX_WORD_LEN 20
#define MAX_INPUT_LEN (MAX_WORD_LEN + 1) // +1 for the null terminator

int main() {
    char smallest_word[MAX_INPUT_LEN];
    char largest_word[MAX_INPUT_LEN];
    char input[MAX_INPUT_LEN];
    
    printf("Enter word: ");
    scanf("%s", input);
    strcpy(smallest_word, input);
    strcpy(largest_word, input);
    
    while (strlen(input) != 4) {
        printf("Enter word: ");
        scanf("%s", input);
        
        if (strcmp(input, smallest_word) < 0) {
            strcpy(smallest_word, input);
        }
        
        if (strcmp(input, largest_word) > 0) {
            strcpy(largest_word, input);
        }
    }
    
    printf("Smallest word: %s\n", smallest_word);
    printf("Largest word: %s\n", largest_word);
    
    return 0;
}