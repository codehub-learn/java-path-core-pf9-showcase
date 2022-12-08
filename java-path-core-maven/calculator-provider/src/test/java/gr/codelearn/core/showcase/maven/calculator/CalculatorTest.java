package gr.codelearn.core.showcase.maven.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Assertions.assertEquals(3, Calculator.add(2, 1));
	}

	@Test
	void testMultiply() {
		Assertions.assertEquals(20, Calculator.multiply(4, 5));
	}
}
