package rpn.operator;

import java.util.Stack;

import rpn.RpnStack;

public class ReverseOperator implements Operator {

	@Override
	public int doOperation(RpnStack numbers) {
		Stack<Integer> tempStackA = new Stack<Integer>();
		Stack<Integer> tempStackB = new Stack<Integer>();
		reverseCopyStack(numbers, tempStackA);
		reverseCopyStack(tempStackA, tempStackB);
		reverseCopyStack(tempStackB, numbers);
		return numbers.peek();
	}

	private void reverseCopyStack(Stack<Integer> from, Stack<Integer> to) {
		while (!from.isEmpty())
			to.push(from.pop());
	}

	@Override
	public boolean handlesOperand(String operand) {
		return "REVERSE".contentEquals(operand.toUpperCase()) || "REV".contentEquals(operand.toUpperCase());
	}

}
