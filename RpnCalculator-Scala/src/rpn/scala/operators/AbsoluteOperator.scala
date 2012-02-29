package rpn.scala.operators

import rpn.scala.RpnStack

class AbsoluteOperator extends Operator {
  val ABSOLUTE = "||"

  def performOperation(numbers: RpnStack): Int = {
    val n = numbers.pop();
    val result = {
      if (isPositive(n))
        n
      else
        changeSign(n)
    }
    numbers.push(result);
    return result
  }

  def handlesOperatorCharacter(operand: String): Boolean = {
    operand == ABSOLUTE;
  }

  def changeSign(n: Int) = { -1 * n }

  private def isPositive(n: Int): Boolean = {
    n > 0
  }

}