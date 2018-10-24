(def my-sequence (range))

; prvni pouziti nekonecne sekvence
(println (take-while #(< % 10) my-sequence))

; druhe pouziti nekonecne sekvence
(println (take-while #(< % 10) my-sequence))

; false se vrati ihned v prvnim volani
(println (take-while (fn [x] false) my-sequence))
