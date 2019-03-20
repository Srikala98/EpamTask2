package testing;

public class SimpleAndCompoundInterest {
	
	    //method to calculate Simple-Interest
	    public double simpleInterest(double principalAmount, double rateOfInterest, double time) 
	    {
		    double simple_Interest = (principalAmount * rateOfInterest * time) / 100;
		    return Math.round(simple_Interest * 100.0) / 100.0;
	    }
	  
	    
	    //method to calculate Compound-Interest
		public double compoundInterest(double principalAmount, double rateOfInterest, int time)
		{
			double compound_Interest = 0;
			compound_Interest = principalAmount * Math.pow((1 + (rateOfInterest / 100)), time);
			return Math.round(compound_Interest * 100.0) / 100.0;
		}

}
