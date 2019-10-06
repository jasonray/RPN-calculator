package rpn.operator;

import org.junit.Test;
import rpn.RpnCalculator;

import static org.junit.Assert.assertEquals;

public class MaxTest {
    @Test
    public void maxOnEmpty() {
        RpnCalculator calc = new RpnCalculator();
        int result = calc.perform("max");
        assertEquals(0, result);
    }

    @Test
    public void maxOnSingle() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(1);
        int result = calc.perform("max");
        assertEquals(1, result);
    }

    @Test
    public void maxOnSingleNegative() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(-1);
        int result = calc.perform("max");
        assertEquals(-1, result);
    }

    @Test
    public void maxOnTwoLowThenHigh() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(1);
        calc.enter(2);
        int result = calc.perform("max");
        assertEquals(2, result);
    }

    @Test
    public void maxOnTwoHighThenLow() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(2);
        calc.enter(1);
        int result = calc.perform("max");
        assertEquals(2, result);
    }

    @Test
    public void maxSeveralNumbers() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(2);
        calc.enter(1);
        calc.enter(3);
        calc.enter(4);
        calc.enter(5);
        calc.enter(-1);
        int result = calc.perform("max");
        assertEquals(5, result);
    }
}
