package rpn;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {
	@Test
	public void divideTwoNumbers() {
		Controller controller = new Controller();
		controller.enter(6);
		controller.enter(3);
		int result = controller.perform("/");
		assertEquals(2, result);
	}

	@Test
	public void divideOneNumber() {
		Controller controller = new Controller();
		controller.enter(6);
		int result = controller.perform("/");
		assertEquals(0, result);
	}

	@Test(expected = ArithmeticException.class)
	public void divideNoNumber() {
		Controller controller = new Controller();
		controller.perform("/");
		// expect error
	}

	@Test(expected = ArithmeticException.class)
	public void divideByZero() {
		Controller controller = new Controller();
		controller.enter(6);
		controller.enter(0);
		controller.perform("/");
		// expect error
	}

	@Test
	public void divideByFractionalNumber() {
		Controller controller = new Controller();
		controller.enter(6);
		controller.enter(4);
		int result = controller.perform("/");
		assertEquals(1, result);
	}
}
