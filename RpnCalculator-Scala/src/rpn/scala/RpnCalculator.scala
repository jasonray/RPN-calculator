package rpn.scala

import operators.AddOperator
import operators.Operator
import operators.SubtractOperator

class RpnCalculator {
  private val numbers = new RpnStack

  def enter(operand: Int): scala.Unit = {
    numbers.push(operand)
  }

  def perform(operatorCharacter: String): Int = {
    val registry = new OperatorRegistry()
    val operator = registry.getOperator(operatorCharacter)
    return operator.performOperation(numbers);
  }
}