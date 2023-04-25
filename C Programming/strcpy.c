#include <stdio.h>

char* strcpy(char* strDest, const char* strSrc) {
    int i = 0;
    while (strSrc[i] != '\0') {
        strDest[i] = strSrc[i];
        i++;
    }
    strDest[i] = '\0';
    return strDest;
}

int main() {
    char source[] = "Hello, World!";
    char destination[100];
    strcpy(destination, source);
    printf("%s", destination);
}