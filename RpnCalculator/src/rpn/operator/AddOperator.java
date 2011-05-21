package rpn.operator;

import rpn.RpnStack;

public class AddOperator implements Operator {

	@Override
	public int doOperation(RpnStack numbers) {
		int result;
		Integer rhs = numbers.pop();
		Integer lhs = numbers.pop();

		result = lhs + rhs;
		numbers.push(result);
		return result;
	}

}
