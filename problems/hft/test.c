#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>

enum {
    PKT_OPT_PING,
    PKT_OPT_ECHO,
    PKT_OPT_TRADE,
} typedef pkt_opt_t;

enum {
    PKT_MSG_INFO,
    PKT_MSG_DATA,
} typedef pkt_msg_t;

struct {
    size_t sz;
    uint64_t data[];
} typedef pkt_t;

const struct {
    char *header;
    char *color;
} type_tbl[] = {
    [PKT_MSG_INFO] = {"PKT_INFO", "\x1b[1;34m"},
    [PKT_MSG_DATA] = {"PKT_DATA", "\x1b[1;33m"},
};

void putl(pkt_msg_t type, char *msg){
    printf("%s%s\x1b[m:[%s]\n", type_tbl[type].color, type_tbl[type].header, msg);
}

// gcc main.c -o hft -g
int main(){
    size_t sz = 0;
    fread(&sz, sizeof(size_t), 1, stdin);
    printf("%lu\n", sz);
    return 0;
}