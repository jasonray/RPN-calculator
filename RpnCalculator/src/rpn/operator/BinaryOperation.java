package rpn.operator;

import rpn.RpnStack;

public abstract class BinaryOperation implements Operator {

	@Override
	public int doOperation(RpnStack numbers) {
		int result;
		Integer rhs = numbers.pop();
		Integer lhs = numbers.pop();

		result = doOperation(lhs, rhs);
		numbers.push(result);
		return result;
	}

	protected abstract int doOperation(int lhs, int rhs);

}
