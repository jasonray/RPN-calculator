package rpn.operator;

public class SubtractionOperator extends BinaryOperator {

	private static final String MINUS = "-";

	@Override
	protected int doOperation(int lhs, int rhs) {
		return lhs - rhs;
	}

	@Override
	public boolean handlesOperatorCharacter(String operand) {
		return MINUS.contentEquals(operand);
	}

}
