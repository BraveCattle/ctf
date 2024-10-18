from itertools import combinations as Comb
from functools import reduce
from Crypto.Util.number import *

c = 6451324417011540096371899193595274967584961629958072589442231753539333785715373417620914700292158431998640787575661170945478654203892533418902
fake_n = 178981104694777551556050210788105224912858808489844293395656882292972328450647023459180992923023126555636398409062602947287270007964052060975137318172446309766581
e = 65537

LIMIT = 2**32
remaining = fake_n
# fake_n_list = []
# for i in range(2, LIMIT):
#     if remaining%i == 0:
#         fake_n_list.append(i)
#         remaining //= i
#         print(f"found: {i}, remaining: {remaining}")
#     if i%1000000 == 0:
#         print(f"running at {i}")

fake_n_list = [2215221821, 2290486867, 2333428577, 2361589081, 2446301969, 2507934301,\
               2590663067, 3107210929, 3278987191, 3389689241, 3417707929, 3429664037,\
               3716624207, 3859354699, 3965529989, 4098704749, 4267348123]

print(f"len: {len(fake_n_list)}, list: {fake_n_list}")

for pair in list(Comb(fake_n_list, 2)):
    # print(pair[0], pair[1])
    phi_n = reduce(lambda x, y: x*y, [x-1 for x in fake_n_list if x != pair[0] and x != pair[1]])
    n = fake_n//pair[0]//pair[1]
    d = pow(e, -1, phi_n)
    m = pow(c, d, n)
    print(f"plain text: {long_to_bytes(m)}")

# begin{y0u_f1nd_th3_re4l_n}