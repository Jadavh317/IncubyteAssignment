package testcase;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJUnit {
	@Test
	public void testingJUnit() {
		String str = "Starting Test";
		assertEquals("Starting Test", str);
	}
}
