package rpn;

import java.util.ArrayList;

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

	public int perform(String operatorCharacter) {

		ArrayList<Operator> operatorRegistry = new ArrayList<Operator>();
		operatorRegistry.add(new AddOperator());
		operatorRegistry.add(new SubtractionOperator());
		operatorRegistry.add(new MultiplyOperator());
		operatorRegistry.add(new FactorialOperator());

		int result = 0;
		for (Operator operator : operatorRegistry) {
			if (operator.handlesOperatorCharacter(operatorCharacter)) {
				result = operator.doOperation(numbers);
				break;
			}
		}

		return result;

	}

}
