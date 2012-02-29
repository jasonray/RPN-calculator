package rpn.scala

import operators.AdditionOperator
import operators.Operator
import operators.SubtractionOperator

class RpnCalculator {
  private val numbers = new RpnStack
  private val registry = new OperatorRegistry()

  def enter(operand: Int): scala.Unit = {
    numbers.push(operand)
  }

  def perform(operatorCharacter: String): Int = {
    val operatorImplementation = registry.getOperator(operatorCharacter)
    if (operatorImplementation == null) throw new IllegalArgumentException("Unknown operator " + operatorCharacter);
    return operatorImplementation.performOperation(numbers);
  }
}