package rpn.operator;

import org.junit.Test;
import rpn.RpnCalculator;

import static org.junit.Assert.assertEquals;

public class DoubleTest {
    @Test
    public void doubleSingleNumber() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(4);
        int result = calc.perform("double");
        assertEquals(8, result);
    }

    @Test
    public void doubleNothing() {
        RpnCalculator calc = new RpnCalculator();
        int result = calc.perform("double");
        assertEquals(0, result);
    }

    @Test
    public void doublePutsResultOnStack() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(4);
        int result = calc.perform("double");
        assertEquals(8, calc.peek());
    }

    @Test
    public void executeDoubleTwice() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(4);
        calc.perform("double");
        int result = calc.perform("double");
        assertEquals(16, result);
    }

    @Test
    public void doubleOnNegative() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(4);
        calc.perform("double");
        int result = calc.perform("double");
        assertEquals(16, result);
    }
}
