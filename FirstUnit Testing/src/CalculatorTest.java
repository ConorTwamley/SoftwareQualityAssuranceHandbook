import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		double result = cal.add(10, 5);
		double expected = 15;
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testSubtract() {
		Calculator cal = new Calculator();
		double result = cal.subtract(10, 5);
		double expected = 5;
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testMultpily() {
		Calculator cal = new Calculator();
		double result = cal.multiply(10, 5);
		double expected = 50;
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testDivide() {
		Calculator cal = new Calculator();
		double result = cal.divide(10, 5);
		double expected = 2;
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testStringAdd() {
		Calculator cal = new Calculator();
		int parseNumbers = cal.addString("10,5");
		int expected = 15;
		assertEquals(expected, parseNumbers);
		
	}

}
