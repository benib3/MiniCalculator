package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    //private static final int DIVISION = 4;
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO - Put your code here.
        Add add=new Add();
        Subtract sub=new Subtract();
        Multiply mult=new Multiply();
        Divide div=new Divide();

        if(operation==ADDITION){
            mOut.print(add.addNums2(argumentOne,argumentTwo));
        }
        else if(operation==SUBTRACTION){
            mOut.print(sub.SubtractNums2(argumentOne,argumentTwo));
        }
        else if(operation==MULTIPLICATION){
            mOut.print(mult.MultiplyNums2(argumentOne,argumentTwo));
        }
        else{
            mOut.print(div.DivideNums(argumentOne,argumentTwo));
        }

        
    }
}
