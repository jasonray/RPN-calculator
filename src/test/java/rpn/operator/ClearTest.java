package rpn.operator;

import org.junit.Test;
import rpn.RpnCalculator;

import static org.junit.Assert.assertEquals;

public class ClearTest {
    @Test
    public void clearOnEmpty() {
        RpnCalculator calc = new RpnCalculator();
        calc.perform( "C" );
    }

    @Test
    public void clearOnSingle() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter( 1 );
        calc.perform( "C" );
        int result = calc.perform( "+" );
        assertEquals( 0, result );
    }

    @Test
    public void clearOnList() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter( 1 );
        calc.enter( 1 );
        calc.enter( 1 );
        calc.enter( 1 );
        calc.enter( 1 );
        calc.enter( 1 );
        calc.enter( 1 );
        calc.enter( 1 );
        calc.enter( 1 );
        calc.perform( "C" );
        int result = calc.perform( "+" );
        assertEquals( 0, result );
    }

}
