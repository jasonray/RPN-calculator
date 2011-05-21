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
		operatorRegistry.add(new MultiplyOperator());
		operatorRegistry.add(new DivisionOperator());
		operatorRegistry.add(new FactorialOperator());
		return operatorRegistry;
	}
}
