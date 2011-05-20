package rpn;

import java.util.Stack;

public class Controller {
	private Stack<Integer> numbers = new Stack<Integer>();

	public void enter(Integer operand) {
		numbers.push(operand);
	}

	public int perform(String string) {
		int result = 0;
		Operation operation = null;
		if (string.contentEquals("+")) {
			 operation = new AddOperation();
		} else if (string.contentEquals("-")) {
			 operation = new SubtractionOperation();
		} else if (string.contentEquals("!")) {
			 operation = new FactorialOperation();
		}

		result = operation.doOperation(numbers);
		return result;

	}

}
