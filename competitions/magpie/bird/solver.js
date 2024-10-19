(function(a, b) {
	var c = fun1,
		arr = a();
	while (!![]) {
		try {
			var d = -parseInt(c(0x18d)) / 0x1 * (parseInt(c(0x16e)) / 0x2) + parseInt(c(0x193)) / 0x3 * (parseInt(c(0x187)) / 0x4) + parseInt(c(0x179)) / 0x5 * (-parseInt(c(0x18f)) / 0x6) + parseInt(c(0x19a)) / 0x7 + parseInt(c(0x196)) / 0x8 + -parseInt(c(0x181)) / 0x9 * (-parseInt(c(0x18a)) / 0xa) + -parseInt(c(0x173)) / 0xb;
			if (d === b) break;
			else arr['push'](arr['shift']())
		} catch (_0x566160) {
			arr['push'](arr['shift']())
		}
	}
}(getArr, 0x5c1f4)
);
var sha256 = function sha256(c) {
	var d = fun1;

	function _0x702ecf(a, b) {
		return a >>> b | a << 0x20 - b
	};
	var e = Math[d(0x17b)],
		_0x3f69df = e(0x2, 0x20),
		_0x180487 = d(0x189),
		_0x9e0c3c, _0x3b2b09, _0x114fab = '',
		_0x359dc7 = [],
		_0x27eeed = c[_0x180487] * 0x8,
		_0x52a295 = sha256['h'] = sha256['h'] || [],
		_0x32bf67 = sha256['k'] = sha256['k'] || [],
		_0x4c150f = _0x32bf67[_0x180487],
		_0x1f2c51 = {};
	for (var f = 0x2; _0x4c150f < 0x40; f++) {
		if (!_0x1f2c51[f]) {
			for (_0x9e0c3c = 0x0; _0x9e0c3c < 0x139; _0x9e0c3c += f) {
				_0x1f2c51[_0x9e0c3c] = f
			}
			_0x52a295[_0x4c150f] = e(f, 0.5) * _0x3f69df | 0x0, _0x32bf67[_0x4c150f++] = e(f, 0x1 / 0x3) * _0x3f69df | 0x0
		}
	}
	c += '\\u0080';
	while (c[_0x180487] % 0x40 - 0x38) c += '\\x00';
	for (_0x9e0c3c = 0x0; _0x9e0c3c < c[_0x180487]; _0x9e0c3c++) {
		_0x3b2b09 = c[d(0x194)](_0x9e0c3c);
		if (_0x3b2b09 >> 0x8) return;
		_0x359dc7[_0x9e0c3c >> 0x2] |= _0x3b2b09 << (0x3 - _0x9e0c3c) % 0x4 * 0x8
	}
	_0x359dc7[_0x359dc7[_0x180487]] = _0x27eeed / _0x3f69df | 0x0, _0x359dc7[_0x359dc7[_0x180487]] = _0x27eeed;
	for (_0x3b2b09 = 0x0; _0x3b2b09 < _0x359dc7[_0x180487];) {
		var g = _0x359dc7[d(0x17f)](_0x3b2b09, _0x3b2b09 += 0x10),
			_0x97d88c = _0x52a295;
		_0x52a295 = _0x52a295['slice'](0x0, 0x8);
		for (_0x9e0c3c = 0x0; _0x9e0c3c < 0x40; _0x9e0c3c++) {
			var h = _0x9e0c3c + _0x3b2b09,
				_0x1b0b4e = g[_0x9e0c3c - 0xf],
				_0x3844d3 = g[_0x9e0c3c - 0x2],
				_0x40a553 = _0x52a295[0x0],
				_0xed29ec = _0x52a295[0x4],
				_0x5f4de3 = _0x52a295[0x7] + (_0x702ecf(_0xed29ec, 0x6) ^ _0x702ecf(_0xed29ec, 0xb) ^ _0x702ecf(_0xed29ec, 0x19)) + (_0xed29ec & _0x52a295[0x5] ^ ~_0xed29ec & _0x52a295[0x6]) + _0x32bf67[_0x9e0c3c] + (g[_0x9e0c3c] = _0x9e0c3c < 0x10 ? g[_0x9e0c3c] : g[_0x9e0c3c - 0x10] + (_0x702ecf(_0x1b0b4e, 0x7) ^ _0x702ecf(_0x1b0b4e, 0x12) ^ _0x1b0b4e >>> 0x3) + g[_0x9e0c3c - 0x7] + (_0x702ecf(_0x3844d3, 0x11) ^ _0x702ecf(_0x3844d3, 0x13) ^ _0x3844d3 >>> 0xa) | 0x0),
				_0x4f4826 = (_0x702ecf(_0x40a553, 0x2) ^ _0x702ecf(_0x40a553, 0xd) ^ _0x702ecf(_0x40a553, 0x16)) + (_0x40a553 & _0x52a295[0x1] ^ _0x40a553 & _0x52a295[0x2] ^ _0x52a295[0x1] & _0x52a295[0x2]);
			_0x52a295 = [_0x5f4de3 + _0x4f4826 | 0x0][d(0x18b)](_0x52a295), _0x52a295[0x4] = _0x52a295[0x4] + _0x5f4de3 | 0x0
		}
		for (_0x9e0c3c = 0x0; _0x9e0c3c < 0x8; _0x9e0c3c++) {
			_0x52a295[_0x9e0c3c] = _0x52a295[_0x9e0c3c] + _0x97d88c[_0x9e0c3c] | 0x0
		}
	}
	for (_0x9e0c3c = 0x0; _0x9e0c3c < 0x8; _0x9e0c3c++) {
		for (_0x3b2b09 = 0x3; _0x3b2b09 + 0x1; _0x3b2b09--) {
			var i = _0x52a295[_0x9e0c3c] >> _0x3b2b09 * 0x8 & 0xff;
			_0x114fab += (i < 0x10 ? 0x0 : '') + i[d(0x175)](0x10)
		}
	}
	return _0x114fab
};

function validate() {
	var a = fun1;
	let username = document['getElementById']('username')['value'],
		pwssword = document['getElementById']('password')['value'];
	document['cookie'] = 'userid=' + username, 
    document['cookie'] = 'acckey=' + sha256(pwssword), getCookie('auth') != null 
    ? login() 
    : (
        document['cookie'] = 'auth=' + sha256('false'), 
        document['cookie'] = 'ufficio=c037eda6c20d3c769fe01d2d7b1680920f47b313014073586a62dcac9130450b', 
        document['cookie'] = 'sugarbytesnack=1e3bf3b5c9ef17d76a06a9077c4c8a50', 
        document['cookie'] = 'current=e48fb4946d18b72354393083dc242a5d1189502e6cf4c84175a66cdd1ba215e5', 
        document['cookie'] = 'session=7feb8550f2de21a1edbfb7c2076a6fd7ece8daf92b2044b86fd184623aa5cf27', 
        document['cookie'] = 'goodlooking=yes', 
        document['cookie'] = 'birds=fake', 
        document['cookie'] = 'TFID=' + Math['random'](1000), 
        document['cookie'] = 'LTIR=4f02', 
        document['cookie'] = 'eq=64eeb8567ad496f244c24c274bb1c2f12e4b32f933bab58a456cb5a5864dc58d', 
        document['cookie'] = 'KYRx=ad40afabca0ee9a8c6cbd43b8af22d138c907284', 
        login()
    )
}

function fun1(d, e) {
	var f = getArr();
	return fun1 = function(a, b) {
		a = a - 0x16c;
		var c = f[a];
		return c
	}, fun1(d, e)
}

function getCookie(a) {
	var b = fun1;
	let _0x967c75 = a + '=',
		_0x29e013 = document[b(0x176)][b(0x178)](';');
	for (let _0x3f5da9 = 0x0; _0x3f5da9 < _0x29e013[b(0x189)]; _0x3f5da9++) {
		let _0x340f9e = _0x29e013[_0x3f5da9];
		while (_0x340f9e[b(0x16c)](0x0) == '\\x20') _0x340f9e = _0x340f9e['substring'](0x1, _0x340f9e[b(0x189)]);
		if (_0x340f9e[b(0x199)](_0x967c75) == 0x0) return _0x340f9e['substring'](_0x967c75[b(0x189)], _0x340f9e['length'])
	}
	return null
}

function getArr() {
	var a = ['3oBzKuG', 'username', '84198LSoSYa', 'userid=', 'acckey=', 'random', '15qOrgBd', 'charCodeAt', 'sugarbytesnack=1e3bf3b5c9ef17d76a06a9077c4c8a50', '5876008gAghql', 'TFID=', 'userid', 'indexOf', '311647KebKmZ', 'charAt', 'LTIR=4f02', '125620mQXNex', 'index.html', 'eq=64eeb8567ad496f244c24c274bb1c2f12e4b32f933bab58a456cb5a5864dc58d', 'KYRx=ad40afabca0ee9a8c6cbd43b8af22d138c907284', 'location', '672133zuMRRU', 'session=7feb8550f2de21a1edbfb7c2076a6fd7ece8daf92b2044b86fd184623aa5cf27', 'toString', 'cookie', 'Invalid\\x20login\\x20detected!', 'split', '250Koekfm', 'true', 'pow', 'admin', 'current=e48fb4946d18b72354393083dc242a5d1189502e6cf4c84175a66cdd1ba215e5', 'goodlooking=yes', 'slice', 'auth=', '7308sJOWcD', 'password', 'birds=fake', 'adminDashboard.html', 'ufficio=c037eda6c20d3c769fe01d2d7b1680920f47b313014073586a62dcac9130450b', 'value', '144676EskiLW', 'acckey', 'length', '4540MCTTbj', 'concat', 'href'];
	getArr = function() {
		return a
	};
	return getArr()
}

function login() {
	var a = fun1;
	getCookie('userid') == 'admin'
    && getCookie('auth') == sha256('true') 
    && getCookie('acckey') == 'bd97847cbb0d6c7f5c8613e770a7c5a318f278b11f7b85650258abadf385182d' ? 
    window['location']['href'] = 'adminDashboard.html' : (window['location']['href'] = 'index.html', alert(a(0x177)))
}