package rpn.scala.operators

class FibonacciOperator extends UnaryOperator {
  val FIBONACI_OPERATOR = "fib"

  def doOperation(value: Int): Int = {
    fibonacci(value)
  }

  def fibonacci(n: Int): Int = {
    if (n == 0) 0
    else if (n == 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  }

  def handlesOperatorCharacter(operand: String): Boolean = {
    operand.toLowerCase() == FIBONACI_OPERATOR
  }

}