package rpn;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStackTest {

	@Test
	public void reverseTwoNumbers() {
		Controller controller = new Controller();
		controller.enter(1);
		controller.enter(2);
		int result = controller.perform("REVERSE");
		assertEquals(1, result);
	}

	@Test
	public void reverseThreeNumbers() {
		Controller controller = new Controller();
		controller.enter(1);
		controller.enter(2);
		controller.enter(3);
		int result = controller.perform("REVERSE");
		assertEquals(1, result);

		assertEquals(1, controller.perform("-"));
		assertEquals(2, controller.perform("-"));

	}

	@Test
	public void reverseOneNumber() {
		Controller controller = new Controller();
		controller.enter(1);
		int result = controller.perform("REVERSE");
		assertEquals(1, result);
	}

	@Test
	public void reverseNumbers() {
		Controller controller = new Controller();
		int result = controller.perform("REVERSE");
		assertEquals(0, result);
	}

	@Test
	public void calledByLowerCase() {
		Controller controller = new Controller();
		controller.enter(1);
		controller.enter(2);
		int result = controller.perform("reverse");
		assertEquals(1, result);
	}

	@Test
	public void calledByRev() {
		Controller controller = new Controller();
		controller.enter(1);
		controller.enter(2);
		int result = controller.perform("REV");
		assertEquals(1, result);
	}

	@Test
	public void calledByRevLowerCase() {
		Controller controller = new Controller();
		controller.enter(1);
		controller.enter(2);
		int result = controller.perform("rev");
		assertEquals(1, result);
	}
}
