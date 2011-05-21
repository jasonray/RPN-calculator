package rpn;

import java.util.ArrayList;
import java.util.List;

import rpn.operator.*;

public class OperationRegistry {

	public static List<Operator> getRegistry() {
		List<Operator> operatorRegistry;
		operatorRegistry = new ArrayList<Operator>();
		operatorRegistry.add(new AddOperator());
		operatorRegistry.add(new SubtractionOperator());
		operatorRegistry.add(new MultiplyOperator());
		operatorRegistry.add(new DivisionOperator());
		operatorRegistry.add(new FactorialOperator());
		return operatorRegistry;
	}
}
