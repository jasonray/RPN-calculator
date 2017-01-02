package rpn.operator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import rpn.RpnCalculator;

public class AdditionTest {
    @Test
    public void addTwoNumbersReturnsSum() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(30);
        calc.enter(4);
        int result = calc.perform("+");
        assertEquals(34, result);
    }

    @Test
    public void addNoNumbers() {
        RpnCalculator calc = new RpnCalculator();
        int result = calc.perform("+");
        assertEquals(0, result);
    }

    @Test
    public void addOneNumber() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(1);
        int result = calc.perform("+");
        assertEquals(1, result);
    }

    @Test
    public void addThreeNumbersReturnsSum() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(1);
        calc.enter(2);
        calc.perform("+");
        calc.enter(3);
        int result = calc.perform("+");
        assertEquals(6, result);
    }

    @Test
    public void addNegNumbers() {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(1);
        calc.enter(-2);
        int result = calc.perform("+");
        assertEquals(-1, result);
    }
}
