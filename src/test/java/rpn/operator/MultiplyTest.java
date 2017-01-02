package rpn.operator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import rpn.RpnCalculator;

public class MultiplyTest {
    @Test
    public void multiplyTwoNumbers() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(5);
        calc.enter(4);
        int result = calc.perform("*");
        assertEquals(result, 20);
    }

    @Test
    public void multiplyOneNumbers() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(4);
        int result = calc.perform("*");
        assertEquals(result, 0);
    }

    @Test
    public void multiplyZeroNumbers() {
        RpnCalculator calc = new RpnCalculator();
        int result = calc.perform("*");
        assertEquals(result, 0);
    }
}
