package rpn.operator;

import org.junit.Test;
import rpn.RpnCalculator;

import static org.junit.Assert.assertEquals;

public class AbsoluteTest {

    @Test
    public void zero() {
        runTest(0, 0);
    }

    @Test
    public void one() {
        runTest(1, 1);
    }

    @Test
    public void negOne() {
        runTest(1, -1);
    }

    @Test
    public void two() {
        runTest(2, 2);
    }

    @Test
    public void negTwo() {
        runTest(2, -2);
    }

    @Test
    public void absOnEmptyStack() {
        RpnCalculator calc = new RpnCalculator();
        int result = calc.perform("||");
        assertEquals(0, result);
    }

    private void runTest(int expected, int n) {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(n);
        int result = calc.perform("||");
        assertEquals(expected, result);
    }

    @Test
    public void ensureResultIsOnStack() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(1);
        calc.enter(-5);
        calc.perform("||");

        // prove that 5 is on the stack by adding 1 to get 6
        assertEquals(6, calc.perform("+"));
    }
}
