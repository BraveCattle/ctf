from Crypto.Util.number import *
from math import sqrt

p = 7709388356791362098686964537734555579863438117190798798028727762878684782880904322549856912344789781854618283939002621383390230228555920884200579836394161
c = 5573755468949553624452023926839820294500672937008992680281196534187840615851844091682946567434189657243627735469507175898662317628420037437385814152733456

def tonelli(n, p):
    def legendre(a, p): 
        return pow(a, (p - 1) // 2, p)

    assert legendre(n, p) == 1
    q = p - 1
    s = 0
    while q % 2 == 0:
        q //= 2
        s += 1
    if s == 1:
        return pow(n, (p + 1) // 4, p)
    for z in range(2, p):
        if p - 1 == legendre(z, p):
            break
    c = pow(z, q, p)
    r = pow(n, (q + 1) // 2, p)
    t = pow(n, q, p)
    m = s
    t2 = 0
    while (t - 1) % p != 0:
        t2 = (t * t) % p
        for i in range(1, m):
            if (t2 - 1) % p == 0:
                break
            t2 = (t2 * t2) % p
        b = pow(c, 1 << (m - i - 1), p)
        r = (r * b) % p
        c = (b * b) % p
        t = (t * c) % p
        m = i
    return r

result = tonelli(c, p)
print(f"flag: {long_to_bytes(result)}")