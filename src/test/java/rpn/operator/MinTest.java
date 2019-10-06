package rpn.operator;

import org.junit.Test;
import rpn.RpnCalculator;

import static org.junit.Assert.assertEquals;

public class MinTest {
    @Test
    public void minOnEmpty() {
        RpnCalculator calc = new RpnCalculator();
        int result = calc.perform("min");
        assertEquals(0, result);
    }

    @Test
    public void minOnSingle() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(1);
        int result = calc.perform("min");
        assertEquals(1, result);
    }

    @Test
    public void minOnSingleNegative() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(-1);
        int result = calc.perform("min");
        assertEquals(-1, result);
    }

    @Test
    public void minOnTwoLowThenHigh() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(1);
        calc.enter(2);
        int result = calc.perform("min");
        assertEquals(1, result);
    }

    @Test
    public void minOnTwoHighThenLow() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(2);
        calc.enter(1);
        int result = calc.perform("min");
        assertEquals(1, result);
    }

    @Test
    public void minSeveralNumbers() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(2);
        calc.enter(1);
        calc.enter(3);
        calc.enter(4);
        calc.enter(5);
        int result = calc.perform("min");
        assertEquals(1, result);
    }

    @Test
    public void minSeveralNegativeNumbers() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(-2);
        calc.enter(-1);
        calc.enter(-3);
        calc.enter(-4);
        calc.enter(-5);
        int result = calc.perform("min");
        assertEquals(-5, result);
    }

    @Test
    public void resultOnStack() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(2);
        calc.enter(1);
        calc.enter(3);
        calc.enter(4);
        calc.enter(5);
        calc.perform("min");
        assertEquals(1, calc.peek());
    }
}