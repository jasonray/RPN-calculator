package rpn;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {
    @Test
    public void multiplyTwoNumbers() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(5);
        calc.enter(4);
        int result = calc.perform("*");
        assertEquals(result, 20);
    }
}
