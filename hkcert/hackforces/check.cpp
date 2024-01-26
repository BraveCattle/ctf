#include<bits/stdc++.h>
using namespace std;

int main(){
    int cnt = 0;
    while(1){
        cnt++;
        system("./gen > input.txt");
        system("./submission < input.txt > submission.txt");
        system("./test < input.txt > test.txt");
        if(system("diff submission.txt test.txt")){
            printf("Fail\n");
            break;
        }
        else printf("Passing on %d\n", cnt);
    }
    return 0;
}