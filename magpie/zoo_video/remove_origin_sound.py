import librosa
import matplotlib
import numpy as np
import matplotlib.pyplot as plt
import soundfile as sf

SR = 44100

x, sr = librosa.load("zoo_audio.wav", sr=SR)
y, sr = librosa.load("download_audio.wav", sr=SR)

# print(f"max x: {x[np.argmax(x)]}, idx: {np.argmax(x)}")
# print(f"max y: {y[np.argmax(y)]}, idx: {np.argmax(y)}")

y = np.concatenate((np.zeros(np.argmax(x)-np.argmax(y)), y))
x = x[:len(y)]

# x_slice = x[SR*5:SR*9]
# y_slice = y[SR*5:SR*9]*1.41
x_slice = x
y_slice = y*1.41
delta = x_slice-y_slice
with open("slice.txt", "w") as f:
    res = ""
    for i in range(len(y)):
        if y[i] != 0:
            res += str(x[i])+'\t'+str(y[i])+'\t'+str(x[i]-y[i])+'\t'+str(x[i]/y[i])+'\n'
        else:
            res += str(x[i])+'\t'+str(y[i])+'\t'+str(x[i]-y[i])+'\t'+str(0)+'\n'
    f.write(res)

sf.write("result.wav", delta, SR, 'PCM_24')