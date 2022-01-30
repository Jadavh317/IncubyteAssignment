package testcase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import sourcecode.StringCalculator;

public class TestJUnit {
	StringCalculator calculator = new StringCalculator();

	@Test
	public void testingJUnit() {
		String str = "Starting Test";
		assertEquals("Starting Test", str);
	}

	@Test
	public void nullStringCheck() {
		assertThrows(IllegalArgumentException.class, () -> {
			calculator.addNum(null);
		});
	}

	@Test
	public void emptyStringCheck() {	
		assertEquals(0, calculator.addNum(""));
	}
	
	@Test
	public void whiteSpaceCheck() {
		assertEquals(0, calculator.addNum("   "));
	}
	
	@Test
	public void onlyOneInteger() {
		assertEquals(9, calculator.addNum("9"));
	}
}
