package rpn.scala.operators

import rpn.scala.RpnStack

class AbsoluteOperator extends UnaryOperator {
  val ABSOLUTE = "||"

  def doOperation(n: Int): Int = {

    if (isPositive(n))
      n
    else
      changeSign(n)

  }

  def handlesOperatorCharacter(operand: String): Boolean = {
    OperandComparer.areEqual(operand, ABSOLUTE)
  }

  def changeSign(n: Int) = { -1 * n }

  private def isPositive(n: Int): Boolean = {
    n > 0
  }

}