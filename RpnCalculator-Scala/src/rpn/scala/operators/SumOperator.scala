package rpn.scala.operators
import rpn.scala.RpnStack

class SumOperator extends Operator {
  val SUM = "SUM"

  def performOperation(numbers: RpnStack): Int = {
    var sum = 0;
    while (!numbers.isEmpty()) 
      sum += numbers.pop();
    return sum;
  }

  def handlesOperatorCharacter(operand: String): Boolean = {
    operand.toLowerCase() == SUM.toLowerCase();
  }

}