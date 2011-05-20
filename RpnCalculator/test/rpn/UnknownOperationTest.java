package rpn;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class UnknownOperationTest {
	@Ignore
	public void unknownOperation() {
		Controller controller = new Controller();
		int result = controller.perform("?");
		assertEquals(0, result);
	}
}
