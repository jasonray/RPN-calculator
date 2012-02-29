package rpn.scala.operators

import rpn.scala.RpnStack

abstract class BinaryOperator extends Operator {

  def performOperation(numbers: RpnStack): Int = {
    val rhs = numbers.pop
    val lhs = numbers.pop

    val result = doOperator(lhs, rhs)

    numbers.push(result)
    return result
  }

  def doOperator(lhs: Int, rhs: Int): Int;

}