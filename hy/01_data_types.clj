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

; Základní datové typy


; "not in list"
None
;; clojure: nil


; pravdivostní hodnoty
True
;; clojure: true

False
;; clojure: false


; numerické hodnoty
;   celá čísla
42
0x2a
0o52
0b00101010

;   čísla s plovoucí řádovou čárkou
3.14

;   komplexní čísla
1+2j
3j

;   zlomky
2/3


; řetězce
"Hello world!"
u"Hello world!"
r"Hello world!"

; "here" řetězce
#[[
 -------
< Lisp! >
 -------
  \
   \   \_\_    _/_/
    \      \__/
           (oo)\_______
           (__)\       )\/\
               ||----w |
               ||     ||
]]

#[---[
 -------
< Lisp! >
 -------
  \
   \   \_\_    _/_/
    \      \__/
           (oo)\_______
           (__)\       )\/\
               ||----w |
               ||     ||
]---]

; klíčová slova (speciální třída symbolů)
:keyword

