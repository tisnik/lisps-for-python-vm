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

; Test překladu podmínek

(setv variableA 10)
(setv variableB 20)
(setv variableC 30)
(setv variableD 40)
(setv variableE 50)
(setv variableF 60)


; na základě podmínky se vyhodnotí (a vrátí jako výsledek)
; buď řetězec "mensi" nebo "vetsi"
(if (< variableA variableB) "mensi" "vetsi")

; větev "else" lze vynechat, vrací se nil resp. jeho ekvivalent
(if (< variableA variableB) "mensi")

; samotná speciální forma if může být volána uvnitř složitějšího výrazu
(* 84 (if (= variableA variableB) (+ variableC variableD) (/ variableE variableF)))

; vnořené formy if
(if (< variableA 0)     "negative"
    (if (> variableA 0) "positive"
                        "zero"))

; speciální forma cond
(cond
    [(< variableA 0) "negative"]
    [(> variableA 0) "positive"]
    [:else "zero"])

