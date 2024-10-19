import ecdsa
from ecdsa import SigningKey, NIST224p
from ecdsa.util import sigencode_string, sigdecode_string
from ecdsa.numbertheory import inverse_mod
from Crypto.PublicKey import ECC
from pwn import *

# context.log_level = 'debug'

p = 1157920892103562487626974469494075735300861434152903141955
Gx, Gy = 0x6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296, 0x4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5
n = 115792089210356248762697446949407573529996955224135760342422259061068512044369

def attack(publicKeyOrderInteger, sig1, sig2, m1, m2): 
    r1, s1 = sig1
    r2, s2 = sig2

    assert r1 == r2

    #A bit of Math 
    #m1 = message_1 
    #m2 = message_2
    #pk = Private Key (unknown to attacker)
    #R  = r1 == r2
    #K  = K value that was used (unknown to attacker)
    #N  = integer order of G (part of public key)
    
    #         From Signing Defintion
    #s1 = (m1 + pk * R) / K Mod N    and     s2 = (m2 + pk * R) / K Mod N
    
    #         Rearrange 
    #K = (m1 + pk * R) / s1 Mod N    and     K = (m2 + pk * R) / s2 Mod N
    
    #         Set Equal
    #(m1 + pk * R) / s1 = (m2 + pk * R) / s2     Mod N
    
    #         Solve for pk (private key)
    #pk Mod N = (s2 * m1 - s1 * m2) / R * (s1 - s2)
    #pk Mod N = (s2 * m1 - s1 * m2) * (R * (s1 - s2)) ** -1

    numerator = (((s2 * m1) % publicKeyOrderInteger) - ((s1 * m2) % publicKeyOrderInteger))
    denominator = inverse_mod(r1 * ((s1 - s2) % publicKeyOrderInteger), publicKeyOrderInteger)

    privateKey = numerator * denominator % publicKeyOrderInteger

    return privateKey

if __name__ == "__main__":
    r = remote('challenge.magpiectf.ca', 1337)
    r.recvuntil(b'public key: ')
    vk = eval(r.recvline().decode().strip('\n'))
    r.recvuntil(b'hints:\n')
    m1 = eval(r.recvline().decode().strip('\n'))
    m2 = eval(r.recvline().decode().strip('\n'))
    r.recvuntil(b'signatures: ')
    signatures = r.recvline().decode().strip('\n').split(' ')
    sig1, sig2 = eval(signatures[0].strip(',')), eval(signatures[1])
    r1, s1 = sig1
    r2, s2 = sig2

    # print(m1, m2)
    curve = ecdsa.curves.NIST256p
    curve.curve.p, curve.generator.x, curve.generator.y, curve.order = p, Gx, Gy, n
    vk_order = ecdsa.ellipticcurve.Point(curve.curve, vk[0], vk[1], order=curve.order).order()
    # print(f"vk_order: {vk_order}")

    sk = attack(vk_order, (r1, s1), (r2, s2), m1, m2)
    print(f"secret key: {sk}")
    payload = str(sk).encode('utf8')
    r.recvuntil(b'privary key (d): \n')
    r.sendline(payload)
    recv = r.recvline()
    print(f"flag: {recv}")