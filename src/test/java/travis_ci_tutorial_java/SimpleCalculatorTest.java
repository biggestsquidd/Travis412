package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.subtract(5, 3), 2);
	}
	
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.mult(5, 2), 10);
	}
	
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.div(10, 5), 2);
	}
}
