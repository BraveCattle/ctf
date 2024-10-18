#include<stdio.h>

int var = 1234;

void main() {
    long arg1 = 0x1234;
    long* p = &arg1;
    char format[100];
    scanf("%s", format);
    printf(format);
    printf("\n");
    printf("%d\n", arg1);
    return 0;
}
