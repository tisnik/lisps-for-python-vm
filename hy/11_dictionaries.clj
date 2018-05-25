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

(dict-comp x (str x) [x (range 1 11)])

(dict-comp x (* x x) [x (range 1 11)])

(dict-comp x (str x) [x (range 1 11)] (even? x))

(dict-comp x (str x) [x (range 1 11)] (odd? x))

(dict-comp x (* x x) [x (range 1 11)])

(defn div3 [n] (= 0 (% n 3)))

(dict-comp x (* x x) [x (range 1 11)] (div3 x))

