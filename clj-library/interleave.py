from clj.seqs import interleave, repeat

def hr():
    print(40*"-")
    print()


def print_sequence(sequence):
    for item in sequence:
        print(item)
    hr()


sequence1 = range(1, 10)
sequence2 = ["red", "blue", "green", "yellow", "magenta", "cyan", "white", "black"]

print("Two sequences interleaved:")
print_sequence(interleave(sequence1, sequence2))

print("Three sequences interleaved:")
print_sequence(interleave(sequence1, sequence2, repeat("*", 10)))
