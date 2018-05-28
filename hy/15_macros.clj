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

