package rpn;

import rpn.operator.Operator;

public class Controller {
	private RpnStack numbers = new RpnStack();

	public Controller() {
	}

	public void enter(Integer operand) {
		numbers.push(operand);
	}

	public int perform(String operatorCharacter) {
		int result = 0;
		Operator operatorImplementation = OperatorFactory.getOperator(operatorCharacter);
		result = operatorImplementation.doOperation(numbers);
		return result;

	}

}
