package rpn.operator;

public class DivisionOperator extends BinaryOperator {

	@Override
	public boolean handlesOperand(String operand) {
		return operand.contentEquals("/");
	}

	@Override
	protected int doOperation(int lhs, int rhs) {
		return lhs / rhs;
	}

}
