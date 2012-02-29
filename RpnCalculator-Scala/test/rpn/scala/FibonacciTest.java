package rpn.scala;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void fib0() {
		runFibTest(0, 0);
	}

	@Test
	public void fib1() {
		runFibTest(1, 1);
	}

	@Test
	public void fib2() {
		runFibTest(2, 1);
	}

	@Test
	public void fib3() {
		runFibTest(3, 2);
	}

	@Test
	public void fib4() {
		runFibTest(4, 3);
	}

	@Test
	public void fib5() {
		runFibTest(5, 5);
	}

	@Test
	public void fib6() {
		runFibTest(6, 8);
	}

	@Test
	public void fib7() {
		runFibTest(7, 13);
	}

	@Test
	public void fib8() {
		runFibTest(8, 21);
	}

	@Test
	public void fib9() {
		runFibTest(9, 34);
	}

	@Test
	public void fib10() {
		runFibTest(10, 55);
	}

	private void runFibTest(int input, int expectedResult) {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(input);
		int result = calc.perform("fib");
		assertEquals(expectedResult, result);
		assertEquals(expectedResult, calc.getValue());
	}

}
