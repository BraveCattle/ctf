from pwn import *

context.log_level='debug'
context.arch='amd64'

r = remote("ash-chal.firebird.sh", 36013)

r.interactive()
# gdb.attach(r)