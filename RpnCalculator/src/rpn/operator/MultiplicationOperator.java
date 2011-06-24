package rpn.operator;

public class MultiplicationOperator extends BinaryOperator {

	@Override
	protected int doOperation(int lhs, int rhs) {
		return lhs * rhs;
	}

}

