package rpn.operator;

public class MultiplyOperator extends BinaryOperator {

	@Override
	protected int doOperation(int lhs, int rhs) {
		return lhs * rhs;
	}

}

