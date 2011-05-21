package rpn.operator;

public class DivisionOperator extends BinaryOperation {

	@Override
	public boolean handlesOperatorCharacter(String character) {
		return character.contentEquals("/");
	}

	@Override
	protected int doOperation(int lhs, int rhs) {
		return lhs / rhs;
	}

}
