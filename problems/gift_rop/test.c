#include <stdlib.h>

int main(){
    execve("/bin/sh", NULL, NULL);
    return 0;
}