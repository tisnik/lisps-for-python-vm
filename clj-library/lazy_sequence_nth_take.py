from clj.seqs import nth, take, range


def hr():
    print(40*"-")
    print()


def print_sequence(sequence):
    for item in sequence:
        print(item)
    hr()


sequence = range()

item = nth(sequence, 10)
print(item)

# pozor na rozdilne chovani!
item = nth(sequence, 10)
print(item)

item = nth(sequence, 10)
print(item)

sequence = range()
s1 = take(10, sequence)
s2 = take(10, sequence)
s3 = take(10, sequence)
print(list(s1))
print(list(s2))
print(list(s3))
