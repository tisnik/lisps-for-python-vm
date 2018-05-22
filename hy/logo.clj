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

; vykreslení vektorového loga do souboru (formát SVG)

(require [hy.contrib.loop [loop]])
(import [math [sin cos]])

(setv s 480)

(defn spit
    [filename content]
    (with [fout (open filename "w")]
        (.write fout content)))

(->>
    (+ "<svg xmlns='http://www.w3.org/2000/svg' version='1.1' width='" (str s) "' height='" (str s) "'>"
         (loop [[i 0] [R 255] [G 255] [B 0] [out ""]]
             (setv r (- 128 i)
                   a (/ i 12.)
                   b (+ i 80)
                   x (+ (/ s 2) (* b (cos a)))
                   y (+ (/ s 2) (* b (sin a)))
                   p (+ "<circle cx='" (str x) "' cy='" (str y) "' r='" (str r) "' ")
                   q (+ "fill='rgb(" (str R) "," (str G) "," (str B) ")' style='fill-opacity:.06'/>\n"))
             (if (< i 128)
                 (recur (inc i) (- R 2) G (+ B 2) (+ out p q p "fill='none' stroke='black'/>\n"))
                 out))
         "</svg>")
    (spit "logo.svg"))

