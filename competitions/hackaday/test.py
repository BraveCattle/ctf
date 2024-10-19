import subprocess

p = subprocess.Popen(['./vuln1'], stdin=subprocess.PIPE)

for a in range(0, 10):
    for b in range(0, 10):
        for c in range(0, 10):
            for d in range(0, 10):
                res = str(a)+str(b)+str(c)+str(d)
                print(f"trying: {res}")
                p.communicate(res)
