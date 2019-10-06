package rpn.operator;

import rpn.RpnStack;

public class MaxOperator implements Operator {
    @Override
    public int doOperation(RpnStack numbers) {
        return 0;
    }

    @Override
    public boolean handlesOperatorCharacter(String operand) {
        return operand.contentEquals( "max" );
    }
}
