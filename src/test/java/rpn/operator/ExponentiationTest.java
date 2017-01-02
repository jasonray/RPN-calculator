package rpn.operator;

import org.junit.Test;
import rpn.RpnCalculator;

import static org.junit.Assert.assertEquals;

public class ExponentiationTest {
    @Test
    public void raiseToPower() {
        runTest(2, 3, 8);
    }

    @Test
    public void raiseToZero() {
        runTest(2, 0, 1);
    }

    @Test
    public void oneRaised() {
        runTest(1, 2, 1);
    }

    @Test
    public void zeroRaisedToPositive() {
        runTest(0, 2, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void zeroRaisedToNegative() {
        calculate(0, -2);
    }

    @Test
    public void neg1ToOdd() {
        runTest(-1, 3, -1);
    }

    @Test
    public void neg1ToEven() {
        runTest(-1, 4, 1);
    }

    @Test
    public void raiseToNegPower() {
        runTest(2, -2, (1 / 4));
    }

    private void runTest(int lhs, int rhs, int expected) {
        assertEquals(expected, calculate(lhs, rhs));
    }

    private int calculate(int lhs, int rhs) {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(lhs);
        calc.enter(rhs);
        return calc.perform("^");
    }
}
