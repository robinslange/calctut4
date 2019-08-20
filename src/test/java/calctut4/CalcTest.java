package calctut4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import calctut4.Calc;

public class CalcTest 
{
    
    @org.junit.Test
    public void addition() {
        Calc newCalc = new Calc();
        int result = newCalc.add(1,1);
        assertEquals(2, result);
    }

    @org.junit.Test
    public void subtract() {
        Calc newCalc = new Calc();
        int result = newCalc.subtract(2, 1);
        assertEquals(1, result);
    }
    
    
}
