package rpn.scala
import rpn.scala.operators._

class OperatorRegistry {
  val registry = List[Operator](
    new AdditionOperator,
    new SubtractionOperator,
    new AbsoluteOperator,
    new SumOperator,
    new ClearOperator,
    new FactorialOperator,
    new FibonacciOperator
  )

  def getOperator(operatorCharacter: String): Operator = {
    var operatorToUse: Operator = null
    for (operator <- registry) {
      if (operator.handlesOperatorCharacter(operatorCharacter))
        operatorToUse = operator;
    }
    return operatorToUse;
  }
}