package rpn.operator;

import rpn.RpnStack;

public class ClearOperator implements Operator {

	private static final String C = "C";
	private static final String CLEAR = "CLEAR";

	@Override
	public int doOperation(RpnStack numbers) {
		while (!numbers.isEmpty())
			numbers.pop();
		return 0;
	}

	@Override
	public boolean handlesOperatorCharacter(String operand) {
		return C.contentEquals(operand.toUpperCase()) || CLEAR.contentEquals(operand.toUpperCase());

	}

}
