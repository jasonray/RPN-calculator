package rpn.operator;

import rpn.RpnStack;

public interface Operator {
	public int doOperation(RpnStack numbers);

	public boolean handlesOperand(String operand);
}
