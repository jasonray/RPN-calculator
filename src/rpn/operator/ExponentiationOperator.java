package rpn.operator;

public class ExponentiationOperator extends BinaryOperator {

	private static final String POWER = "^";

	@Override
	public boolean handlesOperatorCharacter(String operand) {
		return POWER.contentEquals(operand);
	}

	@Override
	protected int doOperation(int lhs, int rhs) {
		int product = 1;
		if (rhs > 0)
			for (int i = 0; i < rhs; i++)
				product = product * lhs;
		else if (rhs < 0)
			product = 1 / doOperation(lhs, -1 * rhs);
		return product;
	}

}
