from hy import HyExpression, HyInteger, HyKeyword, HyString, HySymbol
positionX = 1
positionY = 2
positionZ = 3
HyExpression([])
HyExpression([] + [HyInteger(1)] + [HyInteger(2)] + [HyInteger(3)] + [
    HyInteger(4)])
HyExpression([] + [HyString('prvni')] + [HyString('druhy')] + [HyString(
    'treti')])
HyExpression([] + [HyKeyword('\ufdd0:prvni')] + [HyKeyword('\ufdd0:druhy')] +
    [HyKeyword('\ufdd0:treti')])
HyExpression([] + [HySymbol('positionX')] + [HySymbol('positionY')] + [
    HySymbol('positionZ')])
HyExpression([] + [HyExpression([] + [HySymbol('quote')] + [HyExpression([] +
    [HyKeyword('\ufdd0:x')] + [HyKeyword('\ufdd0:y')])])] + [HyExpression([
    ] + [HySymbol('quote')] + [HyExpression([] + [HyKeyword('\ufdd0:z')] +
    [HyKeyword('\ufdd0:w')])])])
[]
[1, 2, 3, 4]
['prvni', 'druhy', 'treti']
['\ufdd0:prvni', '\ufdd0:druhy', '\ufdd0:treti']
[positionX, positionY, positionZ]
()
1, 2, 3, 4
'prvni', 'druhy', 'treti'
'\ufdd0:prvni', '\ufdd0:druhy', '\ufdd0:treti'
{}
{'prvni': 'first', 'druhy': 'second', 'treti': 'third'}
{'X': positionX, 'y': positionY, 'z': positionZ}
{'prvni', 'druhy', 'treti'}

