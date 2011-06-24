package rpn.operator;

public class AdditionOperator extends BinaryOperator {

	private static final String PLUS = "+";

	@Override
	protected int doOperation(int lhs, int rhs) {
		return lhs + rhs;
	}

	@Override
	public boolean handlesOperand(String operand) {
		return PLUS.contentEquals(operand);
	}

}
