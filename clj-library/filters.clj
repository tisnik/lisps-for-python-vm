(def s (range 1 10))

; kratky zapis anonymni funkce pomoci #()
(def filtered (filter #(zero? (mod % 3)) s))
(println filtered)

; kratky zapis anonymni funkce pomoci #()
(def removed (remove #(zero? (mod % 3)) s))
(println removed)

; zde nelze kratky zapis pouzit - musi se specifikovat argument
(def filtered (filter (fn [x] true) s))
(println filtered)

; zde nelze kratky zapis pouzit - musi se specifikovat argument
(def removed (remove (fn [x] true) s))
(println removed)
