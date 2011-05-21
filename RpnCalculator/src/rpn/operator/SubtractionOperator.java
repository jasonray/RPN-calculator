package rpn.operator;

public class SubtractionOperator extends BinaryOperation {

	@Override
	protected int doOperation(int lhs, int rhs) {
		return lhs - rhs;
	}

	@Override
	public boolean handlesOperatorCharacter(String character) {
		return character.contentEquals("-");
	}

}
