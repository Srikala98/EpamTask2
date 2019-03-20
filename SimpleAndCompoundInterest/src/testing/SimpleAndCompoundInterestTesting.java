package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleAndCompoundInterestTesting {

	
	@Test
	public void simpleInterestTest() {
		SimpleAndCompoundInterest test=new SimpleAndCompoundInterest();
		double output1 =test.simpleInterest(5000,4,3);
		assertEquals(600.00,output1);
		double output2 =test.simpleInterest(10000,8,2);
		assertEquals(1600.00,output2);
	}
	
	@Test
	public void compoundInterestTest() {
		SimpleAndCompoundInterest test=new SimpleAndCompoundInterest();
		double output1 =test.compoundInterest(5000,4,3);
		assertEquals(5624.32,output1);
		double output2 =test.compoundInterest(10000,8,2);
		assertEquals(11664.0,output2);
	}

}
