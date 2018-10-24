from clj.seqs import remove


def hr():
    print(40*"-")
    print()


def print_sequence(sequence):
    for item in sequence:
        print(item)
    hr()


sequence = range(1, 10)

print("Original:")
print_sequence(sequence)

filtered = filter(lambda x: x % 3 == 0, sequence)
print("Filtered:")
print_sequence(filtered)

removed = remove(lambda x: x % 3 == 0, sequence)
print("Removed:")
print_sequence(removed)

filtered = filter(lambda _: True, sequence)
print("Filtered:")
print_sequence(filtered)

removed = remove(lambda _: True, sequence)
print("Removed:")
print_sequence(removed)
