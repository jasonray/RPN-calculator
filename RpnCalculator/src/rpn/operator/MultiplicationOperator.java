package rpn.operator;

public class MultiplicationOperator extends BinaryOperator {

	private static final String MULTIPLY = "*";

	@Override
	protected int doOperation(int lhs, int rhs) {
		return lhs * rhs;
	}

	@Override
	public boolean handlesOperand(String operand) {
		return MULTIPLY.contentEquals(operand);
	}

}
