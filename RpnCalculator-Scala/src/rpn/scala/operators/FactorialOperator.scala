package rpn.scala.operators

class FactorialOperator extends UnaryOperator {
  val FACTORIAL = "!"

  def doOperation(value: Int): Int = {
    factorial(value)
  }

  def factorial(value: Int): Int = {
    if (value == 0) 1
    else value * doOperation(value - 1)
  }

  def handlesOperatorCharacter(operand: String): Boolean = { operand == FACTORIAL }

}