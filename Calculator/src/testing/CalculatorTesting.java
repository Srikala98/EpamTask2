package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTesting {
	
	@Test
	public void additionTesting() {
		Calculator test = new Calculator();
		int output1 =test.addition(2,3);
		assertEquals(5,output1);
		int output2 =test.addition(-12,2,4);
		assertEquals(-6,output2);
		int output3 =test.addition(1,2,3,4);
		assertEquals(10,output3);
	}
	
	@Test
	public void multiplicationTesting() {
		Calculator test = new Calculator();
		int output1 =test.multiplication(2,3);
		assertEquals(6,output1);
		int output2 =test.multiplication(2,3,-2);
		assertEquals(-12,output2);
		int output3 =test.multiplication(3,4,5,6);
		assertEquals(360,output3);
	}

	@Test
	public void divisionTesting() {
		Calculator test = new Calculator();
		double output1 =test.division(3.0,2.0);
		assertEquals(1.5,output1);
		double output2 =test.division(10,3);
		assertEquals(3.33,output2);
		double output3 =test.division(8.9,0);
		assertEquals(0,output3);
	}

}
