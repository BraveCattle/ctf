import moviepy.editor as mp

# audio_clip = mp.VideoFileClip("zoovideo.mp4")
# audio_clip.audio.write_audiofile("zoo_audio.mp3")
# audio_clip.audio.write_audiofile("zoo_audio.wav")

audio_clip = mp.VideoFileClip("downloads/download.mp4")
# audio_clip.audio.write_audiofile("zoo_audio.mp3")
audio_clip.audio.write_audiofile("download_audio.wav")