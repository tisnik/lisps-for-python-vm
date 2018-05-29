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

(defmacro print-expression-1
    [expression]
    `(print '~expression))

; Makro, které na standardní výstup vypíše výraz a následně i
; hodnotu tohoto výrazu s použitím funkce pm (pretty print matrix).
; Předpokládá se, že se výraz vyhodnotí na vektor.
(defmacro print-expression-2
    [expression]
    `(do (print '~expression)
         (print ~expression)))

(print-expression-1 (* 6 7))

(print)

(print-expression-2 (* 6 7))

