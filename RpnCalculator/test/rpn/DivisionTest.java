package rpn;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {
	@Test
	public void divideTwoNumbers() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(6);
		calc.enter(3);
		int result = calc.perform("/");
		assertEquals(2, result);
	}

	@Test
	public void divideOneNumber() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(6);
		int result = calc.perform("/");
		assertEquals(0, result);
	}

	@Test(expected = ArithmeticException.class)
	public void divideNoNumber() {
		RpnCalculator calc = new RpnCalculator();
		calc.perform("/");
		// expect error
	}

	@Test(expected = ArithmeticException.class)
	public void divideByZero() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(6);
		calc.enter(0);
		calc.perform("/");
		// expect error
	}

	@Test
	public void divideByFractionalNumber() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(6);
		calc.enter(4);
		int result = calc.perform("/");
		assertEquals(1, result);
	}
}
