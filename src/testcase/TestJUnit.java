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
	
	@Test
	public void conatinMoreThanOneInteger() {
		assertEquals(11, calculator.addNum("5,6"));
	}
	
	@Test
	public void conatinMoreThanOneInteger1() {
		assertEquals(21, calculator.addNum("4,8,6,3"));
	}	
	
	@Test
	public void containNewLineAndComma() {
		assertEquals(21, calculator.addNum("8\n6,3 4"));
	}
	
	@Test
	public void containNewLineAndComma1() {
		assertEquals(19, calculator.addNum("\n4\n;;5\n;;3\n;;5\n;;2\n"));
	}
	
	@Test
	public void containAlphbet() {
		assertThrows(NumberFormatException.class, () -> {
			calculator.addNum("B,2;S 4");
		});
	}
	
}
