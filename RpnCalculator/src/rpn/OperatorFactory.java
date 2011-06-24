package rpn;

import java.util.HashMap;
import java.util.Map;

import rpn.operator.AdditionOperator;
import rpn.operator.DivisionOperator;
import rpn.operator.FactorialOperator;
import rpn.operator.MultiplicationOperator;
import rpn.operator.Operator;
import rpn.operator.SubtractionOperator;

public class OperatorFactory {
	static Map<String, Operator> operators = null;

	static {
		operators = new HashMap<String, Operator>();
		operators.put("+", new AdditionOperator());
		operators.put("-", new SubtractionOperator());
		operators.put("*", new MultiplicationOperator());
		operators.put("!", new FactorialOperator());
		operators.put("/", new DivisionOperator());
	}

	public static Operator getOperator(String operatorCharacter) {
		return operators.get(operatorCharacter);
	}
}
