package rpn;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClearTest {
	@Test
	public void clearOnEmpty() {
		Controller controller = new Controller();
		controller.perform("C");
	}

	@Test
	public void clearOnSingle() {
		Controller controller = new Controller();
		controller.enter(1);
		controller.perform("C");
		int result = controller.perform("+");
		assertEquals(0, result);
	}

	@Test
	public void clearOnList() {
		Controller controller = new Controller();
		controller.enter(1);
		controller.enter(1);
		controller.enter(1);
		controller.enter(1);
		controller.enter(1);
		controller.enter(1);
		controller.enter(1);
		controller.enter(1);
		controller.enter(1);
		controller.perform("C");
		int result = controller.perform("+");
		assertEquals(0, result);
	}

}
