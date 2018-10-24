from clj.seqs import shuffle

colors = ["red", "blue", "green", "yellow", "magenta", "cyan", "white", "black"]

for i in range(1, 10):
    print(list(shuffle(colors)))
