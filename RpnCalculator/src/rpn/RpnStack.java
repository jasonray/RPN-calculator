package rpn;

import java.util.Stack;

public class RpnStack {
	private Stack<Integer> stack = new Stack<Integer>();

	public void push(int n) {
		stack.push(n);
	}

	public int getOperand() {
		int n;
		if (isEmpty())
			n = 0;
		else
			n = stack.pop();
		return n;
	}

	public int peek() {
		return stack.peek();
	}

	private boolean isEmpty() {
		return stack.empty();
	}
}
