import matplotlib.pyplot as plt
import librosa.display

audio_path = 'message.wav'
x, sr = librosa.load(audio_path, sr=None)
# librosa.load(audio_path, sr=44100)
print(f"x shape: {x.shape}, sampling rate: {sr}")
print(f"length: {x.shape[0]/sr} seconds")

bucket = []
for i in range(x.shape[0]//int(sr)):
    bucket.append([x[i*sr+j] for j in range(sr)])

result = ""
for i, b in enumerate(bucket):
    # print(i, max(b))
    if max(b) < 0.5:
        result += '0'
    else:
        result += '1'

print(result)
with open("signal_result.txt", "w") as f:
    f.write(result)

# plt.figure(figsize=(300, 5))
# librosa.display.waveshow(x, sr=sr, color="blue")
# plt.savefig('signal.png')

# X = librosa.stft(x)
# Xdb = librosa.amplitude_to_db(abs(X))
# print(f"Xdb shape: {Xdb.shape}")
# plt.figure(figsize=(300, 5))
# librosa.display.specshow(Xdb, sr=sr, x_axis='time', y_axis='log', fmax=50)
# plt.colorbar()
# plt.savefig('spetrum.png')

# for i in Xdb:
#     print(f"len: {len(i)}, content: {i}")

# with open("sp.txt", "w") as f:
#     for i in Xdb:
#         f.write(str(i)+'\n')

# print(f"Xdb shape: {Xdb.shape}")