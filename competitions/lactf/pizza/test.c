#include <stdio.h>
int main() {
  char s[100];
  int a = 1, b = 0x22222222, c = -1, d = 0x33333333;
  int e = 0x44444444, f = 0x55555555, g = 0x66666666;
  scanf("%s", s);
  printf("%08x.%08x.%08x.%08x.%08x.%08x.%08x.%s\n", a, b, c, d, e, f, g, s);
  printf(s);
  return 0;
}