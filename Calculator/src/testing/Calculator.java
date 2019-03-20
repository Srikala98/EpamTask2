package testing;

public class Calculator {

	//method to calculate addition
	public int addition(int... a) {
		int additionResult = 0;
		for (int i = 0; i < a.length; i++) {
			additionResult += a[i];
		}
		return additionResult;
	}
	//method to calculate multiplication
	public int multiplication (int... a) {
		int multiplicationResult = 1;
		for (int i = 0; i < a.length; i++) {
			multiplicationResult *= a[i];
		}
		return multiplicationResult;
	}
	//method to calculate division
	public double division (double number1, double number2) {
		if (number2 == 0) {
			return 0;
		}
		double quotient = number1 / number2;
		quotient = Math.round(quotient*100.0) / 100.0;
		return quotient;
	}
}
