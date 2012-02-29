package rpn.scala.operators
import rpn.scala.RpnStack

class SumOperator extends FullStackOperator {
  val SUM = "SUM"
  var cumlativeSum = 0;

  def continueOperator(value: Int): Int = {
    cumlativeSum += value;
    return cumlativeSum
  }

  def handlesOperatorCharacter(operand: String): Boolean = {
    OperandComparer.areEqual(operand, SUM)
  }

}