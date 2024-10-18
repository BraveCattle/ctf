#include <stdio.h>
#include <stdlib.h>

char a[10] = {};
char b[10] = {};

int main(){
    for(int i = 0; i < 10; i++) a[i] = '\0';
    b[0] = 'c', b[1] = 'u', b[2] = 'h', b[3] = 'k';
    printf("empty string: [%s]\n", a);
    printf("%d\n", memcmp(a, b, 4));
    return 0;
}