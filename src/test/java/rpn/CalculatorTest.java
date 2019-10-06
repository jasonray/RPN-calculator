package rpn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void peek() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter( 1 );
        calc.enter( 2 );
        assertEquals(  calc.peek ( ) , 2);
    }

}
