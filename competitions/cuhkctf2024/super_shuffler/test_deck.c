#include <time.h>
#include <stdlib.h>
#include <stdio.h>

char deck[13] = "0123456789JQK";

void swap(char *a, char *b){ char t = *b; *b = *a; *a = t; }

int main(){
    srand(time(0));
    for(int i = 0; i < 13; i++){
        int rd = rand();
        swap(&deck[i], &deck[rd%(13-i)+i]);
    }
    for(int i = 0; i < 13; i++) printf("%c ", deck[i]);
    printf("\n");
    return 0;
}