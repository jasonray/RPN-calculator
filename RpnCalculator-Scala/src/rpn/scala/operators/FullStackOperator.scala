package rpn.scala.operators
import rpn.scala.RpnStack

abstract class FullStackOperator extends Operator {
  def performOperation(numbers: RpnStack): Int = {
    var result = 0;
    while (!numbers.isEmpty())
      result = continueOperator(numbers.pop())

    numbers.push(result)
    return result
  }

  def continueOperator(value: Int): Int;

}