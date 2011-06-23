package rpn;

import rpn.operator.AddOperator;
import rpn.operator.FactorialOperator;
import rpn.operator.MultiplyOperator;
import rpn.operator.Operator;
import rpn.operator.SubtractionOperator;


public class Controller {
	private RpnStack numbers = new RpnStack();

	public void enter(Integer operand) {
		numbers.push(operand);
	}

	public int perform(String string) {
		int result = 0;
		Operator operation = null;
		if (string.contentEquals("+")) {
			 operation = new AddOperator();
		} else if (string.contentEquals("-")) {
			 operation = new SubtractionOperator();
		} else if (string.contentEquals("!")) {
			 operation = new FactorialOperator();
		} else if (string.contentEquals("*")) {
			operation = new MultiplyOperator();
		}

		result = operation.doOperation(numbers);
		return result;

	}

}
