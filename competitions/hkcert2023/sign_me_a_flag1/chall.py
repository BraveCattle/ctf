import signal
import os
import hmac
import hashlib
import sys


def tle_handler(*args):
    print('閿燂拷?')
    sys.exit(0)

def xor(a, b):
    return bytes(u^v for u, v in zip(a, b))

def sign_message(key_client: bytes, key_server: bytes, message: str) -> bytes:
    key_combined = xor(key_client, key_server)

    signature = hmac.new(key_combined, message.encode(), hashlib.sha256).digest()
    return signature


def main():
    signal.signal(signal.SIGALRM, tle_handler)
    signal.alarm(120)

    flag = os.environ.get('FLAG', 'hkcert23{***REDACTED***}')

    key_server = os.urandom(16)

    for id in range(10):
        action = input('棣冨箑 ').strip()

        if action == 'sign':
            key_client = bytes.fromhex(input('棣冩斀 '))
            message = input('棣冩尠 ')
            # if 'flag' in message:
            #     return print('棣冩Ж')
            signature = sign_message(key_client, key_server, message)
            print(f'棣冩憫 {signature.hex()}')
        elif action == 'verify':
            key_client = b'\0'*16 # I get to decide the key :)
            message = input('棣冩尠 ')
            signature = bytes.fromhex(input('棣冩憫 '))
            if message != 'gib flag pls':
                return print('棣冩Ж')
            if signature != sign_message(key_client, key_server, message):
                return print('棣冩Ж')
            print(f'棣冨极 {flag}')


if __name__ == '__main__':
    try:
        main()
    except Exception:
        print('棣冩��')
