# Solved the problem after seeing the solution... (should have tried harder)
## Writeup
Notice that from 5th second to 9th second there are some noise in the video, thus try to extract the audio and check the spectrum. Find the string 'zo0isveryveryfun'.
If the characters are not clear, you can download the original video from youtube and remove the original sound by minusing the original sound wave (with some adjustment).

Also find a jpg file in the video file. Extract it with ```foremost zoovideo.mp4 -o output```.
The flag is hidden by steganography. Extract the flag by ```steghide extract -p 'zo0isveryveryfun' -sf output/jpg/00093544.jpg```