package rpn;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplicationTest {
	@Test
	public void multipleTwoNumbers() {
		Controller controller = new Controller();
		controller.enter(2);
		controller.enter(4);
		int result = controller.perform("*");
		assertEquals(8, result);
	}

	@Test
	public void multipleNegNumbers() {
		Controller controller = new Controller();
		controller.enter(-2);
		controller.enter(4);
		int result = controller.perform("*");
		assertEquals(-8, result);
	}
	@Test
	public void multiplyNoNumbers() {
		Controller controller = new Controller();
		int result = controller.perform("*");
		assertEquals(0, result);
	}

	@Test
	public void multiplyOneNumber() {
		Controller controller = new Controller();
		controller.enter(1);
		int result = controller.perform("*");
		assertEquals(0, result);
	}

	@Test
	public void multipleThreeNumbers() {
		Controller controller = new Controller();
		controller.enter(2);
		controller.enter(3);
		controller.perform("*");
		controller.enter(3);
		int result = controller.perform("*");
		assertEquals(18, result);
	}
}
