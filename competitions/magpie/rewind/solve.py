import base64

ct1 = b"uNj/X6ZzFZ7kVmZ4IV992KQA5SxBXFs4fnHwnDtXWRk1PCy5tm4/ciZWLF1WMm093gUPAXCGkONh88rhEjpX7Yi07iA2ePT+6Uzu1Pzm2M4="

# decode by rot13 (https://rot13.com/)
ct2 = b"hAw/K6MmSM7xIzM4VI992XDN5FkOKSf4saUjaQgKJEx1CPl5gz4/pvMJYS1JZz093tHCNKPTxBAu88euRwcK7Lv07vN2rCG+6Hmh1Cmz2Z4="

# decode by DES (https://encode-decode.com/des-encrypt-online/)
enc = b"tHe father Is paraLLel to the founder. 22 3 9 6; eevogs{nizy135_wjzpsk3_1791}"

# decode by HILL cipher
flag = b"magpie{char135_babbag3_1791}"