#include <string.h>
#include <stdio.h>

int main(){
    char s[] = "ping -c 4 123 || ls";
    printf("%d\n", '||');
    printf("%d\n", "||");
    printf("%c\n", *strchr(s, "||"));
}