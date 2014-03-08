package rpn;

import static org.junit.Assert.*;

import org.junit.Test;

import rpn.RpnStack;

public class StackTest {
	@Test
	public void pushPop() {
		RpnStack s = new RpnStack();
		s.push(1);
		assertEquals(1, s.pop());
	}

	@Test
	public void popEmptyStack() {
		RpnStack s = new RpnStack();
		assertEquals(0, s.pop());
	}

	@Test
	public void pushpushpop() {
		RpnStack s = new RpnStack();
		s.push(2);
		s.push(1);
		assertEquals(1, s.pop());
	}
}
