package rpn.scala

class RpnStack {
  private val stack = new scala.collection.mutable.Stack[Int]

  def push(n: Int): Unit = stack.push(n)
  def pop() = if (stack.isEmpty) 0 else stack.pop
  def peek() = if (stack.isEmpty) 0 else stack.top
  def isEmpty() = stack.isEmpty
}