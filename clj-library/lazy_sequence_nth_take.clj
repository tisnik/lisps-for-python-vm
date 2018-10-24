(def s (range))

(println (nth s 10))
(println (nth s 10))
(println (nth s 10))

(println (take 10 s))

(println (take 5 (drop  10 s)))

(->> (range) (drop 10) (take 5) println)
