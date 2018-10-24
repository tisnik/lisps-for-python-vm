from clj.seqs import group_by

sequence = range(1, 100)

print(group_by(lambda x: x % 3, sequence))

groups = group_by(lambda x: x % 3, sequence)

keys = sorted(groups.keys())

for key in keys:
    print(key, groups[key])

print(3 * "\n")

colors = ["red", "blue", "green", "yellow", "cyan", "magenta", "black", "white"]

groups = group_by(lambda color: len(color), colors)
print(groups)
