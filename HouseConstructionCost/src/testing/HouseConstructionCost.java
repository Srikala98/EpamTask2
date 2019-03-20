package testing;

public class HouseConstructionCost
{

	public double construction_Cost(double squareFeet, String standard, String automated)
	{
		
		double houseContructionCost=0;
		if(standard.equals("standard"))
		{
			if(automated.equals("yes"))
				houseContructionCost=1900*squareFeet;
			else
				houseContructionCost=1200*squareFeet;
		}
		else if(standard.equals("abovestandard"))
		{
			if(automated.equals("yes"))
				houseContructionCost=2200*squareFeet;
			else
				houseContructionCost=1500*squareFeet;
		}
		else if(standard.equals("highstandard"))
		{
			if(automated.equals("yes"))
				houseContructionCost=2500*squareFeet;
			else
				houseContructionCost=1800*squareFeet;
		}
		return houseContructionCost;
	}
	
}
