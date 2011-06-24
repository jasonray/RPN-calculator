package rpn;

import static org.junit.Assert.*;

import org.junit.Test;

import rpn.operator.AdditionOperator;
import rpn.operator.FactorialOperator;
import rpn.operator.MultiplicationOperator;
import rpn.operator.Operator;
import rpn.operator.SubtractionOperator;

public class OperatorFactoryTest {

	@Test
	public void testAddMethod() {
		Operator result = OperatorFactory.getOperator("+");
		assertTrue(result instanceof AdditionOperator);
	}

	@Test
	public void testSubtractionMethod() {
		Operator result = OperatorFactory.getOperator("-");
		assertTrue(result instanceof SubtractionOperator);
	}

	@Test
	public void testMultiplicationMethod() {
		Operator result = OperatorFactory.getOperator("*");
		assertTrue(result instanceof MultiplicationOperator);
	}

	@Test
	public void testFactorialMethod() {
		Operator result = OperatorFactory.getOperator("!");
		assertTrue(result instanceof FactorialOperator);
	}

}
