package rpn;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void factorialReturnsProduct() {
		Controller controller = new Controller();
		controller.enter(4);
		int result = controller.perform("!");
		assertEquals(24, result);
	}

	@Test
	public void factorialOnNothing() {
		Controller controller = new Controller();
		int result = controller.perform("!");
		assertEquals(1, result);
	}

	@Test
	public void twoFactorials() {
		Controller controller = new Controller();
		controller.enter(3);
		int result = controller.perform("!");
		result = controller.perform("!");
		assertEquals(720, result);
	}
}
