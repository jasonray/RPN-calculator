package rpn.scala.operators

object OperandComparer {
  def areEqual(operand: String, operatorSupported: String): Boolean = {
    if (operand == null)
      false
    else if (operatorSupported == null)
      false
    else
      operand.compareToIgnoreCase(operatorSupported) == 0
  }

}