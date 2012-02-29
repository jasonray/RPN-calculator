package rpn.scala.operators

import rpn.scala.RpnStack

class SubtractionOperator extends Operator {
  val MINUS = "-"
    
  def performOperation(numbers: RpnStack): Int = {
    val rhs = numbers.pop
    val lhs = numbers.pop
    val result = lhs - rhs
    numbers.push(result)
    return result
  }

  def handlesOperatorCharacter(operand: String): Boolean = {
    operand == MINUS;
  }

}