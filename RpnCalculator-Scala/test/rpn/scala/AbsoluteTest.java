package rpn.scala;

import static org.junit.Assert.*;

import org.junit.Test;

public class AbsoluteTest {

	@Test
	public void absoluteOnPositive() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(5);
		int result = calc.perform("||");
		assertEquals(5, result);
	}

	@Test
	public void absoluteOnNegative() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(-5);
		int result = calc.perform("||");
		assertEquals(5, result);
	}

	@Test
	public void absoluteOnEmpty() {
		RpnCalculator calc = new RpnCalculator();
		int result = calc.perform("||");
		assertEquals(0, result);
	}

	@Test
	public void absoluteOnZero() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(0);
		int result = calc.perform("||");
		assertEquals(0, result);
	}

}
