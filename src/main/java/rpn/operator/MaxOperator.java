package rpn.operator;

import rpn.RpnStack;

public class MaxOperator implements Operator {
    @Override
    public int doOperation(RpnStack numbers) {
        int maxValue = 0;

        while (!numbers.isEmpty()) {
            int currentValue = numbers.pop();
            if (currentValue > maxValue) {
                maxValue = currentValue;
            }
        }
        return maxValue;
    }

    @Override
    public boolean handlesOperatorCharacter(String operand) {
        return operand.contentEquals("max");
    }
}
