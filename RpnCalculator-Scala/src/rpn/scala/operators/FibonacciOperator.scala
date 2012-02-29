package rpn.scala.operators

class FibonacciOperator extends UnaryOperator {
  val FIBONNACI_OPERATOR = "fib"

  def doOperation(value: Int): Int = {
    fibonnaci(value)
  }

  def fibonnaci(n: Int): Int = {
    if (n == 0) 0
    else if (n == 1) 1
    else fibonnaci(n - 1) + fibonnaci(n - 2)

  }

  def handlesOperatorCharacter(operand: String): Boolean = {
    operand.toLowerCase() == FIBONNACI_OPERATOR
  }

}