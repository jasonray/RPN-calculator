package rpn.scala;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void push() {
		RpnStack stack = new RpnStack();
		stack.push(3);
		assertEquals(3, stack.peek());
		assertEquals(3, stack.peek());
	}

	@Test
	public void pop() {
		RpnStack stack = new RpnStack();
		stack.push(3);
		assertEquals(3, stack.pop());
		assertEquals(0, stack.pop());
	}

	@Test
	public void popMultiple() {
		RpnStack stack = new RpnStack();
		stack.push(3);
		stack.push(4);
		assertEquals(4, stack.pop());
		assertEquals(3, stack.pop());
		assertEquals(0, stack.pop());
	}

	@Test
	public void peekEmpty() {
		RpnStack stack = new RpnStack();
		assertEquals(0, stack.peek());
	}

	@Test
	public void popEmpty() {
		RpnStack stack = new RpnStack();
		assertEquals(0, stack.pop());
	}

}
