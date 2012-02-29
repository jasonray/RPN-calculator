package rpn.scala.operators

import rpn.scala.RpnStack

class SubtractionOperator extends BinaryOperator {
  val MINUS = "-"

  def doOperator(lhs: Int, rhs: Int): Int = {
    lhs - rhs
  }

  def handlesOperatorCharacter(operand: String): Boolean = {
    OperandComparer.areEqual(operand, MINUS)

  }

}