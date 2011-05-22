package rpn;

import java.util.List;

import rpn.operator.Operator;

public class RpnCalculator {
	private RpnStack numbers = new RpnStack();
	private List<Operator> operatorRegistry = OperatorRegistry.getRegistry();

	public void enter(Integer operand) {
		numbers.push(operand);
	}

	public int perform(String operand) {
		int result = 0;

		boolean foundOperator = false;

		if (operand != null) {
			for (Operator operator : operatorRegistry) {
				if (operator.handlesOperand(operand)) {
					result = operator.doOperation(numbers);
					foundOperator = true;
					break;
				}
			}
		}

		if (!foundOperator )
			throw new IllegalArgumentException("Unknown Operand");

		return result;

	}

}
