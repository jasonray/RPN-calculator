package rpn;

import java.util.Stack;

public class FactorialOperation implements Operation {

	@Override
	public int doOperation(Stack<Integer> numbers) {
		int total = 1;
		Integer operand = getOperand(numbers);
		while (operand > 0) {
			total = total * operand;
			operand--;
		}
		numbers.push(total);
		return total;
	}
	
	private int getOperand(Stack<Integer> numbers) {
		int result = 0;
		if (!numbers.empty()) {
			return numbers.pop();
		}
		return result;
	}
}
