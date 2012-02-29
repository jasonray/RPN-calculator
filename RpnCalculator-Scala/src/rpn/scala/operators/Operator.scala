package rpn.scala.operators
import rpn.scala.RpnStack

trait Operator {
  def performOperation(numbers: RpnStack): Int
  def handlesOperatorCharacter(operand: String): Boolean
}