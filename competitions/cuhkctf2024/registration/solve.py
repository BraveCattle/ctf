from pwn import *
import re

context.log_level = 'debug'

r = process("./04_chall")
# set break point after calling getrandom
pid, gdb_proc = gdb.attach(r, '''break *main+0x13b4-0x1388\nrun''', api=True)
sleep(1) # wait for gdb to execute

# extract $rax
gdb_output = gdb_proc.execute('print/x $rax', to_string=True)
rd = eval(re.match(re.compile(r"\$1 = (0x[0-9a-f]+)"), gdb_output).group(1))

# calculate payload
payload = [ ord('c')^(rd%2**7), ord('u')^(rd//2**8%2**7), ord('h')^(rd//2**16%2**7), ord('k')^(rd//2**24%2**7) ]
payload = b"".join(p.to_bytes(1, 'big') for p in payload)
print(f"payload: {payload}, in hex: {payload.hex()}")

r.close()

r = remote("chal.24.cuhkctf.org", 24004)
r.sendlineafter(b"Enter four characters: ", payload)
r.interactive()