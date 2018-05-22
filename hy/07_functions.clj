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

; Test překladu deklarace funkcí

; anonymní funkce
(fn [x y] (+ x y))

; funkce navázaná na symbol == pojmenovaná funkce
(defn add
    [x y]
    (+ x y))

; lokální symboly (proměnné)
(defn add-abs
    [x y]
    (setv abs-x (if (< x 0) (- x) x))
    (setv abs-y (if (< y 0) (- y) y))
    (+ abs-x abs-y))

(defn inc
    [num]
    (+ num 1))

(print (add-abs -10 -20))
