from hy.core.language import inc, is_neg, reduce
from hy.core.shadow import *


def factorial(n):
    if is_neg(n):
        raise ValueError('natural number expected')
        _hy_anon_var_1 = None
    else:
        _hy_anon_var_1 = reduce(*, range(1, inc(n)))
    return _hy_anon_var_1


print(factorial(10))
for n in range(1, 11):
    print(n, factorial(n))
print(factorial(-10))

