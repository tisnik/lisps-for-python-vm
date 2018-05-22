; Examples for Hy: a dialect of the Lisp programming language designed to interact with Python
;
;  (C) Copyright 2018  Pavel Tisnovsky
;
;  All rights reserved. This program and the accompanying materials
;  are made available under the terms of the Eclipse Public License v1.0
;  which accompanies this distribution, and is available at
;  http://www.eclipse.org/legal/epl-v10.html
;
;  Contributors:
;      Pavel Tisnovsky
;

; Test překladu programových smyček

(require [hy.contrib.loop [loop]])


; funkce pro výpočet n-té mocniny dvojky
(defn pow2
    [n]
    (loop [[i 0] [sum 1]]
        (if (= i n)                       ; podmínka pro ukončení smyčky
            sum                           ; návratová hodnota při splnění podmínky
            (recur (+ i 1) (* sum 2)))))  ; rekurze (s TCO)


(for [n (range 0 11)]
    (print n (pow2 n)))

(print)


; příklad pro výpočet sumy pole
(setv array [1 2 3 4 5])


(print
    (loop [[i 0] [sum 0]]
        (if (= i 5)            ; podmínka pro ukončení smyčky
            sum                ; návratová hodnota při splnění podmínky
            (recur (+ i 1) (+ sum (get array i) ))))  ; rekurze (s TCO)
)

(print)


(defn power
    [x y]
    (loop [[exponent y]
           [current 1]]
        (if (= exponent 0)
            current
            (if (> exponent 0)
                (recur (- exponent 1) (* x current))
                (recur (+ exponent 1) (/ current x))))))


(for [n (range 0 11)]
    (print n (power 3 n)))
