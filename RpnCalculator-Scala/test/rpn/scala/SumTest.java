package rpn.scala;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {

	@Test
	public void sumEmpty() {
		RpnCalculator calc = new RpnCalculator();
		int result = calc.perform("SUM");
		assertEquals(0, result);
	}

	@Test
	public void sum0() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(0);
		int result = calc.perform("SUM");
		assertEquals(0, result);
	}

	@Test
	public void sum1() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(5);
		int result = calc.perform("SUM");
		assertEquals(5, result);
	}

	@Test
	public void sum2() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(5);
		calc.enter(4);
		int result = calc.perform("SUM");
		assertEquals(9, result);
	}

	@Test
	public void sum3() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(5);
		calc.enter(1);
		calc.enter(4);
		int result = calc.perform("SUM");
		assertEquals(10, result);
	}

	@Test
	public void sumWithMiddleZeros() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(0);
		calc.enter(5);
		calc.enter(0);
		calc.enter(1);
		calc.enter(0);
		calc.enter(4);
		calc.enter(0);
		int result = calc.perform("SUM");
		assertEquals(10, result);
	}

}
