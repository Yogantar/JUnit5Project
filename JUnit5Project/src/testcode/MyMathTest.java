package testcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import businesscode.Mymath;

public class MyMathTest {
	private Mymath m;
	@Before
	public void setUp() throws Exception {
		m = new Mymath();
	}

	@After
	public void tearDown() throws Exception {
		m=null;
	}

	@Test
	public void testSum() {
		System.out.println("Test with 3 numbers");
		assertEquals(10,m.sum(new int[] {5,3,2}));
	}
	
	@Test
	public void testSum2() {
		System.out.println("Test with 5 numbers");
		assertEquals(142,m.sum(new int[] {55,23,21,32,11}));
	}

}
