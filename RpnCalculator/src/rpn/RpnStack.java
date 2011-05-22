package rpn;

import java.util.Stack;

public class RpnStack extends Stack<Integer> {
	private static final long serialVersionUID = 1L;

	@Override
	public Integer pop() {
		int n;
		if (isEmpty())
			n = 0;
		else
			n = super.pop();
		return n;
	}

	@Override
	public Integer peek() {
		int n;
		if (isEmpty())
			n = 0;
		else
			n = super.peek();
		return n;
	}

}
