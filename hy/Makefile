# Examples for Hy: a dialect of the Lisp programming language designed to interact with Python
#
#  (C) Copyright 2018  Pavel Tisnovsky
#
#  All rights reserved. This program and the accompanying materials
#  are made available under the terms of the Eclipse Public License v1.0
#  which accompanies this distribution, and is available at
#  http://www.eclipse.org/legal/epl-v10.html
#
#  Contributors:
#      Pavel Tisnovsky
#

HY_PATH=~/.local/bin

# seznam vsech zdrojovych kodu
SOURCES := $(wildcard *.clj)

# seznam souboru, ktere se maji vygenerovat
GENERATED_PY2 := $(patsubst %.clj,%_2.py,$(SOURCES))
GENERATED_PY3 := $(patsubst %.clj,%_3.py,$(SOURCES))

all: ${GENERATED_PY2} ${GENERATED_PY3}

clean:
	rm *.py

%_2.py:	%.clj
	${HY_PATH}/hy2py $< > $@

%_3.py:	%.clj
	${HY_PATH}/hy2py3 $< > $@

.PHONY: clean

