from hy import HyExpression, HyInteger, HySymbol
import hy
hy.macros.macro('print_expression_1')(lambda &name, expression:
    HyExpression([] + [HySymbol('print')] + [HyExpression([] + [HySymbol(
    'quote')] + [expression])]))
import hy
hy.macros.macro('print_expression_2')(lambda &name, expression:
    HyExpression([] + [HySymbol('do')] + [HyExpression([] + [HySymbol(
    'print')] + [HyExpression([] + [HySymbol('quote')] + [expression])])] +
    [HyExpression([] + [HySymbol('print')] + [expression])]))
print(HyExpression([] + [HySymbol('*')] + [HyInteger(6)] + [HyInteger(7)]))
print()
print(HyExpression([] + [HySymbol('*')] + [HyInteger(6)] + [HyInteger(7)]))
print(6 * 7)

