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
    new FibonacciOperator)

  def getOperator(operatorCharacter: String): Operator = {
    val supportedOperators = registry.filter(operator => operator.handlesOperatorCharacter(operatorCharacter))

    if (supportedOperators.size == 0)
      return null
    else
      return supportedOperators(0)
  }
}