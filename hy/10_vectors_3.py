from hy.core.language import first, flatten, last, rest
vektor = [1, 2, 3, 4]
vektor[1]
vektor[-1]
vektor[-2]
first(vektor)
last(vektor)
rest(vektor)
list(rest(vektor))
list(rest(vektor))
vektor[1:5]
vektor[1:]
vektor[-5:-2]
vektor[-3:-2]
vektor2 = list(range(20))
vektor2[2:-1:2]
vektor2[-1:0:-1]
vektor2[-1:0:-2]
vektor[2] = 42
vektor[10] = -1
vektor.append(5)
vektor.append(6)
matice = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
matice2 = [[1], [2, 3], [4, 5, 6], [7, 8, 9, 10]]
flatten(matice)
flatten(matice2)

