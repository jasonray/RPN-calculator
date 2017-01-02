package rpn.operator;

import rpn.RpnStack;

public class FactorialOperator implements Operator {

    private static final String FACTORIAL = "!";

    @Override
    public int doOperation(RpnStack numbers) {
        int total = 1;
        Integer operand = numbers.pop();
        while (operand > 0) {
            total = total * operand;
            operand--;
        }
        numbers.push( total );
        return total;
    }

    @Override
    public boolean handlesOperatorCharacter(String operand) {
        return FACTORIAL.contentEquals( operand );
    }

}
