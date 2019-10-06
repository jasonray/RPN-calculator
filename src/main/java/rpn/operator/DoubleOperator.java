package rpn.operator;

import rpn.RpnStack;

public class DoubleOperator implements Operator {
    private static final String DOUBLE = "double";

    @Override
    public int doOperation(RpnStack numbers) {
        int operand = numbers.pop();
        int result = operand * 2;
        numbers.push(result);
        return result;
    }

    @Override
    public boolean handlesOperatorCharacter(String operand) {
        return operand.contentEquals(  DOUBLE );
    }
}
