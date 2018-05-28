from hy.core.language import is_even, is_odd
{'prvni': 'first', 'druhy': 'second', 'treti': 'third'}
d1 = {'\ufdd0:id': 1, '\ufdd0:name': 'Eda', '\ufdd0:surname': 'Wasserfall'}
d1['\ufdd0:name']
d1['\ufdd0:xyname']
{x: str(x) for x in range(1, 11)}
{x: (x * x) for x in range(1, 11)}
{x: str(x) for x in range(1, 11) if is_even(x)}
{x: str(x) for x in range(1, 11) if is_odd(x)}
{x: (x * x) for x in range(1, 11)}


def div3(n):
    return 0 == n % 3


{x: (x * x) for x in range(1, 11) if div3(x)}

