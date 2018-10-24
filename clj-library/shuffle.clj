(def colors ["red", "blue", "green", "yellow", "cyan", "magenta", "black", "white"])

(dotimes [n 10]
    (println (shuffle colors)))
