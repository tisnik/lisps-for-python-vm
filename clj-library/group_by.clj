(def s (range 1 100))

(def groups (group-by #(mod % 3) s))

(def k (sort (keys groups)))

(doseq [key k]
    (println key (get groups key)))

(println "\n\n\n")

(def colors ["red", "blue", "green", "yellow", "cyan", "magenta", "black", "white"])

(def groups (group-by #(count %) colors))

(println groups)
