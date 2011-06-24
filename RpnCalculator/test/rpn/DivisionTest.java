package rpn;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {
	@Test
	public void divideTwoNumbers() {
		Controller controller = new Controller();
		controller.enter(8);
		controller.enter(2);
		int result = controller.perform("/");
		assertEquals(4, result);
	}

	@Test
	public void divideOneNumber() {
		Controller controller = new Controller();
		controller.enter(2);
		int result = controller.perform("/");
		assertEquals(0, result);
	}

	@Test(expected = ArithmeticException.class)
	public void divideNoNumber() {
		Controller controller = new Controller();
		controller.perform("/");
	}

	@Test
	public void divideThreeNumber() {
		Controller controller = new Controller();
		controller.enter(16);
		controller.enter(8);
		controller.enter(2);
		int result = controller.perform("/");
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
