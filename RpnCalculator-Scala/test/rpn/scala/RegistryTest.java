package rpn.scala;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import rpn.scala.operators.AddOperator;
import rpn.scala.operators.SubtractOperator;

public class RegistryTest {
	private OperatorRegistry registry = new OperatorRegistry();

	@Test
	public void add() {
		assertEquals(AddOperator.class, registry.getOperator("+").getClass());
	}

	@Test
	public void subtract() {
		assertEquals(SubtractOperator.class, registry.getOperator("-").getClass());
	}

	@Test
	public void invalid() {
		assertNull(registry.getOperator("??"));
	}
}
