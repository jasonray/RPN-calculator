package rpn.operator;

import rpn.RpnStack;

public class AbsoluteOperator implements Operator {

	@Override
	public int doOperation(RpnStack numbers) {
		int n = numbers.pop();
		int result = getAbsolute(n);
		numbers.push(result);
		return result;
	}

	private int getAbsolute(int n) {
		int result;
		if (n > 0)
			result = n;
		else if (n < 0)
			result = -1 * n;
		else
			result = n;
		return result;
	}

	@Override
	public boolean handlesOperatorCharacter(String operand) {
		return operand.contentEquals("||");
	}

}
