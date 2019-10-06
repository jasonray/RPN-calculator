package rpn.operator;

import rpn.RpnStack;

public class DoubleOperator implements Operator {
    private static final String DOUBLE = "double";

    @Override
    public int doOperation(RpnStack numbers) {
        return 0;
    }

    @Override
    public boolean handlesOperatorCharacter(String operand) {
        return operand.contentEquals(  DOUBLE );
    }
}
