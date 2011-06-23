package rpn;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {
	@Test
	public void addTwoNumbersReturnsSum() {
		Controller controller = new Controller();
		controller.enter(30);
		controller.enter(4);
		int result = controller.perform("+");
		assertEquals(34, result);
	}

	@Test
	public void addNoNumbers() {
		Controller controller = new Controller();
		int result = controller.perform("+");
		assertEquals(0, result);
	}

	@Test
	public void addOneNumber() {
		Controller controller = new Controller();
		controller.enter(1);
		int result = controller.perform("+");
		assertEquals(1, result);
	}

	@Test
	public void addThreeNumbersReturnsSum() {
		Controller controller = new Controller();
		controller.enter(1);
		controller.enter(2);
		controller.perform("+");
		controller.enter(3);
		int result = controller.perform("+");
		assertEquals(6, result);
	}
}
