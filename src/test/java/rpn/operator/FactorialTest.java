package rpn.operator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import rpn.RpnCalculator;

public class FactorialTest {

    @Test
    public void factorialReturnsProduct() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(4);
        int result = calc.perform("!");
        assertEquals(24, result);
    }

    @Test
    public void factorialOnNothing() {
        RpnCalculator calc = new RpnCalculator();
        int result = calc.perform("!");
        assertEquals(1, result);
    }

    @Test
    public void twoFactorials() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(3);
        int result = calc.perform("!");
        result = calc.perform("!");
        assertEquals(720, result);
    }
}
