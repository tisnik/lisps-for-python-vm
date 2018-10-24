from clj.seqs import count, range, take_while, remove


def hr():
    print(40*"-")
    print()


def print_sequence(sequence):
    for item in sequence:
        print(item)
    hr()


sequence = range()

# toto NE: print(count(sequence))

print("Vyber prvku mensich nez 10 ze vsech prirozenych cisel:")

new_sequence_1 = take_while(lambda x: x < 10, sequence)
print_sequence(new_sequence_1)


def podminka(x):
    return x < 10


sequence = range()

print("Vyber prvku mensich nez 10 ze vsech prirozenych cisel:")

new_sequence_2 = take_while(podminka, sequence)
print_sequence(new_sequence_2)

print("Vyber prvku delitelnych tremi a mensich nez 20 ze vsech prirozenych cisel:")

# nekonecna lazy sekvence
sequence = range()

# lze ji filtrovat
filtered = filter(lambda x: x % 3 == 0, sequence)

# a vybrat n prvku z nekonecneho poctu
new_sequence = take_while(lambda x: x < 20, filtered)
print_sequence(new_sequence)


print()

print("Kombinace remove() a take_while():")

# nekonecna lazy sekvence
sequence = range()

# lze ji filtrovat
removed = remove(lambda x: x % 3 != 0, sequence)

# a vybrat n prvku z nekonecneho poctu
new_sequence = take_while(lambda x: x < 30, removed)
print_sequence(new_sequence)

print()

print("Predikat vracejici vzdy False:")

# nekonecna lazy sekvence
sequence = range()

# predikat ktery vzdy vraci False
new_sequence = take_while(lambda _: False, sequence)
print_sequence(new_sequence)
