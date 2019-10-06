package rpn.operator;

import org.junit.Test;
import rpn.RpnCalculator;

import static org.junit.Assert.assertEquals;

public class DoubleTest {
    @Test
    public void doubleSingleNumber() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter( 4 );
        int result = calc.perform( "double" );
        assertEquals( 8, result );
    }
}
