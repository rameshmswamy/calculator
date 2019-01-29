package com.rameshmswamy.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test Application for Calculator
 */

public class CalculatorTest {
	private Calculator calculator = new Calculator();
	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}
}
