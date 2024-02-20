
main_static:     file format elf64-x86-64


Disassembly of section .init:

0000000000001000 <.init>:
    1000:	f3 0f 1e fa          	endbr64 
    1004:	48 83 ec 08          	sub    $0x8,%rsp
    1008:	48 8b 05 d9 2f 00 00 	mov    0x2fd9(%rip),%rax        # 3fe8 <rand@plt+0x2cb8>
    100f:	48 85 c0             	test   %rax,%rax
    1012:	74 02                	je     1016 <__cxa_finalize@plt-0x19a>
    1014:	ff d0                	call   *%rax
    1016:	48 83 c4 08          	add    $0x8,%rsp
    101a:	c3                   	ret    

Disassembly of section .plt:

0000000000001020 <.plt>:
    1020:	ff 35 e2 2e 00 00    	push   0x2ee2(%rip)        # 3f08 <rand@plt+0x2bd8>
    1026:	f2 ff 25 e3 2e 00 00 	bnd jmp *0x2ee3(%rip)        # 3f10 <rand@plt+0x2be0>
    102d:	0f 1f 00             	nopl   (%rax)
    1030:	f3 0f 1e fa          	endbr64 
    1034:	68 00 00 00 00       	push   $0x0
    1039:	f2 e9 e1 ff ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    103f:	90                   	nop
    1040:	f3 0f 1e fa          	endbr64 
    1044:	68 01 00 00 00       	push   $0x1
    1049:	f2 e9 d1 ff ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    104f:	90                   	nop
    1050:	f3 0f 1e fa          	endbr64 
    1054:	68 02 00 00 00       	push   $0x2
    1059:	f2 e9 c1 ff ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    105f:	90                   	nop
    1060:	f3 0f 1e fa          	endbr64 
    1064:	68 03 00 00 00       	push   $0x3
    1069:	f2 e9 b1 ff ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    106f:	90                   	nop
    1070:	f3 0f 1e fa          	endbr64 
    1074:	68 04 00 00 00       	push   $0x4
    1079:	f2 e9 a1 ff ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    107f:	90                   	nop
    1080:	f3 0f 1e fa          	endbr64 
    1084:	68 05 00 00 00       	push   $0x5
    1089:	f2 e9 91 ff ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    108f:	90                   	nop
    1090:	f3 0f 1e fa          	endbr64 
    1094:	68 06 00 00 00       	push   $0x6
    1099:	f2 e9 81 ff ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    109f:	90                   	nop
    10a0:	f3 0f 1e fa          	endbr64 
    10a4:	68 07 00 00 00       	push   $0x7
    10a9:	f2 e9 71 ff ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    10af:	90                   	nop
    10b0:	f3 0f 1e fa          	endbr64 
    10b4:	68 08 00 00 00       	push   $0x8
    10b9:	f2 e9 61 ff ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    10bf:	90                   	nop
    10c0:	f3 0f 1e fa          	endbr64 
    10c4:	68 09 00 00 00       	push   $0x9
    10c9:	f2 e9 51 ff ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    10cf:	90                   	nop
    10d0:	f3 0f 1e fa          	endbr64 
    10d4:	68 0a 00 00 00       	push   $0xa
    10d9:	f2 e9 41 ff ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    10df:	90                   	nop
    10e0:	f3 0f 1e fa          	endbr64 
    10e4:	68 0b 00 00 00       	push   $0xb
    10e9:	f2 e9 31 ff ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    10ef:	90                   	nop
    10f0:	f3 0f 1e fa          	endbr64 
    10f4:	68 0c 00 00 00       	push   $0xc
    10f9:	f2 e9 21 ff ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    10ff:	90                   	nop
    1100:	f3 0f 1e fa          	endbr64 
    1104:	68 0d 00 00 00       	push   $0xd
    1109:	f2 e9 11 ff ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    110f:	90                   	nop
    1110:	f3 0f 1e fa          	endbr64 
    1114:	68 0e 00 00 00       	push   $0xe
    1119:	f2 e9 01 ff ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    111f:	90                   	nop
    1120:	f3 0f 1e fa          	endbr64 
    1124:	68 0f 00 00 00       	push   $0xf
    1129:	f2 e9 f1 fe ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    112f:	90                   	nop
    1130:	f3 0f 1e fa          	endbr64 
    1134:	68 10 00 00 00       	push   $0x10
    1139:	f2 e9 e1 fe ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    113f:	90                   	nop
    1140:	f3 0f 1e fa          	endbr64 
    1144:	68 11 00 00 00       	push   $0x11
    1149:	f2 e9 d1 fe ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    114f:	90                   	nop
    1150:	f3 0f 1e fa          	endbr64 
    1154:	68 12 00 00 00       	push   $0x12
    1159:	f2 e9 c1 fe ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    115f:	90                   	nop
    1160:	f3 0f 1e fa          	endbr64 
    1164:	68 13 00 00 00       	push   $0x13
    1169:	f2 e9 b1 fe ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    116f:	90                   	nop
    1170:	f3 0f 1e fa          	endbr64 
    1174:	68 14 00 00 00       	push   $0x14
    1179:	f2 e9 a1 fe ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    117f:	90                   	nop
    1180:	f3 0f 1e fa          	endbr64 
    1184:	68 15 00 00 00       	push   $0x15
    1189:	f2 e9 91 fe ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    118f:	90                   	nop
    1190:	f3 0f 1e fa          	endbr64 
    1194:	68 16 00 00 00       	push   $0x16
    1199:	f2 e9 81 fe ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    119f:	90                   	nop
    11a0:	f3 0f 1e fa          	endbr64 
    11a4:	68 17 00 00 00       	push   $0x17
    11a9:	f2 e9 71 fe ff ff    	bnd jmp 1020 <__cxa_finalize@plt-0x190>
    11af:	90                   	nop

Disassembly of section .plt.got:

00000000000011b0 <__cxa_finalize@plt>:
    11b0:	f3 0f 1e fa          	endbr64 
    11b4:	f2 ff 25 3d 2e 00 00 	bnd jmp *0x2e3d(%rip)        # 3ff8 <rand@plt+0x2cc8>
    11bb:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

Disassembly of section .plt.sec:

00000000000011c0 <strncpy@plt>:
    11c0:	f3 0f 1e fa          	endbr64 
    11c4:	f2 ff 25 4d 2d 00 00 	bnd jmp *0x2d4d(%rip)        # 3f18 <rand@plt+0x2be8>
    11cb:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

00000000000011d0 <strncmp@plt>:
    11d0:	f3 0f 1e fa          	endbr64 
    11d4:	f2 ff 25 45 2d 00 00 	bnd jmp *0x2d45(%rip)        # 3f20 <rand@plt+0x2bf0>
    11db:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

00000000000011e0 <strcpy@plt>:
    11e0:	f3 0f 1e fa          	endbr64 
    11e4:	f2 ff 25 3d 2d 00 00 	bnd jmp *0x2d3d(%rip)        # 3f28 <rand@plt+0x2bf8>
    11eb:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

00000000000011f0 <puts@plt>:
    11f0:	f3 0f 1e fa          	endbr64 
    11f4:	f2 ff 25 35 2d 00 00 	bnd jmp *0x2d35(%rip)        # 3f30 <rand@plt+0x2c00>
    11fb:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000001200 <strlen@plt>:
    1200:	f3 0f 1e fa          	endbr64 
    1204:	f2 ff 25 2d 2d 00 00 	bnd jmp *0x2d2d(%rip)        # 3f38 <rand@plt+0x2c08>
    120b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000001210 <__stack_chk_fail@plt>:
    1210:	f3 0f 1e fa          	endbr64 
    1214:	f2 ff 25 25 2d 00 00 	bnd jmp *0x2d25(%rip)        # 3f40 <rand@plt+0x2c10>
    121b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000001220 <strchr@plt>:
    1220:	f3 0f 1e fa          	endbr64 
    1224:	f2 ff 25 1d 2d 00 00 	bnd jmp *0x2d1d(%rip)        # 3f48 <rand@plt+0x2c18>
    122b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000001230 <printf@plt>:
    1230:	f3 0f 1e fa          	endbr64 
    1234:	f2 ff 25 15 2d 00 00 	bnd jmp *0x2d15(%rip)        # 3f50 <rand@plt+0x2c20>
    123b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000001240 <pclose@plt>:
    1240:	f3 0f 1e fa          	endbr64 
    1244:	f2 ff 25 0d 2d 00 00 	bnd jmp *0x2d0d(%rip)        # 3f58 <rand@plt+0x2c28>
    124b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000001250 <snprintf@plt>:
    1250:	f3 0f 1e fa          	endbr64 
    1254:	f2 ff 25 05 2d 00 00 	bnd jmp *0x2d05(%rip)        # 3f60 <rand@plt+0x2c30>
    125b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000001260 <memset@plt>:
    1260:	f3 0f 1e fa          	endbr64 
    1264:	f2 ff 25 fd 2c 00 00 	bnd jmp *0x2cfd(%rip)        # 3f68 <rand@plt+0x2c38>
    126b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000001270 <srand@plt>:
    1270:	f3 0f 1e fa          	endbr64 
    1274:	f2 ff 25 f5 2c 00 00 	bnd jmp *0x2cf5(%rip)        # 3f70 <rand@plt+0x2c40>
    127b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000001280 <fgets@plt>:
    1280:	f3 0f 1e fa          	endbr64 
    1284:	f2 ff 25 ed 2c 00 00 	bnd jmp *0x2ced(%rip)        # 3f78 <rand@plt+0x2c48>
    128b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000001290 <strcmp@plt>:
    1290:	f3 0f 1e fa          	endbr64 
    1294:	f2 ff 25 e5 2c 00 00 	bnd jmp *0x2ce5(%rip)        # 3f80 <rand@plt+0x2c50>
    129b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

00000000000012a0 <time@plt>:
    12a0:	f3 0f 1e fa          	endbr64 
    12a4:	f2 ff 25 dd 2c 00 00 	bnd jmp *0x2cdd(%rip)        # 3f88 <rand@plt+0x2c58>
    12ab:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

00000000000012b0 <__isoc99_sscanf@plt>:
    12b0:	f3 0f 1e fa          	endbr64 
    12b4:	f2 ff 25 d5 2c 00 00 	bnd jmp *0x2cd5(%rip)        # 3f90 <rand@plt+0x2c60>
    12bb:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

00000000000012c0 <setvbuf@plt>:
    12c0:	f3 0f 1e fa          	endbr64 
    12c4:	f2 ff 25 cd 2c 00 00 	bnd jmp *0x2ccd(%rip)        # 3f98 <rand@plt+0x2c68>
    12cb:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

00000000000012d0 <popen@plt>:
    12d0:	f3 0f 1e fa          	endbr64 
    12d4:	f2 ff 25 c5 2c 00 00 	bnd jmp *0x2cc5(%rip)        # 3fa0 <rand@plt+0x2c70>
    12db:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

00000000000012e0 <perror@plt>:
    12e0:	f3 0f 1e fa          	endbr64 
    12e4:	f2 ff 25 bd 2c 00 00 	bnd jmp *0x2cbd(%rip)        # 3fa8 <rand@plt+0x2c78>
    12eb:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

00000000000012f0 <strcat@plt>:
    12f0:	f3 0f 1e fa          	endbr64 
    12f4:	f2 ff 25 b5 2c 00 00 	bnd jmp *0x2cb5(%rip)        # 3fb0 <rand@plt+0x2c80>
    12fb:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000001300 <sprintf@plt>:
    1300:	f3 0f 1e fa          	endbr64 
    1304:	f2 ff 25 ad 2c 00 00 	bnd jmp *0x2cad(%rip)        # 3fb8 <rand@plt+0x2c88>
    130b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000001310 <exit@plt>:
    1310:	f3 0f 1e fa          	endbr64 
    1314:	f2 ff 25 a5 2c 00 00 	bnd jmp *0x2ca5(%rip)        # 3fc0 <rand@plt+0x2c90>
    131b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000001320 <strstr@plt>:
    1320:	f3 0f 1e fa          	endbr64 
    1324:	f2 ff 25 9d 2c 00 00 	bnd jmp *0x2c9d(%rip)        # 3fc8 <rand@plt+0x2c98>
    132b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

0000000000001330 <rand@plt>:
    1330:	f3 0f 1e fa          	endbr64 
    1334:	f2 ff 25 95 2c 00 00 	bnd jmp *0x2c95(%rip)        # 3fd0 <rand@plt+0x2ca0>
    133b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)

Disassembly of section .text:

0000000000001340 <.text>:
    1340:	f3 0f 1e fa          	endbr64 
    1344:	31 ed                	xor    %ebp,%ebp
    1346:	49 89 d1             	mov    %rdx,%r9
    1349:	5e                   	pop    %rsi
    134a:	48 89 e2             	mov    %rsp,%rdx
    134d:	48 83 e4 f0          	and    $0xfffffffffffffff0,%rsp
    1351:	50                   	push   %rax
    1352:	54                   	push   %rsp
    1353:	4c 8d 05 66 0b 00 00 	lea    0xb66(%rip),%r8        # 1ec0 <rand@plt+0xb90>
    135a:	48 8d 0d ef 0a 00 00 	lea    0xaef(%rip),%rcx        # 1e50 <rand@plt+0xb20>
    1361:	48 8d 3d 08 01 00 00 	lea    0x108(%rip),%rdi        # 1470 <rand@plt+0x140>
    1368:	ff 15 72 2c 00 00    	call   *0x2c72(%rip)        # 3fe0 <rand@plt+0x2cb0>
    136e:	f4                   	hlt    
    136f:	90                   	nop
    1370:	48 8d 3d f9 2c 00 00 	lea    0x2cf9(%rip),%rdi        # 4070 <stdout@GLIBC_2.2.5>
    1377:	48 8d 05 f2 2c 00 00 	lea    0x2cf2(%rip),%rax        # 4070 <stdout@GLIBC_2.2.5>
    137e:	48 39 f8             	cmp    %rdi,%rax
    1381:	74 15                	je     1398 <rand@plt+0x68>
    1383:	48 8b 05 4e 2c 00 00 	mov    0x2c4e(%rip),%rax        # 3fd8 <rand@plt+0x2ca8>
    138a:	48 85 c0             	test   %rax,%rax
    138d:	74 09                	je     1398 <rand@plt+0x68>
    138f:	ff e0                	jmp    *%rax
    1391:	0f 1f 80 00 00 00 00 	nopl   0x0(%rax)
    1398:	c3                   	ret    
    1399:	0f 1f 80 00 00 00 00 	nopl   0x0(%rax)
    13a0:	48 8d 3d c9 2c 00 00 	lea    0x2cc9(%rip),%rdi        # 4070 <stdout@GLIBC_2.2.5>
    13a7:	48 8d 35 c2 2c 00 00 	lea    0x2cc2(%rip),%rsi        # 4070 <stdout@GLIBC_2.2.5>
    13ae:	48 29 fe             	sub    %rdi,%rsi
    13b1:	48 89 f0             	mov    %rsi,%rax
    13b4:	48 c1 ee 3f          	shr    $0x3f,%rsi
    13b8:	48 c1 f8 03          	sar    $0x3,%rax
    13bc:	48 01 c6             	add    %rax,%rsi
    13bf:	48 d1 fe             	sar    %rsi
    13c2:	74 14                	je     13d8 <rand@plt+0xa8>
    13c4:	48 8b 05 25 2c 00 00 	mov    0x2c25(%rip),%rax        # 3ff0 <rand@plt+0x2cc0>
    13cb:	48 85 c0             	test   %rax,%rax
    13ce:	74 08                	je     13d8 <rand@plt+0xa8>
    13d0:	ff e0                	jmp    *%rax
    13d2:	66 0f 1f 44 00 00    	nopw   0x0(%rax,%rax,1)
    13d8:	c3                   	ret    
    13d9:	0f 1f 80 00 00 00 00 	nopl   0x0(%rax)
    13e0:	f3 0f 1e fa          	endbr64 
    13e4:	80 3d 9d 2c 00 00 00 	cmpb   $0x0,0x2c9d(%rip)        # 4088 <stdin@GLIBC_2.2.5+0x8>
    13eb:	75 2b                	jne    1418 <rand@plt+0xe8>
    13ed:	55                   	push   %rbp
    13ee:	48 83 3d 02 2c 00 00 	cmpq   $0x0,0x2c02(%rip)        # 3ff8 <rand@plt+0x2cc8>
    13f5:	00 
    13f6:	48 89 e5             	mov    %rsp,%rbp
    13f9:	74 0c                	je     1407 <rand@plt+0xd7>
    13fb:	48 8b 3d 06 2c 00 00 	mov    0x2c06(%rip),%rdi        # 4008 <rand@plt+0x2cd8>
    1402:	e8 a9 fd ff ff       	call   11b0 <__cxa_finalize@plt>
    1407:	e8 64 ff ff ff       	call   1370 <rand@plt+0x40>
    140c:	c6 05 75 2c 00 00 01 	movb   $0x1,0x2c75(%rip)        # 4088 <stdin@GLIBC_2.2.5+0x8>
    1413:	5d                   	pop    %rbp
    1414:	c3                   	ret    
    1415:	0f 1f 00             	nopl   (%rax)
    1418:	c3                   	ret    
    1419:	0f 1f 80 00 00 00 00 	nopl   0x0(%rax)
    1420:	f3 0f 1e fa          	endbr64 
    1424:	e9 77 ff ff ff       	jmp    13a0 <rand@plt+0x70>
    1429:	f3 0f 1e fa          	endbr64 
    142d:	55                   	push   %rbp
    142e:	48 89 e5             	mov    %rsp,%rbp
    1431:	48 8b 05 48 2c 00 00 	mov    0x2c48(%rip),%rax        # 4080 <stdin@GLIBC_2.2.5>
    1438:	b9 00 00 00 00       	mov    $0x0,%ecx
    143d:	ba 02 00 00 00       	mov    $0x2,%edx
    1442:	be 00 00 00 00       	mov    $0x0,%esi
    1447:	48 89 c7             	mov    %rax,%rdi
    144a:	e8 71 fe ff ff       	call   12c0 <setvbuf@plt>
    144f:	48 8b 05 1a 2c 00 00 	mov    0x2c1a(%rip),%rax        # 4070 <stdout@GLIBC_2.2.5>
    1456:	b9 00 00 00 00       	mov    $0x0,%ecx
    145b:	ba 02 00 00 00       	mov    $0x2,%edx
    1460:	be 00 00 00 00       	mov    $0x0,%esi
    1465:	48 89 c7             	mov    %rax,%rdi
    1468:	e8 53 fe ff ff       	call   12c0 <setvbuf@plt>
    146d:	90                   	nop
    146e:	5d                   	pop    %rbp
    146f:	c3                   	ret    
    1470:	f3 0f 1e fa          	endbr64 
    1474:	55                   	push   %rbp
    1475:	48 89 e5             	mov    %rsp,%rbp
    1478:	48 81 ec 20 05 00 00 	sub    $0x520,%rsp
    147f:	64 48 8b 04 25 28 00 	mov    %fs:0x28,%rax
    1486:	00 00 
    1488:	48 89 45 f8          	mov    %rax,-0x8(%rbp)
    148c:	31 c0                	xor    %eax,%eax
    148e:	48 8d 05 73 0b 00 00 	lea    0xb73(%rip),%rax        # 2008 <rand@plt+0xcd8>
    1495:	48 89 85 e8 fa ff ff 	mov    %rax,-0x518(%rbp)
    149c:	48 8b 85 e8 fa ff ff 	mov    -0x518(%rbp),%rax
    14a3:	48 89 c6             	mov    %rax,%rsi
    14a6:	48 8d 3d a1 0b 00 00 	lea    0xba1(%rip),%rdi        # 204e <rand@plt+0xd1e>
    14ad:	b8 00 00 00 00       	mov    $0x0,%eax
    14b2:	e8 79 fd ff ff       	call   1230 <printf@plt>
    14b7:	48 8d 85 f0 fa ff ff 	lea    -0x510(%rbp),%rax
    14be:	ba 00 01 00 00       	mov    $0x100,%edx
    14c3:	be 00 00 00 00       	mov    $0x0,%esi
    14c8:	48 89 c7             	mov    %rax,%rdi
    14cb:	e8 90 fd ff ff       	call   1260 <memset@plt>
    14d0:	48 8b 15 a9 2b 00 00 	mov    0x2ba9(%rip),%rdx        # 4080 <stdin@GLIBC_2.2.5>
    14d7:	48 8d 85 f0 fa ff ff 	lea    -0x510(%rbp),%rax
    14de:	be 00 01 00 00       	mov    $0x100,%esi
    14e3:	48 89 c7             	mov    %rax,%rdi
    14e6:	e8 95 fd ff ff       	call   1280 <fgets@plt>
    14eb:	48 85 c0             	test   %rax,%rax
    14ee:	74 52                	je     1542 <rand@plt+0x212>
    14f0:	48 8d 85 f0 fb ff ff 	lea    -0x410(%rbp),%rax
    14f7:	ba 00 04 00 00       	mov    $0x400,%edx
    14fc:	be 00 00 00 00       	mov    $0x0,%esi
    1501:	48 89 c7             	mov    %rax,%rdi
    1504:	e8 57 fd ff ff       	call   1260 <memset@plt>
    1509:	48 8d 95 f0 fb ff ff 	lea    -0x410(%rbp),%rdx
    1510:	48 8d 85 f0 fa ff ff 	lea    -0x510(%rbp),%rax
    1517:	48 89 d6             	mov    %rdx,%rsi
    151a:	48 89 c7             	mov    %rax,%rdi
    151d:	e8 67 00 00 00       	call   1589 <rand@plt+0x259>
    1522:	48 8d 85 f0 fb ff ff 	lea    -0x410(%rbp),%rax
    1529:	48 89 c6             	mov    %rax,%rsi
    152c:	48 8d 3d 1b 0b 00 00 	lea    0xb1b(%rip),%rdi        # 204e <rand@plt+0xd1e>
    1533:	b8 00 00 00 00       	mov    $0x0,%eax
    1538:	e8 f3 fc ff ff       	call   1230 <printf@plt>
    153d:	e9 75 ff ff ff       	jmp    14b7 <rand@plt+0x187>
    1542:	48 8d 3d 08 0b 00 00 	lea    0xb08(%rip),%rdi        # 2051 <rand@plt+0xd21>
    1549:	e8 a2 fc ff ff       	call   11f0 <puts@plt>
    154e:	e9 64 ff ff ff       	jmp    14b7 <rand@plt+0x187>
    1553:	f3 0f 1e fa          	endbr64 
    1557:	55                   	push   %rbp
    1558:	48 89 e5             	mov    %rsp,%rbp
    155b:	48 83 ec 20          	sub    $0x20,%rsp
    155f:	48 89 7d e8          	mov    %rdi,-0x18(%rbp)
    1563:	48 8b 45 e8          	mov    -0x18(%rbp),%rax
    1567:	be 0a 00 00 00       	mov    $0xa,%esi
    156c:	48 89 c7             	mov    %rax,%rdi
    156f:	e8 ac fc ff ff       	call   1220 <strchr@plt>
    1574:	48 89 45 f8          	mov    %rax,-0x8(%rbp)
    1578:	48 83 7d f8 00       	cmpq   $0x0,-0x8(%rbp)
    157d:	74 07                	je     1586 <rand@plt+0x256>
    157f:	48 8b 45 f8          	mov    -0x8(%rbp),%rax
    1583:	c6 00 00             	movb   $0x0,(%rax)
    1586:	90                   	nop
    1587:	c9                   	leave  
    1588:	c3                   	ret    
    1589:	f3 0f 1e fa          	endbr64 
    158d:	55                   	push   %rbp
    158e:	48 89 e5             	mov    %rsp,%rbp
    1591:	48 81 ec a0 02 00 00 	sub    $0x2a0,%rsp
    1598:	48 89 bd 68 fd ff ff 	mov    %rdi,-0x298(%rbp)
    159f:	48 89 b5 60 fd ff ff 	mov    %rsi,-0x2a0(%rbp)
    15a6:	64 48 8b 04 25 28 00 	mov    %fs:0x28,%rax
    15ad:	00 00 
    15af:	48 89 45 f8          	mov    %rax,-0x8(%rbp)
    15b3:	31 c0                	xor    %eax,%eax
    15b5:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    15bc:	48 89 c7             	mov    %rax,%rdi
    15bf:	e8 8f ff ff ff       	call   1553 <rand@plt+0x223>
    15c4:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    15cb:	48 8d 35 d4 0a 00 00 	lea    0xad4(%rip),%rsi        # 20a6 <rand@plt+0xd76>
    15d2:	48 89 c7             	mov    %rax,%rdi
    15d5:	e8 b6 fc ff ff       	call   1290 <strcmp@plt>
    15da:	85 c0                	test   %eax,%eax
    15dc:	0f 85 a9 00 00 00    	jne    168b <rand@plt+0x35b>
    15e2:	48 8b 85 60 fd ff ff 	mov    -0x2a0(%rbp),%rax
    15e9:	48 be 53 75 70 70 6f 	movabs $0x6574726f70707553,%rsi
    15f0:	72 74 65 
    15f3:	48 bf 64 20 63 6f 6d 	movabs $0x6e616d6d6f632064,%rdi
    15fa:	6d 61 6e 
    15fd:	48 89 30             	mov    %rsi,(%rax)
    1600:	48 89 78 08          	mov    %rdi,0x8(%rax)
    1604:	48 be 64 73 3a 20 70 	movabs $0x676e6970203a7364,%rsi
    160b:	69 6e 67 
    160e:	48 bf 2c 20 75 6e 61 	movabs $0x2c656d616e75202c,%rdi
    1615:	6d 65 2c 
    1618:	48 89 70 10          	mov    %rsi,0x10(%rax)
    161c:	48 89 78 18          	mov    %rdi,0x18(%rax)
    1620:	48 be 20 70 77 64 2c 	movabs $0x6164202c64777020,%rsi
    1627:	20 64 61 
    162a:	48 bf 74 65 2c 20 77 	movabs $0x616f6877202c6574,%rdi
    1631:	68 6f 61 
    1634:	48 89 70 20          	mov    %rsi,0x20(%rax)
    1638:	48 89 78 28          	mov    %rdi,0x28(%rax)
    163c:	48 be 6d 69 2c 20 70 	movabs $0x65776f70202c696d,%rsi
    1643:	6f 77 65 
    1646:	48 bf 72 6f 66 66 2c 	movabs $0x6469202c66666f72,%rdi
    164d:	20 69 64 
    1650:	48 89 70 30          	mov    %rsi,0x30(%rax)
    1654:	48 89 78 38          	mov    %rdi,0x38(%rax)
    1658:	48 be 2c 20 73 68 6f 	movabs $0x654b776f6873202c,%rsi
    165f:	77 4b 65 
    1662:	48 bf 79 2c 20 6f 70 	movabs $0x746e65706f202c79,%rdi
    1669:	65 6e 74 
    166c:	48 89 70 40          	mov    %rsi,0x40(%rax)
    1670:	48 89 78 48          	mov    %rdi,0x48(%rax)
    1674:	48 b9 68 65 64 6f 6f 	movabs $0xa20726f6f646568,%rcx
    167b:	72 20 0a 
    167e:	48 89 48 50          	mov    %rcx,0x50(%rax)
    1682:	c6 40 58 00          	movb   $0x0,0x58(%rax)
    1686:	e9 aa 07 00 00       	jmp    1e35 <rand@plt+0xb05>
    168b:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    1692:	48 8d 35 f9 09 00 00 	lea    0x9f9(%rip),%rsi        # 2092 <rand@plt+0xd62>
    1699:	48 89 c7             	mov    %rax,%rdi
    169c:	e8 ef fb ff ff       	call   1290 <strcmp@plt>
    16a1:	85 c0                	test   %eax,%eax
    16a3:	75 6b                	jne    1710 <rand@plt+0x3e0>
    16a5:	bf 00 00 00 00       	mov    $0x0,%edi
    16aa:	e8 f1 fb ff ff       	call   12a0 <time@plt>
    16af:	89 c7                	mov    %eax,%edi
    16b1:	e8 ba fb ff ff       	call   1270 <srand@plt>
    16b6:	e8 75 fc ff ff       	call   1330 <rand@plt>
    16bb:	89 85 7c fd ff ff    	mov    %eax,-0x284(%rbp)
    16c1:	8b 95 7c fd ff ff    	mov    -0x284(%rbp),%edx
    16c7:	48 8d 85 f0 fe ff ff 	lea    -0x110(%rbp),%rax
    16ce:	4c 8d 05 d6 09 00 00 	lea    0x9d6(%rip),%r8        # 20ab <rand@plt+0xd7b>
    16d5:	89 d1                	mov    %edx,%ecx
    16d7:	48 8d 15 cf 09 00 00 	lea    0x9cf(%rip),%rdx        # 20ad <rand@plt+0xd7d>
    16de:	48 8d 35 ce 09 00 00 	lea    0x9ce(%rip),%rsi        # 20b3 <rand@plt+0xd83>
    16e5:	48 89 c7             	mov    %rax,%rdi
    16e8:	b8 00 00 00 00       	mov    $0x0,%eax
    16ed:	e8 0e fc ff ff       	call   1300 <sprintf@plt>
    16f2:	48 8d 95 f0 fe ff ff 	lea    -0x110(%rbp),%rdx
    16f9:	48 8b 85 60 fd ff ff 	mov    -0x2a0(%rbp),%rax
    1700:	48 89 d6             	mov    %rdx,%rsi
    1703:	48 89 c7             	mov    %rax,%rdi
    1706:	e8 d5 fa ff ff       	call   11e0 <strcpy@plt>
    170b:	e9 25 07 00 00       	jmp    1e35 <rand@plt+0xb05>
    1710:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    1717:	be 26 00 00 00       	mov    $0x26,%esi
    171c:	48 89 c7             	mov    %rax,%rdi
    171f:	e8 fc fa ff ff       	call   1220 <strchr@plt>
    1724:	48 85 c0             	test   %rax,%rax
    1727:	75 38                	jne    1761 <rand@plt+0x431>
    1729:	48 8d 05 8c 09 00 00 	lea    0x98c(%rip),%rax        # 20bc <rand@plt+0xd8c>
    1730:	89 c2                	mov    %eax,%edx
    1732:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    1739:	89 d6                	mov    %edx,%esi
    173b:	48 89 c7             	mov    %rax,%rdi
    173e:	e8 dd fa ff ff       	call   1220 <strchr@plt>
    1743:	48 85 c0             	test   %rax,%rax
    1746:	75 19                	jne    1761 <rand@plt+0x431>
    1748:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    174f:	be 3b 00 00 00       	mov    $0x3b,%esi
    1754:	48 89 c7             	mov    %rax,%rdi
    1757:	e8 c4 fa ff ff       	call   1220 <strchr@plt>
    175c:	48 85 c0             	test   %rax,%rax
    175f:	74 2b                	je     178c <rand@plt+0x45c>
    1761:	48 8b 85 60 fd ff ff 	mov    -0x2a0(%rbp),%rax
    1768:	48 be 4e 6f 74 20 53 	movabs $0x7070755320746f4e,%rsi
    176f:	75 70 70 
    1772:	48 bf 6f 72 74 20 31 	movabs $0xa202e312074726f,%rdi
    1779:	2e 20 0a 
    177c:	48 89 30             	mov    %rsi,(%rax)
    177f:	48 89 78 08          	mov    %rdi,0x8(%rax)
    1783:	c6 40 10 00          	movb   $0x0,0x10(%rax)
    1787:	e9 a9 06 00 00       	jmp    1e35 <rand@plt+0xb05>
    178c:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    1793:	be 3e 00 00 00       	mov    $0x3e,%esi
    1798:	48 89 c7             	mov    %rax,%rdi
    179b:	e8 80 fa ff ff       	call   1220 <strchr@plt>
    17a0:	48 85 c0             	test   %rax,%rax
    17a3:	75 32                	jne    17d7 <rand@plt+0x4a7>
    17a5:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    17ac:	be 3c 00 00 00       	mov    $0x3c,%esi
    17b1:	48 89 c7             	mov    %rax,%rdi
    17b4:	e8 67 fa ff ff       	call   1220 <strchr@plt>
    17b9:	48 85 c0             	test   %rax,%rax
    17bc:	75 19                	jne    17d7 <rand@plt+0x4a7>
    17be:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    17c5:	be 7c 00 00 00       	mov    $0x7c,%esi
    17ca:	48 89 c7             	mov    %rax,%rdi
    17cd:	e8 4e fa ff ff       	call   1220 <strchr@plt>
    17d2:	48 85 c0             	test   %rax,%rax
    17d5:	74 2b                	je     1802 <rand@plt+0x4d2>
    17d7:	48 8b 85 60 fd ff ff 	mov    -0x2a0(%rbp),%rax
    17de:	48 be 4e 6f 74 20 53 	movabs $0x7070755320746f4e,%rsi
    17e5:	75 70 70 
    17e8:	48 bf 6f 72 74 20 32 	movabs $0xa202e322074726f,%rdi
    17ef:	2e 20 0a 
    17f2:	48 89 30             	mov    %rsi,(%rax)
    17f5:	48 89 78 08          	mov    %rdi,0x8(%rax)
    17f9:	c6 40 10 00          	movb   $0x0,0x10(%rax)
    17fd:	e9 33 06 00 00       	jmp    1e35 <rand@plt+0xb05>
    1802:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    1809:	be 24 00 00 00       	mov    $0x24,%esi
    180e:	48 89 c7             	mov    %rax,%rdi
    1811:	e8 0a fa ff ff       	call   1220 <strchr@plt>
    1816:	48 85 c0             	test   %rax,%rax
    1819:	75 19                	jne    1834 <rand@plt+0x504>
    181b:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    1822:	be 60 00 00 00       	mov    $0x60,%esi
    1827:	48 89 c7             	mov    %rax,%rdi
    182a:	e8 f1 f9 ff ff       	call   1220 <strchr@plt>
    182f:	48 85 c0             	test   %rax,%rax
    1832:	74 2b                	je     185f <rand@plt+0x52f>
    1834:	48 8b 85 60 fd ff ff 	mov    -0x2a0(%rbp),%rax
    183b:	48 ba 4e 6f 74 20 53 	movabs $0x7070755320746f4e,%rdx
    1842:	75 70 70 
    1845:	48 b9 6f 72 74 20 33 	movabs $0xa202e332074726f,%rcx
    184c:	2e 20 0a 
    184f:	48 89 10             	mov    %rdx,(%rax)
    1852:	48 89 48 08          	mov    %rcx,0x8(%rax)
    1856:	c6 40 10 00          	movb   $0x0,0x10(%rax)
    185a:	e9 d6 05 00 00       	jmp    1e35 <rand@plt+0xb05>
    185f:	48 8d 85 f0 fd ff ff 	lea    -0x210(%rbp),%rax
    1866:	ba 00 01 00 00       	mov    $0x100,%edx
    186b:	be 00 00 00 00       	mov    $0x0,%esi
    1870:	48 89 c7             	mov    %rax,%rdi
    1873:	e8 e8 f9 ff ff       	call   1260 <memset@plt>
    1878:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    187f:	be 20 00 00 00       	mov    $0x20,%esi
    1884:	48 89 c7             	mov    %rax,%rdi
    1887:	e8 94 f9 ff ff       	call   1220 <strchr@plt>
    188c:	48 89 85 88 fd ff ff 	mov    %rax,-0x278(%rbp)
    1893:	48 83 bd 88 fd ff ff 	cmpq   $0x0,-0x278(%rbp)
    189a:	00 
    189b:	74 2c                	je     18c9 <rand@plt+0x599>
    189d:	48 8b 85 88 fd ff ff 	mov    -0x278(%rbp),%rax
    18a4:	48 2b 85 68 fd ff ff 	sub    -0x298(%rbp),%rax
    18ab:	48 89 c2             	mov    %rax,%rdx
    18ae:	48 8b 8d 68 fd ff ff 	mov    -0x298(%rbp),%rcx
    18b5:	48 8d 85 f0 fd ff ff 	lea    -0x210(%rbp),%rax
    18bc:	48 89 ce             	mov    %rcx,%rsi
    18bf:	48 89 c7             	mov    %rax,%rdi
    18c2:	e8 f9 f8 ff ff       	call   11c0 <strncpy@plt>
    18c7:	eb 36                	jmp    18ff <rand@plt+0x5cf>
    18c9:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    18d0:	48 89 c7             	mov    %rax,%rdi
    18d3:	e8 28 f9 ff ff       	call   1200 <strlen@plt>
    18d8:	48 89 85 90 fd ff ff 	mov    %rax,-0x270(%rbp)
    18df:	48 8b 95 90 fd ff ff 	mov    -0x270(%rbp),%rdx
    18e6:	48 8b 8d 68 fd ff ff 	mov    -0x298(%rbp),%rcx
    18ed:	48 8d 85 f0 fd ff ff 	lea    -0x210(%rbp),%rax
    18f4:	48 89 ce             	mov    %rcx,%rsi
    18f7:	48 89 c7             	mov    %rax,%rdi
    18fa:	e8 c1 f8 ff ff       	call   11c0 <strncpy@plt>
    18ff:	48 8d 85 f0 fd ff ff 	lea    -0x210(%rbp),%rax
    1906:	48 89 c7             	mov    %rax,%rdi
    1909:	e8 f2 f8 ff ff       	call   1200 <strlen@plt>
    190e:	48 89 85 98 fd ff ff 	mov    %rax,-0x268(%rbp)
    1915:	48 83 bd 98 fd ff ff 	cmpq   $0x0,-0x268(%rbp)
    191c:	00 
    191d:	75 35                	jne    1954 <rand@plt+0x624>
    191f:	48 8b 85 60 fd ff ff 	mov    -0x2a0(%rbp),%rax
    1926:	48 be 50 6c 65 61 73 	movabs $0x6520657361656c50,%rsi
    192d:	65 20 65 
    1930:	48 bf 6e 74 65 72 20 	movabs $0x6d6f63207265746e,%rdi
    1937:	63 6f 6d 
    193a:	48 89 30             	mov    %rsi,(%rax)
    193d:	48 89 78 08          	mov    %rdi,0x8(%rax)
    1941:	48 b9 6d 61 6e 64 2e 	movabs $0xa202e646e616d,%rcx
    1948:	20 0a 00 
    194b:	48 89 48 10          	mov    %rcx,0x10(%rax)
    194f:	e9 e1 04 00 00       	jmp    1e35 <rand@plt+0xb05>
    1954:	c7 85 74 fd ff ff 00 	movl   $0x0,-0x28c(%rbp)
    195b:	00 00 00 
    195e:	8b 85 74 fd ff ff    	mov    -0x28c(%rbp),%eax
    1964:	48 98                	cltq   
    1966:	48 8d 14 c5 00 00 00 	lea    0x0(,%rax,8),%rdx
    196d:	00 
    196e:	48 8d 05 ab 26 00 00 	lea    0x26ab(%rip),%rax        # 4020 <rand@plt+0x2cf0>
    1975:	48 8b 04 02          	mov    (%rdx,%rax,1),%rax
    1979:	48 89 85 80 fd ff ff 	mov    %rax,-0x280(%rbp)
    1980:	eb 74                	jmp    19f6 <rand@plt+0x6c6>
    1982:	83 85 74 fd ff ff 01 	addl   $0x1,-0x28c(%rbp)
    1989:	8b 85 74 fd ff ff    	mov    -0x28c(%rbp),%eax
    198f:	48 98                	cltq   
    1991:	48 8d 14 c5 00 00 00 	lea    0x0(,%rax,8),%rdx
    1998:	00 
    1999:	48 8d 05 80 26 00 00 	lea    0x2680(%rip),%rax        # 4020 <rand@plt+0x2cf0>
    19a0:	48 8b 04 02          	mov    (%rdx,%rax,1),%rax
    19a4:	48 89 85 80 fd ff ff 	mov    %rax,-0x280(%rbp)
    19ab:	8b 85 74 fd ff ff    	mov    -0x28c(%rbp),%eax
    19b1:	48 98                	cltq   
    19b3:	48 8d 14 c5 00 00 00 	lea    0x0(,%rax,8),%rdx
    19ba:	00 
    19bb:	48 8d 05 5e 26 00 00 	lea    0x265e(%rip),%rax        # 4020 <rand@plt+0x2cf0>
    19c2:	48 8b 04 02          	mov    (%rdx,%rax,1),%rax
    19c6:	48 85 c0             	test   %rax,%rax
    19c9:	75 2b                	jne    19f6 <rand@plt+0x6c6>
    19cb:	48 8b 85 60 fd ff ff 	mov    -0x2a0(%rbp),%rax
    19d2:	48 ba 4e 6f 74 20 53 	movabs $0x7070755320746f4e,%rdx
    19d9:	75 70 70 
    19dc:	48 b9 6f 72 74 20 34 	movabs $0xa202e342074726f,%rcx
    19e3:	2e 20 0a 
    19e6:	48 89 10             	mov    %rdx,(%rax)
    19e9:	48 89 48 08          	mov    %rcx,0x8(%rax)
    19ed:	c6 40 10 00          	movb   $0x0,0x10(%rax)
    19f1:	e9 3f 04 00 00       	jmp    1e35 <rand@plt+0xb05>
    19f6:	48 8b 95 98 fd ff ff 	mov    -0x268(%rbp),%rdx
    19fd:	48 8d 8d f0 fd ff ff 	lea    -0x210(%rbp),%rcx
    1a04:	48 8b 85 80 fd ff ff 	mov    -0x280(%rbp),%rax
    1a0b:	48 89 ce             	mov    %rcx,%rsi
    1a0e:	48 89 c7             	mov    %rax,%rdi
    1a11:	e8 ba f7 ff ff       	call   11d0 <strncmp@plt>
    1a16:	85 c0                	test   %eax,%eax
    1a18:	0f 85 64 ff ff ff    	jne    1982 <rand@plt+0x652>
    1a1e:	48 8b 95 98 fd ff ff 	mov    -0x268(%rbp),%rdx
    1a25:	48 8d 85 f0 fd ff ff 	lea    -0x210(%rbp),%rax
    1a2c:	48 89 c6             	mov    %rax,%rsi
    1a2f:	48 8d 3d 35 06 00 00 	lea    0x635(%rip),%rdi        # 206b <rand@plt+0xd3b>
    1a36:	e8 95 f7 ff ff       	call   11d0 <strncmp@plt>
    1a3b:	85 c0                	test   %eax,%eax
    1a3d:	0f 85 23 01 00 00    	jne    1b66 <rand@plt+0x836>
    1a43:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    1a4a:	48 8d 35 6e 06 00 00 	lea    0x66e(%rip),%rsi        # 20bf <rand@plt+0xd8f>
    1a51:	48 89 c7             	mov    %rax,%rdi
    1a54:	e8 c7 f8 ff ff       	call   1320 <strstr@plt>
    1a59:	48 89 85 a0 fd ff ff 	mov    %rax,-0x260(%rbp)
    1a60:	48 8b 85 a0 fd ff ff 	mov    -0x260(%rbp),%rax
    1a67:	48 89 85 a8 fd ff ff 	mov    %rax,-0x258(%rbp)
    1a6e:	48 83 bd a0 fd ff ff 	cmpq   $0x0,-0x260(%rbp)
    1a75:	00 
    1a76:	75 35                	jne    1aad <rand@plt+0x77d>
    1a78:	48 8b 85 60 fd ff ff 	mov    -0x2a0(%rbp),%rax
    1a7f:	48 be 70 6c 65 61 73 	movabs $0x7520657361656c70,%rsi
    1a86:	65 20 75 
    1a89:	48 bf 73 65 20 70 69 	movabs $0x20676e6970206573,%rdi
    1a90:	6e 67 20 
    1a93:	48 89 30             	mov    %rsi,(%rax)
    1a96:	48 89 78 08          	mov    %rdi,0x8(%rax)
    1a9a:	48 b9 2d 63 20 34 2e 	movabs $0xa202e3420632d,%rcx
    1aa1:	20 0a 00 
    1aa4:	48 89 48 10          	mov    %rcx,0x10(%rax)
    1aa8:	e9 88 03 00 00       	jmp    1e35 <rand@plt+0xb05>
    1aad:	48 8b 85 a0 fd ff ff 	mov    -0x260(%rbp),%rax
    1ab4:	48 89 c7             	mov    %rax,%rdi
    1ab7:	e8 44 f7 ff ff       	call   1200 <strlen@plt>
    1abc:	48 83 f8 02          	cmp    $0x2,%rax
    1ac0:	77 38                	ja     1afa <rand@plt+0x7ca>
    1ac2:	48 8b 85 60 fd ff ff 	mov    -0x2a0(%rbp),%rax
    1ac9:	48 ba 70 6c 65 61 73 	movabs $0x7520657361656c70,%rdx
    1ad0:	65 20 75 
    1ad3:	48 b9 73 65 20 70 69 	movabs $0x20676e6970206573,%rcx
    1ada:	6e 67 20 
    1add:	48 89 10             	mov    %rdx,(%rax)
    1ae0:	48 89 48 08          	mov    %rcx,0x8(%rax)
    1ae4:	c7 40 10 2d 63 20 34 	movl   $0x3420632d,0x10(%rax)
    1aeb:	66 c7 40 14 2e 0a    	movw   $0xa2e,0x14(%rax)
    1af1:	c6 40 16 00          	movb   $0x0,0x16(%rax)
    1af5:	e9 3b 03 00 00       	jmp    1e35 <rand@plt+0xb05>
    1afa:	48 8b 85 a8 fd ff ff 	mov    -0x258(%rbp),%rax
    1b01:	48 8d 48 02          	lea    0x2(%rax),%rcx
    1b05:	48 8d 85 70 fd ff ff 	lea    -0x290(%rbp),%rax
    1b0c:	48 89 c2             	mov    %rax,%rdx
    1b0f:	48 8d 35 ac 05 00 00 	lea    0x5ac(%rip),%rsi        # 20c2 <rand@plt+0xd92>
    1b16:	48 89 cf             	mov    %rcx,%rdi
    1b19:	b8 00 00 00 00       	mov    $0x0,%eax
    1b1e:	e8 8d f7 ff ff       	call   12b0 <__isoc99_sscanf@plt>
    1b23:	8b 85 70 fd ff ff    	mov    -0x290(%rbp),%eax
    1b29:	83 f8 04             	cmp    $0x4,%eax
    1b2c:	74 38                	je     1b66 <rand@plt+0x836>
    1b2e:	48 8b 85 60 fd ff ff 	mov    -0x2a0(%rbp),%rax
    1b35:	48 be 70 6c 65 61 73 	movabs $0x7520657361656c70,%rsi
    1b3c:	65 20 75 
    1b3f:	48 bf 73 65 20 70 69 	movabs $0x20676e6970206573,%rdi
    1b46:	6e 67 20 
    1b49:	48 89 30             	mov    %rsi,(%rax)
    1b4c:	48 89 78 08          	mov    %rdi,0x8(%rax)
    1b50:	c7 40 10 2d 63 20 34 	movl   $0x3420632d,0x10(%rax)
    1b57:	66 c7 40 14 2e 0a    	movw   $0xa2e,0x14(%rax)
    1b5d:	c6 40 16 00          	movb   $0x0,0x16(%rax)
    1b61:	e9 cf 02 00 00       	jmp    1e35 <rand@plt+0xb05>
    1b66:	48 8b 95 98 fd ff ff 	mov    -0x268(%rbp),%rdx
    1b6d:	48 8d 85 f0 fd ff ff 	lea    -0x210(%rbp),%rax
    1b74:	48 89 c6             	mov    %rax,%rsi
    1b77:	48 8d 3d 1c 05 00 00 	lea    0x51c(%rip),%rdi        # 209a <rand@plt+0xd6a>
    1b7e:	e8 4d f6 ff ff       	call   11d0 <strncmp@plt>
    1b83:	85 c0                	test   %eax,%eax
    1b85:	0f 85 25 02 00 00    	jne    1db0 <rand@plt+0xa80>
    1b8b:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    1b92:	48 8d 35 2c 05 00 00 	lea    0x52c(%rip),%rsi        # 20c5 <rand@plt+0xd95>
    1b99:	48 89 c7             	mov    %rax,%rdi
    1b9c:	e8 7f f7 ff ff       	call   1320 <strstr@plt>
    1ba1:	48 89 85 b8 fd ff ff 	mov    %rax,-0x248(%rbp)
    1ba8:	48 8b 85 b8 fd ff ff 	mov    -0x248(%rbp),%rax
    1baf:	48 89 85 c0 fd ff ff 	mov    %rax,-0x240(%rbp)
    1bb6:	48 83 bd b8 fd ff ff 	cmpq   $0x0,-0x248(%rbp)
    1bbd:	00 
    1bbe:	75 4d                	jne    1c0d <rand@plt+0x8dd>
    1bc0:	48 8b 85 60 fd ff ff 	mov    -0x2a0(%rbp),%rax
    1bc7:	48 ba 70 6c 65 61 73 	movabs $0x7520657361656c70,%rdx
    1bce:	65 20 75 
    1bd1:	48 b9 73 65 20 6f 70 	movabs $0x746e65706f206573,%rcx
    1bd8:	65 6e 74 
    1bdb:	48 89 10             	mov    %rdx,(%rax)
    1bde:	48 89 48 08          	mov    %rcx,0x8(%rax)
    1be2:	48 be 68 65 64 6f 6f 	movabs $0x2d20726f6f646568,%rsi
    1be9:	72 20 2d 
    1bec:	48 bf 6b 20 3c 6b 65 	movabs $0x2e3e79656b3c206b,%rdi
    1bf3:	79 3e 2e 
    1bf6:	48 89 70 10          	mov    %rsi,0x10(%rax)
    1bfa:	48 89 78 18          	mov    %rdi,0x18(%rax)
    1bfe:	66 c7 40 20 20 0a    	movw   $0xa20,0x20(%rax)
    1c04:	c6 40 22 00          	movb   $0x0,0x22(%rax)
    1c08:	e9 28 02 00 00       	jmp    1e35 <rand@plt+0xb05>
    1c0d:	48 8b 85 b8 fd ff ff 	mov    -0x248(%rbp),%rax
    1c14:	48 89 c7             	mov    %rax,%rdi
    1c17:	e8 e4 f5 ff ff       	call   1200 <strlen@plt>
    1c1c:	48 83 f8 02          	cmp    $0x2,%rax
    1c20:	77 49                	ja     1c6b <rand@plt+0x93b>
    1c22:	48 8b 85 60 fd ff ff 	mov    -0x2a0(%rbp),%rax
    1c29:	48 ba 70 6c 65 61 73 	movabs $0x7520657361656c70,%rdx
    1c30:	65 20 75 
    1c33:	48 b9 73 65 20 6f 70 	movabs $0x746e65706f206573,%rcx
    1c3a:	65 6e 74 
    1c3d:	48 89 10             	mov    %rdx,(%rax)
    1c40:	48 89 48 08          	mov    %rcx,0x8(%rax)
    1c44:	48 be 68 65 64 6f 6f 	movabs $0x2d20726f6f646568,%rsi
    1c4b:	72 20 2d 
    1c4e:	48 bf 6b 20 3c 6b 65 	movabs $0x2e3e79656b3c206b,%rdi
    1c55:	79 3e 2e 
    1c58:	48 89 70 10          	mov    %rsi,0x10(%rax)
    1c5c:	48 89 78 18          	mov    %rdi,0x18(%rax)
    1c60:	66 c7 40 20 0a 00    	movw   $0xa,0x20(%rax)
    1c66:	e9 ca 01 00 00       	jmp    1e35 <rand@plt+0xb05>
    1c6b:	bf 00 00 00 00       	mov    $0x0,%edi
    1c70:	e8 2b f6 ff ff       	call   12a0 <time@plt>
    1c75:	89 c7                	mov    %eax,%edi
    1c77:	e8 f4 f5 ff ff       	call   1270 <srand@plt>
    1c7c:	e8 af f6 ff ff       	call   1330 <rand@plt>
    1c81:	89 85 78 fd ff ff    	mov    %eax,-0x288(%rbp)
    1c87:	8b 95 78 fd ff ff    	mov    -0x288(%rbp),%edx
    1c8d:	48 8d 85 d0 fd ff ff 	lea    -0x230(%rbp),%rax
    1c94:	48 8d 35 27 04 00 00 	lea    0x427(%rip),%rsi        # 20c2 <rand@plt+0xd92>
    1c9b:	48 89 c7             	mov    %rax,%rdi
    1c9e:	b8 00 00 00 00       	mov    $0x0,%eax
    1ca3:	e8 58 f6 ff ff       	call   1300 <sprintf@plt>
    1ca8:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    1caf:	be 6b 2d 00 00       	mov    $0x2d6b,%esi
    1cb4:	48 89 c7             	mov    %rax,%rdi
    1cb7:	e8 64 f5 ff ff       	call   1220 <strchr@plt>
    1cbc:	48 89 85 c8 fd ff ff 	mov    %rax,-0x238(%rbp)
    1cc3:	48 8d 85 f0 fe ff ff 	lea    -0x110(%rbp),%rax
    1cca:	ba 00 01 00 00       	mov    $0x100,%edx
    1ccf:	be 00 00 00 00       	mov    $0x0,%esi
    1cd4:	48 89 c7             	mov    %rax,%rdi
    1cd7:	e8 84 f5 ff ff       	call   1260 <memset@plt>
    1cdc:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    1ce3:	48 89 c7             	mov    %rax,%rdi
    1ce6:	e8 15 f5 ff ff       	call   1200 <strlen@plt>
    1ceb:	48 8d 50 f2          	lea    -0xe(%rax),%rdx
    1cef:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    1cf6:	48 8d 48 0e          	lea    0xe(%rax),%rcx
    1cfa:	48 8d 85 f0 fe ff ff 	lea    -0x110(%rbp),%rax
    1d01:	48 89 ce             	mov    %rcx,%rsi
    1d04:	48 89 c7             	mov    %rax,%rdi
    1d07:	e8 b4 f4 ff ff       	call   11c0 <strncpy@plt>
    1d0c:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    1d13:	48 89 c7             	mov    %rax,%rdi
    1d16:	e8 e5 f4 ff ff       	call   1200 <strlen@plt>
    1d1b:	48 83 e8 0e          	sub    $0xe,%rax
    1d1f:	c6 84 05 f0 fe ff ff 	movb   $0x0,-0x110(%rbp,%rax,1)
    1d26:	00 
    1d27:	48 8d 95 f0 fe ff ff 	lea    -0x110(%rbp),%rdx
    1d2e:	48 8d 85 d0 fd ff ff 	lea    -0x230(%rbp),%rax
    1d35:	48 89 d6             	mov    %rdx,%rsi
    1d38:	48 89 c7             	mov    %rax,%rdi
    1d3b:	e8 50 f5 ff ff       	call   1290 <strcmp@plt>
    1d40:	85 c0                	test   %eax,%eax
    1d42:	75 3e                	jne    1d82 <rand@plt+0xa52>
    1d44:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    1d4b:	ba 08 00 00 00       	mov    $0x8,%edx
    1d50:	be 00 00 00 00       	mov    $0x0,%esi
    1d55:	48 89 c7             	mov    %rax,%rdi
    1d58:	e8 03 f5 ff ff       	call   1260 <memset@plt>
    1d5d:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    1d64:	48 8d 15 5d 03 00 00 	lea    0x35d(%rip),%rdx        # 20c8 <rand@plt+0xd98>
    1d6b:	be 08 00 00 00       	mov    $0x8,%esi
    1d70:	48 89 c7             	mov    %rax,%rdi
    1d73:	b8 00 00 00 00       	mov    $0x0,%eax
    1d78:	e8 d3 f4 ff ff       	call   1250 <snprintf@plt>
    1d7d:	e9 b3 00 00 00       	jmp    1e35 <rand@plt+0xb05>
    1d82:	48 8b 85 60 fd ff ff 	mov    -0x2a0(%rbp),%rax
    1d89:	48 ba 46 61 69 6c 20 	movabs $0x206f74206c696146,%rdx
    1d90:	74 6f 20 
    1d93:	48 b9 67 65 74 20 73 	movabs $0x6c65687320746567,%rcx
    1d9a:	68 65 6c 
    1d9d:	48 89 10             	mov    %rdx,(%rax)
    1da0:	48 89 48 08          	mov    %rcx,0x8(%rax)
    1da4:	c7 40 10 6c 21 0a 00 	movl   $0xa216c,0x10(%rax)
    1dab:	e9 85 00 00 00       	jmp    1e35 <rand@plt+0xb05>
    1db0:	48 8b 85 68 fd ff ff 	mov    -0x298(%rbp),%rax
    1db7:	48 8d 35 18 03 00 00 	lea    0x318(%rip),%rsi        # 20d6 <rand@plt+0xda6>
    1dbe:	48 89 c7             	mov    %rax,%rdi
    1dc1:	e8 0a f5 ff ff       	call   12d0 <popen@plt>
    1dc6:	48 89 85 b0 fd ff ff 	mov    %rax,-0x250(%rbp)
    1dcd:	48 83 bd b0 fd ff ff 	cmpq   $0x0,-0x250(%rbp)
    1dd4:	00 
    1dd5:	75 2f                	jne    1e06 <rand@plt+0xad6>
    1dd7:	48 8d 3d fb 02 00 00 	lea    0x2fb(%rip),%rdi        # 20d9 <rand@plt+0xda9>
    1dde:	e8 fd f4 ff ff       	call   12e0 <perror@plt>
    1de3:	bf 01 00 00 00       	mov    $0x1,%edi
    1de8:	e8 23 f5 ff ff       	call   1310 <exit@plt>
    1ded:	48 8d 95 f0 fe ff ff 	lea    -0x110(%rbp),%rdx
    1df4:	48 8b 85 60 fd ff ff 	mov    -0x2a0(%rbp),%rax
    1dfb:	48 89 d6             	mov    %rdx,%rsi
    1dfe:	48 89 c7             	mov    %rax,%rdi
    1e01:	e8 ea f4 ff ff       	call   12f0 <strcat@plt>
    1e06:	48 8b 95 b0 fd ff ff 	mov    -0x250(%rbp),%rdx
    1e0d:	48 8d 85 f0 fe ff ff 	lea    -0x110(%rbp),%rax
    1e14:	be 00 01 00 00       	mov    $0x100,%esi
    1e19:	48 89 c7             	mov    %rax,%rdi
    1e1c:	e8 5f f4 ff ff       	call   1280 <fgets@plt>
    1e21:	48 85 c0             	test   %rax,%rax
    1e24:	75 c7                	jne    1ded <rand@plt+0xabd>
    1e26:	48 8b 85 b0 fd ff ff 	mov    -0x250(%rbp),%rax
    1e2d:	48 89 c7             	mov    %rax,%rdi
    1e30:	e8 0b f4 ff ff       	call   1240 <pclose@plt>
    1e35:	48 8b 45 f8          	mov    -0x8(%rbp),%rax
    1e39:	64 48 33 04 25 28 00 	xor    %fs:0x28,%rax
    1e40:	00 00 
    1e42:	74 05                	je     1e49 <rand@plt+0xb19>
    1e44:	e8 c7 f3 ff ff       	call   1210 <__stack_chk_fail@plt>
    1e49:	c9                   	leave  
    1e4a:	c3                   	ret    
    1e4b:	0f 1f 44 00 00       	nopl   0x0(%rax,%rax,1)
    1e50:	f3 0f 1e fa          	endbr64 
    1e54:	41 57                	push   %r15
    1e56:	4c 8d 3d 9b 1e 00 00 	lea    0x1e9b(%rip),%r15        # 3cf8 <rand@plt+0x29c8>
    1e5d:	41 56                	push   %r14
    1e5f:	49 89 d6             	mov    %rdx,%r14
    1e62:	41 55                	push   %r13
    1e64:	49 89 f5             	mov    %rsi,%r13
    1e67:	41 54                	push   %r12
    1e69:	41 89 fc             	mov    %edi,%r12d
    1e6c:	55                   	push   %rbp
    1e6d:	48 8d 2d 94 1e 00 00 	lea    0x1e94(%rip),%rbp        # 3d08 <rand@plt+0x29d8>
    1e74:	53                   	push   %rbx
    1e75:	4c 29 fd             	sub    %r15,%rbp
    1e78:	48 83 ec 08          	sub    $0x8,%rsp
    1e7c:	e8 7f f1 ff ff       	call   1000 <__cxa_finalize@plt-0x1b0>
    1e81:	48 c1 fd 03          	sar    $0x3,%rbp
    1e85:	74 1f                	je     1ea6 <rand@plt+0xb76>
    1e87:	31 db                	xor    %ebx,%ebx
    1e89:	0f 1f 80 00 00 00 00 	nopl   0x0(%rax)
    1e90:	4c 89 f2             	mov    %r14,%rdx
    1e93:	4c 89 ee             	mov    %r13,%rsi
    1e96:	44 89 e7             	mov    %r12d,%edi
    1e99:	41 ff 14 df          	call   *(%r15,%rbx,8)
    1e9d:	48 83 c3 01          	add    $0x1,%rbx
    1ea1:	48 39 dd             	cmp    %rbx,%rbp
    1ea4:	75 ea                	jne    1e90 <rand@plt+0xb60>
    1ea6:	48 83 c4 08          	add    $0x8,%rsp
    1eaa:	5b                   	pop    %rbx
    1eab:	5d                   	pop    %rbp
    1eac:	41 5c                	pop    %r12
    1eae:	41 5d                	pop    %r13
    1eb0:	41 5e                	pop    %r14
    1eb2:	41 5f                	pop    %r15
    1eb4:	c3                   	ret    
    1eb5:	66 66 2e 0f 1f 84 00 	data16 cs nopw 0x0(%rax,%rax,1)
    1ebc:	00 00 00 00 
    1ec0:	f3 0f 1e fa          	endbr64 
    1ec4:	c3                   	ret    

Disassembly of section .fini:

0000000000001ec8 <.fini>:
    1ec8:	f3 0f 1e fa          	endbr64 
    1ecc:	48 83 ec 08          	sub    $0x8,%rsp
    1ed0:	48 83 c4 08          	add    $0x8,%rsp
    1ed4:	c3                   	ret    
