package rpn.scala
import operators.AddOperator
import operators.Operator
import operators.SubtractOperator

class OperatorRegistry {
  def getOperator(operatorCharacter: String): Operator = {
    if (operatorCharacter == "+")
      new AddOperator
    else if (operatorCharacter == "-")
      new SubtractOperator
    else
      null;
  }
}