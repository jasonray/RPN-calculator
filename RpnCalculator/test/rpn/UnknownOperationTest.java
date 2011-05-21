package rpn;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;

public class UnknownOperationTest {
	@Ignore
	public void unknownOperation() {
		Controller controller = new Controller();
		int result = controller.perform("?");
		assertEquals(0, result);
	}
}
