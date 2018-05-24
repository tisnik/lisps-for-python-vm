from hy.core.language import inc
from math import sin, cos
s = 480


def spit(filename, content):
    _hy_anon_var_1 = None
    with open(filename, 'w') as fout:
        _hy_anon_var_1 = fout.write(content)
    return _hy_anon_var_1


from hy.contrib.loop import __trampoline__


@__trampoline__
def _;recur_fn|1236(i, R, G, B, out):
    r = 128 - i
    a = i / 12.0
    b = i + 80
    x = s / 2 + b * cos(a)
    y = s / 2 + b * sin(a)
    p = "<circle cx='" + str(x) + "' cy='" + str(y) + "' r='" + str(r) + "' "
    q = "fill='rgb(" + str(R) + ',' + str(G) + ',' + str(B
        ) + ")' style='fill-opacity:.06'/>\n"
    return _;recur_fn|1236(inc(i), R - 2, G, B + 2, out + p + q + p +
        """fill='none' stroke='black'/>
""") if i < 128 else out


_;recur_fn|1235 = _;recur_fn|1236
spit('logo.svg', 
    "<svg xmlns='http://www.w3.org/2000/svg' version='1.1' width='" + str(s
    ) + "' height='" + str(s) + "'>" + _;recur_fn|1235(0, 255, 255, 0, '') +
    '</svg>')

