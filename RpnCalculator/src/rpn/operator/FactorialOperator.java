package rpn.operator;

import rpn.RpnStack;


public class FactorialOperator implements Operator {

	@Override
	public int doOperation(RpnStack numbers) {
		int total = 1;
		Integer operand = numbers.pop();
		while (operand > 0) {
			total = total * operand;
			operand--;
		}
		numbers.push(total);
		return total;
	}

}
