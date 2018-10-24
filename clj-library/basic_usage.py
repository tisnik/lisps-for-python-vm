from clj.seqs import count, first, second, rest, cons, concat, distinct


def hr():
    print(40*"-")
    print()


def print_sequence(sequence):
    for item in sequence:
        print(item)
    hr()


sequence = [1, 2, 3, 1, 2, 3]

print("Original:")
print_sequence(sequence)

# puvodni funkce len() a nova funkce count()
print("Len and count:")
print(len(sequence))
print(count(sequence))
hr()

# puvodni (standardni) funkce reversed()
print("Reversed:")
print_sequence(reversed(sequence))

# funkce first(), second() a rest()
print("First:")
print(first(sequence))
print("Second:")
print(second(sequence))
print("Rest:")
print(rest(sequence))
print_sequence(rest(sequence))

# nova funkce distinct()
print("Distinct items:")

print(distinct(sequence))
print_sequence(distinct(sequence))

# prevod sekvence zpet na seznam
print(list(distinct(sequence)))

# cons
print("Cons 1:")
new_sequence = cons(sequence, ["A", "B", "C"])
print_sequence(new_sequence)

print("Cons 2:")
new_sequence_2 = cons(["A", "B", "C"], sequence)
print_sequence(new_sequence_2)

# Concat
print("Concat 1:")
new_sequence = concat(sequence, ["A", "B", "C"])
print_sequence(new_sequence)

print("Concat 2:")
new_sequence_2 = concat(["A", "B", "C"], sequence)
print_sequence(new_sequence_2)
