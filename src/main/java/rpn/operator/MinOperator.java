package rpn.operator;

import rpn.RpnStack;

public class MinOperator implements Operator {
    @Override
    public int doOperation(RpnStack numbers) {
        int minValue;

        if (numbers.isEmpty()) {
            minValue = 0;
        } else {
            minValue = numbers.pop();
        }

        while (!numbers.isEmpty()) {
            int currentValue = numbers.pop();
            if (currentValue < minValue) {
                minValue = currentValue;
            }
        }

        numbers.push(minValue);
        return minValue;
    }

    @Override
    public boolean handlesOperatorCharacter(String operand) {
        return operand.contentEquals("min");
    }
}
