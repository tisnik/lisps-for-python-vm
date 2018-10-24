(def s (range 1 10))

(def colors ["red", "blue", "green", "yellow", "cyan", "magenta", "black", "white"])

(println (interleave s colors))

(println)

(println (interleave s colors (repeat 10 "*")))
