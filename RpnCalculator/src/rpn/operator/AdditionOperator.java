package rpn.operator;

public class AdditionOperator extends BinaryOperator {

	@Override
	protected int doOperation(int lhs, int rhs) {
		return lhs + rhs;
	}

}
