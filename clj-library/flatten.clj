(def colors ["red", "blue", "green", "yellow", "cyan", "magenta", "black", "white"])
(def c1 [colors [1 [2 [3 [4 [5 6 7 8 9]]]]]])
(def c2 [[c1] c1])

(println (flatten colors))
(println (flatten c1))
(println (flatten c2))

