from hy.core.language import inc
lambda x, y: x + y


def add(x, y):
    return x + y


def add_abs(x, y):
    abs_x = -x if x < 0 else x
    abs_y = -y if y < 0 else y
    return abs_x + abs_y


def inc(num):
    return num + 1


print(add_abs(-10, -20))

