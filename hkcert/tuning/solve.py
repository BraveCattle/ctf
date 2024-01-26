from base64 import b64decode

hsl = [
4.81261614, 24.32539791, 36.53413226,
3.90699199, 11.49869364, 34.99557365,
0.03878509, 16.26506004, 32.54902,

0.16534689, 9.7938134, 38.03921569,
3.77025878, 43.64416333, 33.38033344,
0.57110573, 40.23668521, 33.1372549,

5.14303676, 23.77437585, 24.4372566,
5.22510196, 22.22735981, 24.95963139,
2.9536028, 24.8063338, 34.6816857,

0.49018897, 31.99041655, 31.42579079,
5.68813836, 24.64731433, 38.5401126,
0.0, 14.78873099, 27.84313725]

def radToDegree(rad):
	return rad * 57.2957795

def hsl_to_rgb(h, s, l):
	# print(h,s,l)
	s /= 100
	l /= 100
	C = (1-abs(2*l-1))*s
	hh = h/60
	X = C*(1-abs(hh%2-1))
	r = 0
	b = 0
	g = 0
	if (hh>=0 and hh<1):
		r = C
		g = X
	elif (hh>=1 and hh<2):
		r = X
		g = C
	elif (hh>=2 and hh<3):
		g = C
		b = X
	elif (hh>=3 and hh<4):
		g = X
		b = C
	elif (hh>=4 and hh<5):
		r = X
		b = C
	else:
		r = C
		b = X
	m = l-C/2
	r += m
	g += m
	b += m
	r *= 255
	g *= 255
	b *= 255
	r = round(r)
	g = round(g)
	b = round(b)
	return hex(r)[2:] + hex(g)[2:] + hex(b)[2:]

rgbs = [["" for j in range(3)] for i in range(4)]

for i in range(len(hsl)//3):
    hsl[i*3] = radToDegree(hsl[i*3])
    rgbs[i//3][i%3] = (hsl_to_rgb(hsl[i*3], hsl[i*3+1], hsl[i*3+2]))

# print(rgbs)
flag = ""
for j in range(3):
	for i in range(4):
		flag += rgbs[i][j]

print(b64decode(bytes.fromhex(flag)))