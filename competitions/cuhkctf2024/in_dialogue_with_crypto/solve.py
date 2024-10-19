from Crypto.Util import number
from Crypto.Random import random
from string import ascii_letters, digits, punctuation
from base64 import b64encode

def get_root(c, p):
    l, r = 1, c-1
    while l <= r:
        mid = (l+r)//2
        res = 1
        for _ in range(p):
            res *= mid
            if res > c: break
        if res == c:
            try:
                decoded = mid.to_bytes(8, byteorder='big').decode()
                return decoded
            except Exception as e:
                return "Invalid"
        if res < c:
            l = mid+1
        else:
            r = mid-1
    return "Invalid"

c = 471844102365020976184616062197782940832345772990179535386193281717756869642147211426114375059041967658129297351418305192155204568762532819291706248777892453109531718485012927719545105126773325778008067098247835482991119008391889500622718068917896266153224456931828059439684487822671901090180950277009565593919201257550890753196513931941293725754584297615659634400033466258752023368847696883762242854830905923591145983767553420795011399032118268180367782222135140345052725645001327946926511684086932141062995962216823187036149379553933842166187627685177522657613496764856416935298928315242480106684784600920706215067082005359381544072007743468592143718208890248619825115564797909615504670486230907472903559626310507287090291152431428763009480330155967121130729787481705728819028817049264622326789157669643139412168304164706665318868131996188071145331276646926931053188967184894601587297814873625552218748238074848067051217112986651767301538526752040101776484530604985908776879419630175407397421567712949926337643138982636154742931300557781204028486588836898870478472928668718991984805505994810355415749292793646513234265475793850283421199555301216761205291101264105328394499774466668717653838225363085912805223997688350663316201689339

ciphertexts = []
with open("base64_decode.txt", "r") as f:
    ciphertexts = eval("".join(f.readlines()))

printable = ascii_letters + digits + punctuation
# print(sorted([ord(c) for c in printable]))
k_range = list(range(16, 64))

plain_text = ""
for i, c in enumerate(ciphertexts):
    print("-"*30+f" for cipher text {i} "+'-'*30)
    for e in range(16, 64):
        dec = get_root(c, e)
        if dec != "Invalid":
            print(dec)
            plain_text += dec
    print('')

print(plain_text)

"""

Note: This is a markdown file.

Capture The Flag (CTF) is a cybersecurity competition that simulates real-world hacking scenarios in a controlled environment. Participants, often referred to as ethical hackers or security enthusiasts, are tasked with finding and exploiting vulnerabilities in various systems to uncover hidden flags. These flags are typically strings of text that serve as proof of successful exploitation and are used to score points. CTF competitions are not only challenging but also educational, providing participants with hands-on experience in cybersecurity techniques and methodologies.

The first part of the flag is `cuhk24ctf{HALLO_uwu_kvn`.

In CTF competitions, participants encounter a wide range of challenges that fall into distinct categories, each testing different skill sets. Web exploitation challenges focus on identifying and exploiting vulnerabilities in web applications, such as SQL injection, cross-site scripting (XSS), and server-side request forgery (SSRF). Cryptography challenges involve deciphering encoded messages, breaking encryption algorithms, and analyzing cryptographic protocols. Binary exploitation challenges require participants to exploit flaws in binary executables, such as buffer overflows, format string vulnerabilities, and shellcode injection. Forensics challenges revolve around analyzing digital artifacts, extracting hidden information from files, and recovering deleted data. Reverse engineering challenges task participants with understanding the functionality of software by dissecting and analyzing its code.

The second part of the flag is `ow_da_tor1cku_ando_da_e`.

The skills acquired and honed through CTF competitions are not limited to the realm of cybersecurity but can also be applied in other areas, such as gaming. In the popular Minecraft server Hypixel Skyblock, players can utilize their knowledge of binary exploitation and reverse engineering to create custom modifications (mods) that enhance gameplay. By understanding the game's underlying code and mechanics, players can develop innovative mods that introduce new features, improve performance, and even automate certain tasks. Additionally, cryptography skills can be employed to create secure trading systems within the game, ensuring the integrity and confidentiality of in-game transactions.

The third part of the flag is `ssenzi_ofu_smol_exp_att`.

In essence, participating in CTF competitions offers a unique opportunity to develop and refine a diverse set of technical skills essential in the field of cybersecurity and beyond. Whether mastering the art of web exploitation, delving into the intricacies of cryptography, unraveling the complexities of binary exploitation, deciphering digital forensics puzzles, or unraveling the mysteries of reverse engineering, CTF enthusiasts embark on a journey of continuous learning and discovery. These competitions not only foster a spirit of collaboration and camaraderie among participants but also serve as a platform for cultivating problem-solving abilities, critical thinking skills, and a deep understanding of cybersecurity principles. Through CTF competitions, individuals can explore the fascinating world of cybersecurity, push the boundaries of their knowledge and capabilities, and embark on a rewarding journey of skill development and personal growth.

The final part of the flag is `a3kuwu_vary_fevvy_guud}`.
"""