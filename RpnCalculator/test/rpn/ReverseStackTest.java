package rpn;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStackTest {

	@Test
	public void reverseTwoNumbers() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		calc.enter(2);
		int result = calc.perform("REVERSE");
		assertEquals(1, result);
	}

	@Test
	public void reverseThreeNumbers() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		calc.enter(2);
		calc.enter(3);
		int result = calc.perform("REVERSE");
		assertEquals(1, result);

		assertEquals(1, calc.perform("-"));
		assertEquals(2, calc.perform("-"));

	}

	@Test
	public void reverseOneNumber() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		int result = calc.perform("REVERSE");
		assertEquals(1, result);
	}

	@Test
	public void reverseNumbers() {
		RpnCalculator calc = new RpnCalculator();
		int result = calc.perform("REVERSE");
		assertEquals(0, result);
	}

	@Test
	public void calledByLowerCase() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		calc.enter(2);
		int result = calc.perform("reverse");
		assertEquals(1, result);
	}

	@Test
	public void calledByRev() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		calc.enter(2);
		int result = calc.perform("REV");
		assertEquals(1, result);
	}

	@Test
	public void calledByRevLowerCase() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		calc.enter(2);
		int result = calc.perform("rev");
		assertEquals(1, result);
	}
}
