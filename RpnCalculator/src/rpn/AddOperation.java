package rpn;

import java.util.Stack;

public class AddOperation implements Operation {

	@Override
	public int doOperation(Stack<Integer> numbers) {
		int result;
		Integer rhs = getOperand(numbers);
		Integer lhs = getOperand(numbers);

		result = lhs + rhs;
		numbers.push(result);
		return result;
	}

	private int getOperand(Stack<Integer> numbers) {
		int result = 0;
		if (!numbers.empty()) {
			return numbers.pop();
		}
		return result;
	}

}
