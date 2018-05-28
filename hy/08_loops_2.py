def pow2(n):
    from hy.contrib.loop import __trampoline__

    @__trampoline__
    def _;recur_fn|1236(i, sum):
        return sum if i == n else _;recur_fn|1236(i + 1, sum * 2)
    _;recur_fn|1235 = _;recur_fn|1236
    return _;recur_fn|1235(0, 1)


for n in range(0, 11):
    print(n, pow2(n))
print()
array = [1, 2, 3, 4, 5]
from hy.contrib.loop import __trampoline__


@__trampoline__
def _;recur_fn|1238(i, sum):
    return sum if i == 5 else _;recur_fn|1238(i + 1, sum + array[i])


_;recur_fn|1237 = _;recur_fn|1238
print(_;recur_fn|1237(0, 0))
print()


def power(x, y):
    from hy.contrib.loop import __trampoline__

    @__trampoline__
    def _;recur_fn|1240(exponent, current):
        return current if exponent == 0 else _;recur_fn|1240(exponent - 1, 
            x * current) if exponent > 0 else _;recur_fn|1240(exponent + 1,
            current / x)
    _;recur_fn|1239 = _;recur_fn|1240
    return _;recur_fn|1239(y, 1)


for n in range(0, 11):
    print(n, power(3, n))

