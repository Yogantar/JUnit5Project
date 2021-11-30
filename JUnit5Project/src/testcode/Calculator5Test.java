package testcode;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import businesscode.Calculator;

/*
 * In Junit 5, test classes and test methods can declare 
 * custom display names via Junit 5 @DisplayName annotation.


 */

@DisplayName("Calculator Test Case")
class Calculator5Test {
	
	Calculator calc;
	@BeforeEach
	void setUp() throws Exception {
		calc= new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calc = null;
	}

	@Test
	@DisplayName("Calculator add Test")
	void testAdd() {
		double result = calc.add(10.50, 10.20);
		assertEquals(20.70,result,0);
	}

	@Test
	@DisplayName("Calculator subtract Test")
	void testSubtract() {
		double result = calc.subtract(20.50, 10.20);
		assertEquals(10.30,result,0);
	}

	@Test
	void testMultiply() {
		double result = calc.multiply(100, 2.5);
		
		String user = "gosling";
		assumingThat(user.equals("Bob"),() -> {System.out.println("success");});
		assertEquals(250,result,0);
//		assumingThat(user.equals("Bob"),() -> assertEquals(250,calc.multiply(100, 2.5),0));
	}

	@Test
	@DisplayName("Calculator divide Test")
	void testDivide() {
		double result = calc.divide(100, 10);
		assertEquals(10,result,0);
	}
	

}
