(def s [1 2 3 1 2 3])

(println "Count:")
(println (count s))
(println)

(println "Reversed:")
(println (reverse s))

(println "First:")
(println (first s))
(println "Second:")
(println (second s))
(println "Rest:")
(println (rest s))

(println "Distinct items:")

(println (distinct s))

(println "Cons 1:")
(def new_sequence (cons s ["A" "B" "C"]))
(println new_sequence)

(println "Cons 2:")
(def new_sequence_2 (cons ["A" "B" "C"] s))
(println new_sequence_2)

(println "Concat 1:")
(def new_sequence (concat s ["A" "B" "C"]))
(println new_sequence)

(println "Concat 2:")
(def new_sequence_2 (concat ["A" "B" "C"] s))
(println new_sequence_2)
