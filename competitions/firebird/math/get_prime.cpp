#include<bits/stdc++.h>
using namespace std;
const int N = 60000000;

int prime[N+5], cnt = 0;
bool is_prime[N+5];

void shai(){
	memset(is_prime, 1, sizeof(is_prime));
	is_prime[1] = is_prime[0] = false;
	for(int i = 2; i <= N; i++){
		if(is_prime[i]) prime[++cnt] = i;
		for(int j = 1; j <= cnt && prime[j]*i <= N; j++){
			is_prime[prime[j]*i] = false;
			if(i % prime[j] == 0) break;
		}
	}
}

int main(){
    shai();
    freopen("primes.txt", "w", stdout);
    for(int i = 1; i <= cnt; i++)
        printf("%d\n", prime[i]);
	return 0;
}