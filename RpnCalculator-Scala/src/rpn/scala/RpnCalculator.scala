package rpn.scala

class RpnCalculator {
  var x = 0;
  val numbers = new RpnStack

  def enter(operand: Int): scala.Unit = {
    numbers.push(operand)
  }

  def perform(operator: String): Int = {
    val rhs = getNextOperand
    val lhs = getNextOperand

    var total = 0;
    if (operator == "+")
      total = lhs + rhs
    else if (operator == "-")
      total = lhs - rhs

    numbers.push(total)
    return total
  }

  private def getNextOperand() = numbers.pop
}