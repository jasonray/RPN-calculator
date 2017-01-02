package rpn.operator;

import org.junit.Test;
import rpn.RpnCalculator;

import static org.junit.Assert.assertEquals;

public class SubtractTest {
    @Test
    public void subtractNoNumbers() {
        RpnCalculator calc = new RpnCalculator();
        int result = calc.perform("-");
        assertEquals(0, result);
    }

    @Test
    public void subtractOneNumbers() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(1);
        int result = calc.perform("-");
        assertEquals(-1, result);
    }

    @Test
    public void subtractOneNumberTwice() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(1);
        int result = calc.perform("-");
        result = calc.perform("-");
        assertEquals(1, result);
    }

    @Test
    public void subtractTwoNumbers() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(20);
        calc.enter(10);
        int result = calc.perform("-");
        assertEquals(10, result);
    }

    @Test
    public void subtractThreeNumbers() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(21);
        calc.enter(13);
        calc.perform("-");
        calc.enter(5);

        int result = calc.perform("-");
        assertEquals(3, result);
    }
}
