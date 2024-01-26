__int64_t ctoi(char c){
  return (unsigned int)(c - 48);
}

__int64_t check(char *key){
  int v2; // ebx
  int v3; // ebx
  int v4; // ebx
  int v5; // ebx
  int year; // [rsp+24h] [rbp-44h] BYREF
  int dummy; // [rsp+28h] [rbp-40h] BYREF
  unsigned char a[A+1]; // [rsp+47h] [rbp-21h] BYREF
  unsigned char b[B+1]; // [rsp+41h] [rbp-27h] BYREF
  unsigned char c[C+1]; // [rsp+3Dh] [rbp-2Bh] BYREF
  unsigned char d[D+1]; // [rsp+35h] [rbp-33h] BYREF
  unsigned char e[E+1]; // [rsp+2Fh] [rbp-39h] BYREF
  int sum; // [rsp+50h] [rbp-18h]
  int i; // [rsp+54h] [rbp-14h]

  memset(a, 0, sizeof(a));
  memset(b, 0, sizeof(b));
  // *(_DWORD *)c = 0;
  // *(_QWORD *)d = 0LL;
  memset(e, 0, sizeof(e));
  sscanf(key, "%8c{%5c-%3c-%7c-%5c}", a, b, c, d, e);
  if ( strlen((const char *)a) != A
    || strlen((const char *)b) != B
    || strlen((const char *)c) != C
    || strlen((const char *)d) != D
    || strlen((const char *)e) != E )
  {
    return 0xFFFFFFFFLL;
  }
  if ( strcmp((const char *)a, "internal") )
    return 0xFFFFFFFFLL;
  __isoc99_sscanf(b, "%3d%2d", &dummy, &year);
  if ( dummy != 277 )
    return 0xFFFFFFFFLL;
  if ( year != 23 )
    return 0xFFFFFFFFLL;
  if ( strcmp((const char *)c, "CTF") )
    return 0xFFFFFFFFLL;
  if ( ctoi(d[0]) || !ctoi(d[7]) || ctoi(d[7]) > 8 )
    return 0xFFFFFFFFLL;
  v2 = ctoi(d[1]);
  v3 = 16 * ctoi(d[2]) + v2;
  v4 = (ctoi(d[3]) << 8) + v3;
  v5 = (ctoi(d[4]) << 12) + v4;
  sum = v5 + (ctoi(d[5]) << 16);
  if ( sum != 229988 )
    return 0xFFFFFFFFLL;
  if ( ctoi(d[6]) != 3 )
    return 0xFFFFFFFFLL;
  if ( e[0] != 97 )
    return 0xFFFFFFFFLL;
  for ( i = 1; i <= 4; ++i )
  {
    if ( e[i] != e[0] )
      return 0xFFFFFFFFLL;
  }
  return 0LL;
}

int main(int argc, const char **argv, const char **envp)
{
  if ( argc > 1 )
  {
    if ( (unsigned int)check((char *)argv[1]) == -1 )
    {
      puts("Invalid flag :(");
      return -1;
    }
    else
    {
      puts("Correct!");
      return 0;
    }
  }
  else
  {
    puts("No internal flag given?");
    return -1;
  }
}
EOF