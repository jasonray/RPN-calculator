package rpn.scala.operators

import rpn.scala.RpnStack

class AdditionOperator extends BinaryOperator {
  val PLUS = "+";

  def doOperator(lhs: Int, rhs: Int): Int = {
    lhs + rhs
  }

  def handlesOperatorCharacter(operand: String): Boolean = {
    OperandComparer.areEqual(operand, PLUS)
  }

}