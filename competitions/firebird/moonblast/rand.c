#include <time.h>
#include <stdio.h>

int main(){
    srand(time(0));
    printf("%d\n", rand());
    return 0;
}