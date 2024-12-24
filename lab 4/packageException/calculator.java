package packageException;

public class calculator
{ 
    public void isNegative(int value) throws customException 
    {
        if (value<0) 
        {
            throw new customException("Value cannot be negative.");
        }
    }
    ///////////////////////////////////////////////////////////////
    public void isNull(String num) throws NullPointerException
    {
        if(num==null) 
        {
            throw new NullPointerException();
        }
    }
    ///////////////////////////////////////////////////////////////
    public void isZero(int divisor) throws ArithmeticException
    {
        if (divisor==0)
        {
            throw new ArithmeticException("the divisor must be a non zero number");
        }
    }
    ///////////////////////////////////////////////////////////////
    public double divide(int num1,int num2)
    {
        return num1/num2;
    } 
}

