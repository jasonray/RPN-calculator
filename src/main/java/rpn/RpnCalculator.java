package rpn;

import rpn.operator.Operator;

public class RpnCalculator {
    private RpnStack numbers = new RpnStack();
    private OperatorRegistry operatorRegistry = new OperatorRegistry();

    public void enter(Integer operand) {
        numbers.push( operand );
    }

    public int perform(String operatorCharacter) {
        int result = 0;
        Operator operatorImplementation = operatorRegistry.getOperator( operatorCharacter );
        if (operatorImplementation == null)
            throw new IllegalArgumentException( "Unknown Operator " + operatorCharacter );
        result = operatorImplementation.doOperation( numbers );
        return result;
    }

    public int peek() {
        return numbers.peek();
    }

}
