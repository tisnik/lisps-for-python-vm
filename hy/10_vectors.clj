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

; Ukázka práce s poli (vektory).


; vektory nejsou neměnné (immutable) tak jako v Clojure!
(setv vektor [1 2 3 4])

; výraz pro přečtení prvku vektoru
(get vektor 1)
(get vektor -1)
(get vektor -2)

; speciální funkce pro významné prvky vektoru
(first vektor)
(last vektor)

; převod na sekvenci bez prvního prvku
(rest vektor)

; zpětný převod sekvence na vektor
(list (rest vektor))

; vylepšený způsob zápisu předchozího výrazu
(-> vektor rest list)

; získání subvektoru
(cut vektor 1 5)
(cut vektor 1)
(cut vektor -5 -2)
(cut vektor -3 -2)

(setv vektor2 (list (range 20)))

; sudé prvky
(cut vektor2 2 -1 2)

; otočení vektoru
(cut vektor2 -1 0 -1)

; otočení se získáním jen lichých prvků
(cut vektor2 -1 0 -2)

; změna prvku ve vektoru je možná
(assoc vektor 2 42)

; POZOR: vyhodí výjimku!
(assoc vektor 10 -1)

; přidání prvku do vektoru (na jeho konec)
(.append vektor 5)

; dvourozměrný vektor (matice)
(setv matice [[1 2 3] [4 5 6] [7 8 9]])

; nepravidelná matice
(setv matice2 [[1] [2 3] [4 5 6] [7 8 9 10]])

