package rpn.operator;

public class DivisionOperator extends BinaryOperator {

	@Override
	protected int doOperation(int lhs, int rhs) {
		return lhs / rhs;
	}

}
