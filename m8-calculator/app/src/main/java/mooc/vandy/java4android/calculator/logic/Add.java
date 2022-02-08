package mooc.vandy.java4android.calculator.logic;
import static java.lang.String.valueOf;
/**
 * Perform the Add operation.
 */
public class Add {
    // TODO - add your solution here.
	private int num1;
	private int num2;
	
 //Created constructors
	public Add() {
		
		
	}
	public Add(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
		
	}
//Getters & Setters
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

	//This function returns int
	
	public int addNums() {
		return this.getNum1()+this.getNum2();
		
	}
	//This function returns int as String
	
	public String addNums2(int num1,int num2) {
		return valueOf(num1+num2);
		
	}
	
}
