package rpn;

import static org.junit.Assert.*;

import org.junit.Test;

public class AverageTest {
	@Test
	public void averageNoNumbers() {
		Controller controller = new Controller();
		int result = controller.perform("AVERAGE");
		assertEquals(0, result);
	}

	@Test
	public void averageOneNumber() {
		Controller controller = new Controller();
		controller.enter(1);
		int result = controller.perform("AVERAGE");
		assertEquals(1, result);
	}

	@Test
	public void averageTwoNumber() {
		Controller controller = new Controller();
		controller.enter(1);
		controller.enter(3);
		int result = controller.perform("AVERAGE");
		assertEquals(2, result);
	}

	@Test
	public void averageFiveNumber() {
		Controller controller = new Controller();
		controller.enter(1);
		controller.enter(2);
		controller.enter(3);
		controller.enter(4);
		controller.enter(5);
		int result = controller.perform("AVERAGE");
		assertEquals(3, result);
	}

	@Test
	public void useAve() {
		Controller controller = new Controller();
		controller.enter(1);
		controller.enter(3);
		int result = controller.perform("AVE");
		assertEquals(2, result);
	}
}
