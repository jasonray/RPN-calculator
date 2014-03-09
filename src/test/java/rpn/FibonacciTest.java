package rpn;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
        runTest(2, 1);
    }

    @Test
    public void fib3() {
        runTest(3, 2);
    }

    @Test
    public void fib4() {
        runTest(4, 3);
    }

    @Test
    public void fib5() {
        runTest(5, 5);
    }

    @Test
    public void fib6() {
        runTest(6, 8);
    }

    @Test
    public void fib7() {
        runTest(7, 13);
    }

    @Test
    public void fib30() {
        runTest(30, 832040);
    }

    @Test
    public void fib40() {
        runTest(40, 102334155);
    }

    private void runTest(int n, int expected) {
        RpnCalculator calc = new RpnCalculator();
        calc.enter(n);
        int result = calc.perform("fib");
        assertEquals(expected, result);
    }

}
