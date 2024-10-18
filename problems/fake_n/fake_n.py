from Crypto.Util.number import *
from secret import flag

def fakeN_list():
    puzzle_list = []

    for i in range(15):
        r = getPrime(32)
        puzzle_list.append(r)

    p = getPrime(32)
    q = getPrime(32)
    com = p*q

    puzzle_list.append(com)

    return puzzle_list

def encrypt(m,e,fake_n_list):

    fake_n = 1
    for i in range(len(fake_n_list)):
        fake_n *= fake_n_list[i]

    really_n = 1
    for i in range(len(fake_n_list)-1):
        really_n *= fake_n_list[i]

    c = pow(m,e,really_n)

    print("c =",c)
    print("fake_n =",fake_n)

if __name__ == '__main__':
    m = bytes_to_long(flag)
    e = 65537
    fake_n_list = fakeN_list()
    encrypt(m,e,fake_n_list)

'''
c = 6451324417011540096371899193595274967584961629958072589442231753539333785715373417620914700292158431998640787575661170945478654203892533418902
fake_n = 178981104694777551556050210788105224912858808489844293395656882292972328450647023459180992923023126555636398409062602947287270007964052060975137318172446309766581
'''