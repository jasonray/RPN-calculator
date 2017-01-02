package rpn.operator;

import org.junit.Test;
import rpn.RpnCalculator;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    @Test
    public void fibEmpty() {
        RpnCalculator calc = new RpnCalculator();
        int result = calc.perform("fib");
        assertEquals(0, result);
    }

    @Test
    public void fib0() {
        runTest(0, 0);
    }

    @Test
    public void fib1() {
        runTest(1, 1);
    }

    @Test
    public void fib2() {
        runTest(1, 2);
    }

    @Test
    public void fib3() {
        runTest(2, 3);
    }

    @Test
    public void fib4() {
        runTest(3, 4);
    }

    @Test
    public void fib5() {
        runTest(5, 5);
    }

    @Test
    public void fib6() {
        runTest(8, 6);
    }

    @Test
    public void fib7() {
        runTest(13, 7);
    }

    @Test
    public void fib30() {
        runTest(832040, 30);
    }

    @Test
    public void fib40() {
        runTest(102334155, 40);
    }

    private void runTest(int expected, int n) {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(n);
        int result = calc.perform("fib");
        assertEquals(expected, result);
    }

}
