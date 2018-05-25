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

; Interoperabilita mezi jazyky Hy a Python


(import [datetime [date :as d]])

(setv date (d 2018 02 28))
(print date)
(print date.year)
(print date.month)
(print date.day)

(setv now1 (.today d))
(print now1)
(setv now2 (d.today))
(print now2)

(print "-------------------------------")


(import [test_module [*]])

(print THE_ANSWER)
(print *the-answer*)
(print (multiply_two_numbers 6 7))
(print (multiply-two-numbers 6 7))

(print "-------------------------------")


(import [test_module :as t])

(print t.THE_ANSWER)
(print t.*the-answer*)
(print (t.multiply_two_numbers 6 7))
(print (t.multiply-two-numbers 6 7))

(print "-------------------------------")


(setv u (uber_class 42))
(print u)
(print (u.compute_square))
(print (.compute_square u))
