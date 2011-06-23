package rpn.operator;

public class AddOperator extends BinaryOperator {

	@Override
	protected int doOperation(int lhs, int rhs) {
		return lhs + rhs;
	}

}
