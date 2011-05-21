package rpn;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {
	@Test
	public void multiplyTwoNumbers() {
		Controller controller = new Controller();
		controller.enter(5);
		controller.enter(4);
		int result = controller.perform("*");
		assertEquals(result, 20);
	}
}
