from clj.seqs import flatten

colors = ["red", "blue", "green", "yellow", "cyan", "magenta", "black", "white"]
c1 = [colors, [1, [2, [3, [4, [5, 6, 7, 8, 9]]]]]]
c2 = [[c1], c1]

print(list(colors))
print(list(flatten(colors)))
print()

print(list(c1))
print(list(flatten(c1)))
print()

print(list(c2))
print(list(flatten(c2)))
