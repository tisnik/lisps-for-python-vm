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

; Ukázka práce se slovníky.

; mapování typu string-string
{"prvni" "first" "druhy" "second" "treti" "third"}

(setv d1 {:id 1 :name "Eda" :surname "Wasserfall"})

(get d1 :name)
(get d1 :xyname)

(setv d2 {:id 1 :name "Eda" :surname "Wasserfall" :actors ["Genadij Rumlena" "Pavel Vondruška"]})
(get d2 :actors 1)
(get d2 :actors 0)

(setv d3 {})
(assoc d3 :id 10)
(assoc d3 :name "Eda")
(assoc d3 :surname "Wasserfall")

(del (get d3 :surname))

(dict-comp x (str x) [x (range 1 11)])

(dict-comp x (* x x) [x (range 1 11)])

(dict-comp x (str x) [x (range 1 11)] (even? x))

(dict-comp x (str x) [x (range 1 11)] (odd? x))

(dict-comp x (* x x) [x (range 1 11)])

(defn div3 [n] (= 0 (% n 3)))

(dict-comp x (* x x) [x (range 1 11)] (div3 x))

(dict (zip [:id :name :surname] [1 "Eda" "Wasserfall"]))

(-> (zip (range 10) (range 10 1 -1)) dict)
