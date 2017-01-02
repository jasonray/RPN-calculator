package rpn.operator;

import rpn.RpnStack;

public class ReverseOperator implements Operator {

    @Override
    public int doOperation(RpnStack numbers) {
        RpnStack tempStackA = new RpnStack();
        RpnStack tempStackB = new RpnStack();
        reverseCopyStack( numbers, tempStackA );
        reverseCopyStack( tempStackA, tempStackB );
        reverseCopyStack( tempStackB, numbers );
        return numbers.peek();
    }

    private void reverseCopyStack(RpnStack from, RpnStack to) {
        while (!from.isEmpty())
            to.push( from.pop() );
    }

    @Override
    public boolean handlesOperatorCharacter(String operand) {
        return "REVERSE".contentEquals( operand.toUpperCase() ) || "REV".contentEquals( operand.toUpperCase() );
    }
}
