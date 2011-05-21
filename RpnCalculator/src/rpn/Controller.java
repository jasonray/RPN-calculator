package rpn;

import java.util.List;

import rpn.operator.Operator;

public class Controller {
	private RpnStack numbers = new RpnStack();
	private List<Operator> operatorRegistry = OperatorRegistry.getRegistry();

	public void enter(Integer operand) {
		numbers.push(operand);
	}

	public int perform(String operatorCharacter) {
		int result = 0;
		for (Operator operator : operatorRegistry) {
			if (operator.handlesOperand(operatorCharacter)) {
				result = operator.doOperation(numbers);
				break;
			}
		}

		return result;

	}

}
