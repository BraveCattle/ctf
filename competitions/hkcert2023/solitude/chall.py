import os
import random
import signal
import sys


def tle_handler(*args):
    print('⏰')
    sys.exit(0)

class ShamirSecretSharing:
    def __init__(self, p, k=10):
        self.p = p
        self.k = k

        self.secret = random.randrange(0, p)
        # [secret, a1, ..., ak] represents the polynomial "secret + a1*x + ... + ak*x^k"
        self.coefficients = [self.secret] + [random.randrange(0, p) for _ in range(k)]

    # Evaluates coefficients
    def evaluate(self, x: int) -> int:
        y = 0
        for coeff in reversed(self.coefficients):
            y *= x
            y += coeff
            y %= self.p
        return y

def main():
    signal.signal(signal.SIGALRM, tle_handler)
    signal.alarm(30)

    # Do not submit hkcert23{***REDACTED***}. The actual flag is in the netcat service!
    flag = os.environ.get('FLAG', 'hkcert23{***REDACTED***}')

    p = random.getrandbits(1024) | 1
    print(f'📢 {p}')

    sharer = ShamirSecretSharing(p)

    # print(f"coeff[0]: {sharer.coefficients[0]}")

    # Claim your share!
    x = int(input('👋 '))
    assert x % p != 0
    y = sharer.evaluate(x)
    print(f'🤝 {y}')

    secret = int(input('🔑 '))
    assert secret == sharer.secret

    print(f'🏁 {flag}')


if __name__ == '__main__':
    try:
        main()
    except Exception:
        print('😒')


# tutorial:
# select p where p%9 == 0
# select x = p/3
# eval = secret + a0*(p/3) + a2*(p/3)^2 + ... + a9*(p/3)^10
# since p%9 == 0, (p/3)^2 == p*p/9, which is divisible by p
# therefore eval === secret + a0*(p/3) (mod p)
# there is 1/3 chance that a0 is divisible by 3
# thus the probability that eval == secret is P(p%9 == 0)*P(a0%3 == 0) > 1/27