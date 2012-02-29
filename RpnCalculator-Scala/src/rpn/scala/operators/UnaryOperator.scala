package rpn.scala.operators
import rpn.scala.RpnStack

abstract class UnaryOperator extends Operator {
  def performOperation(numbers: RpnStack): Int = {
    val value = numbers.pop

    val result = doOperation(value)

    numbers.push(result)
    return result
  }

  def doOperation(value: Int): Int;

}