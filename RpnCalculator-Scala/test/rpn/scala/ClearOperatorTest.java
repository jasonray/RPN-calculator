package rpn.scala;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClearOperatorTest {

	@Test
	public void clearEmpty() {
		RpnCalculator calc = new RpnCalculator();
		calc.perform("C");
	}

	@Test
	public void clear1() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		calc.perform("C");
		validateEmpty(calc);
	}

	@Test
	public void clearMany() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		calc.enter(0);
		calc.enter(2);
		calc.perform("C");
		validateEmpty(calc);
	}

	@Test
	public void clearManyWithClear() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		calc.enter(0);
		calc.enter(2);
		calc.perform("Clear");
		validateEmpty(calc);
	}

	private void validateEmpty(RpnCalculator calc) {
		calc.enter(1);
		int result = calc.perform("+");
		assertEquals(1, result);
	}

}
