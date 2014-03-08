package rpn.operator;

import rpn.RpnStack;

public class AverageOperator implements Operator {

	@Override
	public int doOperation(RpnStack numbers) {
		int runningTotal = 0;
		int runningCount = 0;
		while (!numbers.isEmpty()) {
			runningCount++;
			runningTotal += numbers.pop();
		}
		int ave = 0;
		if (runningCount > 0) {
			ave = runningTotal / runningCount;
		}
		numbers.push(ave);
		return ave;
	}

	@Override
	public boolean handlesOperatorCharacter(String operand) {
		return "AVERAGE".contentEquals(operand.toUpperCase()) || "AVE".contentEquals(operand.toUpperCase());

	}

}
