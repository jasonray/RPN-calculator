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
}
