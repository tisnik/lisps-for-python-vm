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


; Běžná funkce zapisovaná ve stylu LISPu
(defn calculate-multiplication
    [x y]
    (* x y))


; Predikáty
(defn zero?
    [x]
    (= x 0))

(defn even?
    [x]
    (zero? (% x 2)))

(defn odd?
    [x]
    (not (even? x)))


; Konverzní funkce
(defn string->bool
    [s]
    (== s "true"))

(defn deg->rad
    [angle]
    (* angle (/ 3.1415 180)))


; Privátní funkce
(defn **hidden**
    [x]
    (+ x 1))

; Funkce psaná velkými písmeny
(defn *hidden*
    [x]
    (+ x 1))

