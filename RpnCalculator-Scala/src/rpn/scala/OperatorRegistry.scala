package rpn.scala
import rpn.scala.operators._


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