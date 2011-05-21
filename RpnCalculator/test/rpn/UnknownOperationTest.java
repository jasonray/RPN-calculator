package rpn;

import org.junit.Test;

public class UnknownOperationTest {
	@Test(expected = IllegalArgumentException.class)
	public void unknownOperation() {
		Controller controller = new Controller();
		controller.perform("?");
		// expect error
	}

	@Test(expected = IllegalArgumentException.class)
	public void blankOperand() {
		Controller controller = new Controller();
		controller.perform(null);
		// expect error
	}
}
