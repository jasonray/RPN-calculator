package rpn.scala.operators

class ClearOperator extends FullStackOperator {
  val C = "C"
  val CLEAR = "CLEAR"

  def continueOperator(value: Int): Int = { 0; }

  def handlesOperatorCharacter(operand: String): Boolean = {
    OperandComparer.areEqual(operand, C) ||
        OperandComparer.areEqual(operand, CLEAR)

  }

}