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

THE_ANSWER = 42


def multiply_two_numbers(x, y):
    return x * y


class uber_class:
    def __init__(self, x):
        self._x = x

    def compute_square(self):
        return self._x * self._x
