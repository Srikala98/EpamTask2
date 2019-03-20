package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseConstructionCostTesting {

	@Test
	public void test() {
		
		HouseConstructionCost test = new HouseConstructionCost();
		double output1 =test.construction_Cost(50,"standard","yes");
		assertEquals(95000.0,output1);
		double output2 =test.construction_Cost(50,"standard","no");
		assertEquals(60000.0,output2);
		double output3 =test.construction_Cost(50,"abovestandard","yes");
		assertEquals(110000.0,output3);
		double output4 =test.construction_Cost(50,"abovestandard","no");
		assertEquals(75000.0,output4);
		double output5 =test.construction_Cost(50,"highstandard","yes");
		assertEquals(125000.0,output5);
		double output6 =test.construction_Cost(50,"highstandard","no");
		assertEquals(90000.0,output6);
		
	}


}
