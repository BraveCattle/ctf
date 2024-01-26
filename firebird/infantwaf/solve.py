import httpx
import os
import urllib.parse
import requests

# BASE_URL = os.environ["ash-chal.firebird.sh:36003/"]
url = "http://ash-chal.firebird.sh:36003/"
data = urllib.parse.quote("?giveme=flag")
# data = "?giveme=flag"
# data = "&#63;&#103;&#105;&#118;&#101;&#109;&#101;&#61;&#102;&#108;&#97;&#103;"
data = "\u003f\u0067\u0069\u0076\u0065\u006d\u0065\u003d\u0066\u006c\u0061\u0067"

print(data)

res = requests.get(url=url+data)

# res = httpx.get(
#     url=url,
#     headers={"Content-Type": "text/plain"},
#     content='\ufeff{"giveme": "flag"}',  # UTF-8 BOM
# )

print(res.text)