package rpn.scala.operators

class FibonacciOperator extends UnaryOperator {
  val FIB_OPERATOR = "fib"
  val FIBONACI_OPERATOR = "fibonaci"

  def doOperation(value: Int): Int = {
    fibonacci(value)
  }

  def fibonacci(n: Int): Int = {
    if (n == 0) 0
    else if (n == 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  }

  def handlesOperatorCharacter(operand: String): Boolean = {
    OperandComparer.areEqual(operand, FIBONACI_OPERATOR) ||
      OperandComparer.areEqual(operand, FIB_OPERATOR)
  }

}