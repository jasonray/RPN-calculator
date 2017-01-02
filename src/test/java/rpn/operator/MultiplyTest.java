package rpn.operator;

import org.junit.Test;
import rpn.RpnCalculator;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {
    @Test
    public void multiplyTwoNumbers() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter( 5 );
        calc.enter( 4 );
        int result = calc.perform( "*" );
        assertEquals( 20, result );
    }

    @Test
    public void multiplyOneNumbers() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter( 4 );
        int result = calc.perform( "*" );
        assertEquals( 0, result );
    }

    @Test
    public void multiplyZeroNumbers() {
        RpnCalculator calc = new RpnCalculator();
        int result = calc.perform( "*" );
        assertEquals( 0, result );
    }
}
