from hy.core.language import dec, is_zero


def factorial(n):
    from hy.contrib.loop import __trampoline__

    @__trampoline__
    def _;recur_fn|1236(cnt, acc):
        return acc if is_zero(cnt) else _;recur_fn|1236(dec(cnt), acc * cnt)
    _;recur_fn|1235 = _;recur_fn|1236
    return _;recur_fn|1235(n, 1)


print(factorial(10))
for n in range(1, 11):
    print(n, factorial(n))

