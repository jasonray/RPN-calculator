package rpn;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivisionTest {
	@Test
	public void divideTwoNumbers() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(8);
		calc.enter(2);
		int result = calc.perform("/");
		assertEquals(4, result);
	}

	@Test
	public void divideOneNumber() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(2);
		int result = calc.perform("/");
		assertEquals(0, result);
	}

	@Test(expected = ArithmeticException.class)
	public void divideNoNumber() {
		RpnCalculator calc = new RpnCalculator();
		calc.perform("/");
	}

	@Test
	public void divideThreeNumber() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(16);
		calc.enter(8);
		calc.enter(2);
		int result = calc.perform("/");
		assertEquals(4, result);
	}

	@Test(expected = ArithmeticException.class)
	public void divideByZero() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(6);
		calc.enter(0);
		calc.perform("/");
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
