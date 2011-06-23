package rpn;

import static org.junit.Assert.*;

import org.junit.Test;

public class RpnStackTest {
	@Test
	public void getOperandFromEmptyStack() {
		RpnStack stack = new RpnStack();
		int result = stack.getOperand();
		assertEquals(0, result);
	}

	@Test
	public void peekFromPush() {
		RpnStack stack = new RpnStack();
		stack.push(2);
		int result = stack.peek();
		assertEquals(2, result);
	}

	@Test
	public void popFromPush() {
		RpnStack stack = new RpnStack();
		stack.push(2);
		stack.push(5);

		int result = stack.getOperand();
		assertEquals(5, result);
	}

	@Test
	public void multiplePops() {
		RpnStack stack = new RpnStack();
		stack.push(2);
		stack.push(5);

		int result = stack.getOperand();
		assertEquals(5, result);

		result = stack.getOperand();
		assertEquals(2, result);
	}

	@Test
	public void multiplePeeks() {
		RpnStack stack = new RpnStack();
		stack.push(2);
		stack.push(5);

		int result = stack.peek();
		assertEquals(5, result);

		result = stack.peek();
		assertEquals(5, result);
	}

	@Test
	public void emptyStackWithPopsNextReturns0() {
		RpnStack stack = new RpnStack();
		stack.push(2);

		int result = stack.getOperand();
		result = stack.getOperand();
		assertEquals(0, result);

	}
	
	@Test
	public void pushPop() {
		RpnStack s = new RpnStack();
		s.push(1);
		assertEquals(1, s.getOperand());
	}

	@Test
	public void popEmptyStack() {
		RpnStack s = new RpnStack();
		assertEquals(0, s.getOperand());
	}

	@Test
	public void pushpushpop() {
		RpnStack s = new RpnStack();
		s.push(2);
		s.push(1);
		assertEquals(1, s.getOperand());
	}
}
