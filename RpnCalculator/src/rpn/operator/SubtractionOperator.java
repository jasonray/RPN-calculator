package rpn.operator;

public class SubtractionOperator extends BinaryOperator {

	@Override
	protected int doOperation(int lhs, int rhs) {
		return lhs - rhs;
	}

	@Override
	public boolean handlesOperand(String operand) {
		return operand.contentEquals("-");
	}

}
