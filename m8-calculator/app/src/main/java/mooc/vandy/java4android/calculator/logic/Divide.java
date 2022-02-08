package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
	// TODO - add your solution here.
	private int num1;
	private int num2;

	//Created constructors
	public Divide() {


	}

	public Divide(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;

//Getters & Setters		
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	//This function returns numbers reminder and output
	public String DivideNums(int num1,int num2) {
		//Here we declared variables as ints and the first varibale remainder gets the numbers remainder
		this.num1=num1;
		this.num2=num2;
		int remainder = num1 % num2;
		//Divide gets us numbers without remainder
		int divide = num1 / num2;
		String output;
		//If remainder is grater then zero it outputs Quotient and remainder and same as if its lesser then 0
		if (remainder > 0) {
			output = divide + " " + "R:" + remainder;


		} else {
			output = divide + " " + "R:" + remainder;
		}
		return output;

	}


}
