package rpn.operator;

import rpn.RpnStack;

public class FibonacciOperator implements Operator {
    @Override
    public int doOperation(RpnStack numbers) {
        int n = numbers.pop();
        return fib( n );
    }

    private int fib(int n) {

        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;

        int prev1 = 1;
        int prev2 = 0;
        int result = 0;

        for (int i = 1; i < n; i++) {
            result = prev1 + prev2;
            prev2 = prev1;
            prev1 = result;
        }

        return result;

    }

    @Override
    public boolean handlesOperatorCharacter(String operand) {
        return "FIB".contentEquals( operand.toUpperCase() ) || "FIBONACCI".contentEquals( operand.toUpperCase() );
    }

}
