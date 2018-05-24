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

; rekurzivní výpočet faktoriálu - TCO

(require [hy.contrib.loop [loop]])

(defn factorial
    [n]
    (loop [[cnt n]
           [acc 1]]
        (if (zero? cnt)
             acc
             (recur (dec cnt) (* acc cnt)))))

(print (factorial 10))

(for [n (range 1 11)]
     (print n (factorial n)))
