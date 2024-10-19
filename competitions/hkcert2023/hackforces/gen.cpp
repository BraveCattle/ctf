#include <bits/stdc++.h>
using namespace std;

int main(){
    // srand(time(0));
    std::mt19937 rng(std::random_device{}());
    int m = 100, n = 100;
    printf("%d %d\n", m, n);
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            int r = rng()%20;
            if(i == 0){
                printf(".");
            } else {
                // if(i+j <= 20) printf(".");
                // else{
                    if(r) printf(".");
                    else printf("x");
                // }
            }
        }
        printf("\n");
    }
    return 0;
}