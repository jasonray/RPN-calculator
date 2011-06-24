package rpn;

import java.util.ArrayList;
import java.util.List;

import rpn.operator.*;

public class OperatorRegistry {

	public static List<Operator> getRegistry() {
		List<Operator> operatorRegistry;
		operatorRegistry = new ArrayList<Operator>();
		operatorRegistry.add(new AdditionOperator());
		operatorRegistry.add(new SubtractionOperator());
		operatorRegistry.add(new MultiplicationOperator());
		operatorRegistry.add(new DivisionOperator());
		operatorRegistry.add(new FactorialOperator());
		operatorRegistry.add(new ReverseOperator());
		operatorRegistry.add(new AverageOperator());
		operatorRegistry.add(new ClearOperator());
		return operatorRegistry;
	}

	public static Operator getOperator(String operatorCharacter) {
		Operator relevantOperator = null;
		for (Operator operator : getRegistry()) {
			if (operator.handlesOperand(operatorCharacter)) {
				relevantOperator = operator;
				break;
			}
		}
		return relevantOperator;
	}
}
