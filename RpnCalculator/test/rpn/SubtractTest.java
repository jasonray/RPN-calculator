package rpn;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractTest {
	@Test
	public void subtractNoNumbers() {
		Controller controller = new Controller();
		int result = controller.perform("-");
		assertEquals(0, result);
	}

	@Test
	public void subtractOneNumbers() {
		Controller controller = new Controller();
		controller.enter(1);
		int result = controller.perform("-");
		assertEquals(-1, result);
	}
	
	@Test
	public void subtractTwoNumbers() {
		Controller controller = new Controller();
		controller.enter(20);
		controller.enter(10);
		int result = controller.perform("-");
		assertEquals(10, result);
	}
	
	@Test
	public void subtractThreeNumbers() {
		Controller controller = new Controller();
		controller.enter(21);
		controller.enter(13);
		controller.perform("-");
		controller.enter(5);
		
		int result = controller.perform("-");
		assertEquals(3, result);
	}
}
