package rpn.scala.operators

import rpn.scala.RpnStack

class AdditionOperator extends Operator {
  val PLUS = "+";

  def performOperation(numbers: RpnStack): Int = {
    val rhs = numbers.pop
    val lhs = numbers.pop
    val result = lhs + rhs
    numbers.push(result)
    return result
  }

  def handlesOperatorCharacter(operand: String): Boolean = {
    operand == PLUS;
  }

}