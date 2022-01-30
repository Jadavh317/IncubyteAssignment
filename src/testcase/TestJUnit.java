package testcase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import sourcecode.StringCalculator;

public class TestJUnit {
	StringCalculator calculator=new StringCalculator();
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
}
