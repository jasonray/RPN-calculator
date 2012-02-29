package rpn.scala;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void factorial0() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(0);
		int result = calc.perform("!");
		assertEquals(1, result);
	}

	@Test
	public void factorial1() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		int result = calc.perform("!");
		assertEquals(1, result);
	}

	@Test
	public void factorial2() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(2);
		int result = calc.perform("!");
		assertEquals(2, result);
	}

	@Test
	public void factorial3() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(3);
		int result = calc.perform("!");
		assertEquals(6, result);
	}

	@Test
	public void factorial4() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(4);
		int result = calc.perform("!");
		assertEquals(4 * 3 * 2 * 1, result);
	}

	@Test
	public void factorial8() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(8);
		int result = calc.perform("!");
		assertEquals(8 * 7 * 6 * 5 * 4 * 3 * 2 * 1, result);
	}

}
